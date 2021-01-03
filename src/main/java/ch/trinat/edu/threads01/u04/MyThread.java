package Threads_1_Exercise_4;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            String name = Thread.currentThread().getName();
            System.out.println("Thread " + name + " tiene Número " + i + " procesado");
        }
    }
}