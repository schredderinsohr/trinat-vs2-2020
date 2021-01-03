package Threads_2_Exercise_6;

import java.time.Instant;
public class Runnable2 implements Runnable {

    private String name;

    public Runnable2(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " " + Instant.now());
    }
}



