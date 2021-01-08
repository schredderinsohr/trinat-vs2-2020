package Threads_2_Exercise_3;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ConsumerThread extends Thread {
    private double oldx = 0;
    private DataInputStream in;
    private static final double THRESHOLD = 0.01;

    public ConsumerThread(InputStream is) {
        in = new DataInputStream(is);
    }
    public void run() {
        for (;;) {
            try {
                double x = in.readDouble();
                if (Math.abs(x - oldx) > THRESHOLD) {
                    System.out.println(x);
                    oldx = x;
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}