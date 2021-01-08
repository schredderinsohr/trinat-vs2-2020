package Threads_2_Exercise_3;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.Random;

public class ProducerThread extends Thread {
    private DataOutputStream out;
    private Random rand = new Random();
    public ProducerThread(OutputStream os) {
        out = new DataOutputStream(os);
    }
    public void run() {
        while (true) {
            try {
                double num = rand.nextDouble();
                out.writeDouble(num);
                out.flush();
                sleep(Math.abs(rand.nextInt() % 1000));
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
}