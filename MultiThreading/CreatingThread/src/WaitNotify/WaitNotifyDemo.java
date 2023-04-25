package WaitNotify;

public class WaitNotifyDemo {
	public static void main(String[] args) {
		Integer  value = Integer.valueOf(0);
		
		Thread waitingthread = new Thread(new WaitingThread(value));
		waitingthread.start();
		
		Thread notifier = new Thread(new NotifierThread(value));
		notifier.start();
	}
}
