package Exceptions;

public class Customer {
	String name;
	String addr;
	int id;
	String phNo;
	Account aDetails;
	
	public Customer(String name, String addr, int id, String phNo,Account aDetails) {
		super();
		this.name = name;
		this.addr = addr;
		this.id = id;
		this.phNo = phNo;
		this.aDetails=aDetails;
	}
	public void disp() {
		System.out.println("Customer Details: "+name+" "+addr+" "+id+" "+phNo+" ");
		aDetails.getAccDetails();
	}
	public Account getAccount(){
		return aDetails;
	}

	public static void main(String[] args) {
		Account apos = new Account("Savings","12345678",10000);
		Customer c1 = new Customer("Syamala","Guntur",65,"9951012595",apos);
		c1.disp();
		try {
		apos.calSI(2,15);
		}
		catch(NegativeBalanceException e) {
			e.printStackTrace();
		}
		Account aneg= new Account("Current","12368965",-100);
		Customer c2 = new Customer("Harika","Guntur",58,"996001786",aneg);
		c2.disp();
		try {
			aneg.calSI(3, 12);
			}
		catch(NegativeBalanceException e) {
				e.printStackTrace();
			}
	
}
}
