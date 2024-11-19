package Multithreading;

public class Program1 extends Thread{
	
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		// Multithreading by extending thread class
		
		Program1 t=new Program1();
		
		t.start();

	}

}
