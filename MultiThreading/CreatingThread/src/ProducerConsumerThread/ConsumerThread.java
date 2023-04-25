package ProducerConsumerThread;

import java.util.concurrent.BlockingQueue;

public class ConsumerThread implements Runnable {
	BlockingQueue<Integer> blockingqueue;

	public ConsumerThread(BlockingQueue<Integer> blockingqueue) {
		this.blockingqueue = blockingqueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				int value = blockingqueue.take();
				
				System.out.println("Consumed"+value);
				
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
