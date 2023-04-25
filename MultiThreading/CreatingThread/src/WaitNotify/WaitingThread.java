package WaitNotify;

public class WaitingThread implements Runnable{
    Integer value;
    public WaitingThread(Integer value) {
    	this.value=value;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (value) {
			try {	
				System.out.println("waiting to get a lock");
				value.wait();
				System.out.println("waiting thread received notification by NotifierThread");
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		
	}

}
