package Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MathUtils {

	public void getMultiples(int n) {
		Lock locker = new ReentrantLock();
		/*
		 * if only set of block is responsible for random output then no need to
		 * synchronised complete method It will take more time to compile/run code and
		 * until thread1 doesn't over thread2 will not get permit to get access for
		 * getMultiples() method always use synchronised block
		 */
		// synchronized (this) {
		try {
			locker.lock();
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} finally {
			locker.unlock();
		}

		// }

	}

}
