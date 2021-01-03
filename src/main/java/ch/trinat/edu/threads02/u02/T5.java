package Threads_2_Exercise_2;

public class T5 extends Thread{

    private Semaphore[] sems;
    public T5(Semaphore[] sems, String name) {
        super(name);
        this.sems = sems;
        start();
    }
    private void a5() {
        System.out.println("a5");
    }
    public void run() {
        a5();
        sems[3].v();
        sems[4].v();
        sems[5].v();
    }

}