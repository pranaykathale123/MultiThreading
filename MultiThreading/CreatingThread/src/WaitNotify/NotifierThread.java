package WaitNotify;

public class NotifierThread implements Runnable {
    Integer value;
    public NotifierThread(Integer value) {
    	this.value = value;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (value) {
			try {
				Thread.sleep(1000);
				System.out.println("Now Notifier Thread begins notifying the waiting Threads...");
				value.notify();
				System.out.println("Notifier Thread finished Notifying the waiting threads..");
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
