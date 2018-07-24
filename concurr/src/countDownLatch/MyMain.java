package countDownLatch;

import java.util.concurrent.CountDownLatch;

public class MyMain {
	public static void main(String[] args) throws InterruptedException {
		//Decrementer 三次调用 countDown() 之后，等待中的 Waiter 才会从 await() 调用中释放出来。
		CountDownLatch latch = new CountDownLatch(3);
		 
		Waiter waiter = new Waiter(latch);
		Decrementer decrementer = new Decrementer(latch);
		Decrementer2 decrementer2 = new Decrementer2(latch);
		 
		new Thread(waiter).start();
		new Thread(decrementer).start();
		new Thread(decrementer2).start();
		 
		Thread.sleep(4000);

	}
}
