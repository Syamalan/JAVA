package multithreading;

public class ThrMethods extends Thread {
	
	
	public static void main(String[] args) {
		Thread t= new Thread();

		ThrMethods t1= new  ThrMethods();
		ThrMethods t2= new  ThrMethods();
		ThrMethods t3= new  ThrMethods();
		t1.start();
		t2.start();
		t3.start();
		t3.setName("Third");
		System.out.println("t1 priority:"+t1.getPriority());
		System.out.println("t2 Name:"+t2.getName());
		System.out.println("t3 Name:" +t3.getName());
		System.out.println("Current Thread is:"+t.currentThread());


		

	}

}
