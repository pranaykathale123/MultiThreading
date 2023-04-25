package thread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread 1 started");
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
		
	}

}
