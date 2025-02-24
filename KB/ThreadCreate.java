package KB;

class single implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			try{
				Thread.sleep(5000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}
public class ThreadCreate {

	public static void main(String[] args) {
		
		single m1=new single();
		Thread t1=new Thread(m1);
		t1.start();

	}

}
