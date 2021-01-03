package Threads_1_Exercise_10;

public class StartStooopThreadbyInterrupt {
    public static void main(String[] args) {
        StoopThreadbyInterrupt st = new StoopThreadbyInterrupt();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {

        }
        st.interrupt();
        try{
            st.join();
        } catch (InterruptedException e){

        }
        System.out.print("Main Finito");


    }
}
