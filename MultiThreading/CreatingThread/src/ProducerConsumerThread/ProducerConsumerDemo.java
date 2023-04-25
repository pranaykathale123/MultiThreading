package ProducerConsumerThread;


import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;


public class ProducerConsumerDemo {
	public static void main(String[] args) throws InterruptedException {
		BlockingQueue<Integer> blockingqueue = new LinkedBlockingDeque<>(5);
		
		Thread producerThread = new Thread(new ProducerThread(blockingqueue));
		
		Thread consumerThread = new Thread(new ConsumerThread(blockingqueue));
		
		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();
	}

}
