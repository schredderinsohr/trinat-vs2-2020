package Threads_1_Exercise_7;

public class UnSyncCounter7 {
    public static void main(String... args) {
        Counter7 counter = new Counter7();
        for (int i = 0; i < 10; i++)
            new WorkerSYNC(counter).start();
    }
}
