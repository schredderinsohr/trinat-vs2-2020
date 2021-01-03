package Threads_1_Exercise_7;

public class WorkerSYNC extends Thread {
    Counter7 counter;
    WorkerSYNC(Counter7 counter) {
        this.counter = counter;
    }
    public void run() {
        synchronized(this) {
            System.out.println("Thread " + this.getName() + " started!");
            while (true) {
                for (int i = 0; i <= Counter7.LIMIT; i++)
                    counter.up();
                for (int i = 0; i < Counter7.LIMIT; i++)
                    counter.down();
            }
        }
    }
}