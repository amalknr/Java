package Multithreading;

public class Program2 implements Runnable{
	
	public void run() {
		System.out.println("Thread Running");
	}

	public static void main(String[] args) {
		// Multithreading by impimenting runnable Interface
		
		Program2 m1=new Program2();
		Thread t1=new Thread(m1);
		t1.start();

	}

}
