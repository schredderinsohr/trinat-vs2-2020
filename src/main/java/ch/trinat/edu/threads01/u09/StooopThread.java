package Threads_1_Exercise_9;

class StoopThread extends Thread {
    private boolean stopped = false;
    public void StoopThread() {
        start();
    }
    public synchronized void stoopThread() {
        stopped = true;
    }
    public synchronized boolean isStopped() {
        return stopped;
    }
    public void run() {
        int i = 0 ;
        while (!isStopped()){
            i++;
            System.out.println("Hello World (" + i +")");
        }
        System.out.print("Thread stoooops now");
    }

}