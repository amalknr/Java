package Multithreading;

public class Program3 extends Thread{
	
	public void run() {
		int i=0;
		for(i=0;i<10;i++) {
			try {
				Thread.sleep(4000);
			}
			catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i+" ");
		}
	}

	public static void main(String[] args) {
		// sleep 
		
		Program3 t1=new Program3();
		t1.start();

	}

}
