package day13;

public class ChildThread extends Thread {
	
	private int n;
	private String msg;
	
	public ChildThread(int n, String msg) {
		this.n=n;
		this.msg=msg;
	}
	
	@Override
	public void run() {
		for (int i=1; i<=n; i++) {
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				System.err.println("Thread Interrupted: "+e.getMessage());
			}
			System.out.println(msg+i+" "+Thread.currenrThread().getName());
		}
	}
	
	

}
