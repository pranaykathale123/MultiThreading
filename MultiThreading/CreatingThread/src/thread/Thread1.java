package thread;

public class Thread1 extends Thread {
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Thread 2 Started");
		}catch(Exception e ) {
			System.out.println(e.getMessage());
		}
		
	}
}
