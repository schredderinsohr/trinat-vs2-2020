package Threads_1_Exercise_9;

public class StartStooopThread {
    public static void main(String[] args) {
        StoopThread st = new StoopThread();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
        System.out.print("Pause");
        st.StoopThread();
        System.out.print("Finito");
    }
}
