package join_keyword;

public class ThreadJoinIMPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new MyThread(),"Thread1"); 
		Thread t2 = new Thread(new MyThread(),"Thread2"); 
		Thread t3 = new Thread(new MyThread(),"Thread3");
		
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       System.out.println("All threads are finished");
	}

}
