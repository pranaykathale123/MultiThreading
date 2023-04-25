package DeadLock;

public class Thread2 implements Runnable {
	private Class1 obj1;
	private Class2 obj2;
	
	
	
	public Thread2(Class1 obj1, Class2 obj2) {
		this.obj1 = obj1;
		this.obj2 = obj2;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(obj1) {
			System.out.println("Thread2 got lock on obj1, waiting to get lock on obj2");
			synchronized (obj2) {
				System.out.println("Thread1 got lock on obj2, also");
			}
		}
	}
	
	
}
