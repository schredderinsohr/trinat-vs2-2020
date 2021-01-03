package Threads_2_Exercise_1;

public class MutexThread extends Thread{
    private Semaphore mutex;
    public MutexThread(Semaphore mutex) {
        this.mutex = mutex;
        start();
    }

    public void run() {
        while (true) {
            mutex.p();
            System.out.println("kritischen Abschnitt betreten");
            try {
                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
            System.out.println("kritischer Abschnitt wird " +"verlassen");
            mutex.v();
        }
    }
}

