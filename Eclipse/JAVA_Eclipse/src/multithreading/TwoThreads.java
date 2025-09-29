package multithreading;

public class TwoThreads extends Thread {
	public void run() {
		while(true) {
		System.out.println("Good Morning");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Welcome");
		}
	}

	public static void main(String[] args) {
		
		TwoThreads t1= new TwoThreads();
		TwoThreads t2= new TwoThreads();
		t1.start();
		t2.start();
	}

}
