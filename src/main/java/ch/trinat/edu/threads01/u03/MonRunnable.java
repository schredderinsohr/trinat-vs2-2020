package Threads_1_Exercise_3;

public class MonRunnable implements Runnable {
    @Override
    public void run() {
        los();
    }
    private void los() {
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        tuNochMehr();
    }
    private void tuNochMehr() {
        System.out.println("On top of Stack");
    }
}