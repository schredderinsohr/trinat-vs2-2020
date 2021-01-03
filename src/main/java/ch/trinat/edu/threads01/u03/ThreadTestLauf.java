package Threads_1_Exercise_3;

public class ThreadTestLauf {

    public static void main(String[] args) {
        Runnable threadJob = new MonRunnable();
        Thread meinThread = new Thread(threadJob);
        meinThread.start();
        try {
            Thread.sleep(5100); //Einfach die Zeit abändern
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("back to main");
    }
}