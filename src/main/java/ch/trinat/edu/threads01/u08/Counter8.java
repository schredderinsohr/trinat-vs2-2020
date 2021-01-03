package Threads_1_Exercise_8;

class Counter8 {
    private int count = 0;
    public final static int LIMIT = 5;
    synchronized void up() {
        if (count < LIMIT)
            count++;
        if (count > LIMIT)
            System.out.println("counter overflow: " + count);
    }
    synchronized void down() {
        if (count
                > 0)
            count--;
        if (count < 0)
            System.out.println("counter underrun: " + count);
    }
}
