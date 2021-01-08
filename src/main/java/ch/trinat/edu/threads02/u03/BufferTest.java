package Threads_2_Exercise_3;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class BufferTest {
    public static void main(String args[]) {
        try {

            PipedOutputStream pout1 = new PipedOutputStream();
            PipedInputStream pin1 = new PipedInputStream(pout1);
            PipedOutputStream pout2 = new PipedOutputStream();
            PipedInputStream pin2 = new PipedInputStream(pout2);

            ProducerThread prod = new ProducerThread(pout1);
            BufferN Buff = new BufferN(pin1, pout2);
            ConsumerThread cons = new ConsumerThread(pin2);
            /* start threads */
            prod.start();
            Buff.start();
            cons.start();
        } catch (IOException e) {
        }
    }
}


