package ProducerConsumerThread;

import java.util.concurrent.BlockingQueue;

public class ProducerThread implements Runnable {
	BlockingQueue<Integer> blockingqueue;

	public ProducerThread(BlockingQueue<Integer> blockingqueue) {
		this.blockingqueue = blockingqueue;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			int value=0;
			while(true) {
				blockingqueue.put(value);
				System.out.println("produced"+value);
				value++;
				Thread.sleep(1000);
				
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	

}
