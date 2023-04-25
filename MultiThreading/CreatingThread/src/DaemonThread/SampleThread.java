package DaemonThread;

public class SampleThread implements Runnable{
	private String name;
	
	SampleThread(String name){
		this.name = name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method: "+name);
		
	}
	

}
