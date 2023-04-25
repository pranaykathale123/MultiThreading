package join_keyword;

public class MyThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running, name of the thread is:"+Thread.currentThread().getName());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread ended name of the thread is: "+Thread.currentThread().getName());
		
	}

}
