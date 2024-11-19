package Multithreading;

public class Program4 extends Thread {
	
	public void run() {
		int i=1;
		for(i=1;i<5;i++) {
			try {
				Thread.sleep(4000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(currentThread().getName());
			System.out.println(currentThread().getId());
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// 
		
		Program4 t1=new Program4();
		Program4 t2=new Program4();
		
		t1.start();
		t2.start();

	}

}
