package DaemonThread;

public class DaemonIMPL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new SampleThread("thread1"));
		Thread t2 = new Thread(new SampleThread("thread2"));
		Thread t3 = new Thread(new SampleThread("thread3"));
		
		System.out.println("Thread1 priority: "+t1.getPriority());
		System.out.println("Thread2 priority: "+t2.getPriority());
		System.out.println("Thread3 priority: "+t3.getPriority());
		//5 is the default priority value in java 
		
		t1.setPriority(3);
		t2.setPriority(6);
		t3.setPriority(9);
		
		System.out.println("new priority Thread1 : "+t1.getPriority());
		System.out.println("new priority Thread2 : "+t2.getPriority());
		System.out.println("new priority Thread3 : "+t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("Currenlt Running Thread: "+Thread.currentThread().getName());
		
		System.out.println("Main thread Priority: "+Thread.currentThread().getPriority());
		
		t1.setDaemon(true);
		System.out.println("new thread1 priority after making it daemon: "+t1.getPriority());
		

	}

}
