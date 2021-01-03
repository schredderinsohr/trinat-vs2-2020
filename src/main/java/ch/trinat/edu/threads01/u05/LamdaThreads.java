package Threads_1_Exercise_5;

public class LamdaThreads {
    public static void main(String[] args) {

    new Thread(() -> {
        System.out.println("Lambda");
        for (int i = 0; i < 50; i++) {
            String name = Thread.currentThread().getName();
            System.out.println("Thread " + name + " tiene Numéro " + i + " procesado");
        }
    }, "Lambda").start();
}

}


