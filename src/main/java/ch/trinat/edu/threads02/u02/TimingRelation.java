package Threads_2_Exercise_2;

import javax.print.DocFlavor;

public class TimingRelation {
    public static void  main (String[] args) {
        Semaphore[] sems = new Semaphore[6];
        for (int i = 0; i< sems.length; i++){
            sems[i] = new Semaphore(0);

        }
        new T1 (sems, "T1");
        new T2 (sems, "T1");
        new T3 (sems, "T3");
        new T4 (sems, "T4");
        new T5 (sems, "T5");

    }

}



