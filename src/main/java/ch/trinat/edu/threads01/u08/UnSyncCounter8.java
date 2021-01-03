package Threads_1_Exercise_8;

public class UnSyncCounter8 {
    public static void main(String... args) {
        Counter8 counter = new Counter8();
        for (int i = 0; i < 10; i++)
            new Worker8(counter).start();
    }
}
