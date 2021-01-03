package Threads_2_Exercise_2;

public class T4 extends Thread{
    private Semaphore[] sems;
    public T4(Semaphore[] sems, String name) {
        super(name);
        this.sems = sems;
        start();
    }
    private void a4() {
        System.out.println("a4");
    }
    public void run() {
        a4();
        sems[2].v();
        sems[1].v();
        sems[4].v();
    }

}
