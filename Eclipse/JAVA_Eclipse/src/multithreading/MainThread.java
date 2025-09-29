package multithreading;

public class MainThread{

	public static void main(String[] args) {
		ThreadImp ti=new ThreadImp();
		Thread t1=new Thread() {
			public void run(){
				ti.fibnocci();
			}
		};
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t2=new Thread() {
			public void run() {
				ti.primeNums();
			}
		};
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t3 = new Thread() {
			public void run() {
				ti.commonNums();
			}
		};
		t3.start();

		
		

	}

}
