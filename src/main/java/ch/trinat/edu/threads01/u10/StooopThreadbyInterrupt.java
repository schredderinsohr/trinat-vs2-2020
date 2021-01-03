package Threads_1_Exercise_10;

class StoopThreadbyInterrupt extends Thread {
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
        int i = 0;
        try {
            while (!isStopped()) {
                i++;
                System.out.println("Hello World (" + i + ")");
                Thread.sleep(3000);
            }
            System.out.print("Thread stoooops now");
        } catch (InterruptedException e){
            System.out.print("Thread Stop");
        }
    }

}