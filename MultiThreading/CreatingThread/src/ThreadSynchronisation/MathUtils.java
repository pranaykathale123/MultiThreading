package ThreadSynchronisation;

public class MathUtils {

	public void getMultiples(int n) {
		/*
		 * if only set of block is responsible for random output then no need to
		 * synchronised complete method It will take more time to compile/run code and
		 * until thread1 doesn't over thread2 will not get permit to get access for
		 * getMultiples() method always use synchronised block
		 */
		synchronized (this) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
