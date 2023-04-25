package volatile_keyword;

public class VolatileDemo {
	static volatile int SHARED_INT_VALUE = 0;

	public static void main(String[] args) {
		new ObserverThread().start();
		new ActorThread().start();
	}
}
