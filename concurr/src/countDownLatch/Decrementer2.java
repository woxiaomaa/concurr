package countDownLatch;

import java.util.concurrent.CountDownLatch;

/**
 * Created by mh on 2018/7/24.
 */
public class Decrementer2 implements Runnable{
    CountDownLatch latch = null;

    public Decrementer2(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(2);
        latch.countDown();
    }
}
