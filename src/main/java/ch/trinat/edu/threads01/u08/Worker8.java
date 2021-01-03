package Threads_1_Exercise_8;

public class Worker8 extends Thread {
    Counter8 counter;
    Worker8(Counter8 counter) {
        this.counter = counter;
    }
    public void run() {
        System.out.println("Thread " + this.getName() + " started!");
        while (true) {
            for (int i = 0; i <= Counter8.LIMIT; i++)
                counter.up();
            for (int i = 0; i < Counter8.LIMIT; i++)
                counter.down();
        }
    }
}