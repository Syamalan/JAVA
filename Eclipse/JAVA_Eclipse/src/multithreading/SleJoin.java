package multithreading;

public class SleJoin extends Thread{
	public void run() {
		for(int i=0;i<30;i=i+2) {
			System.out.print(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	public static void main(String[] args) {
		SleJoin t1= new SleJoin();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SleJoin t2= new SleJoin();
		t2.start();
		SleJoin t3= new SleJoin();
		t3.start();

		

	}

}
