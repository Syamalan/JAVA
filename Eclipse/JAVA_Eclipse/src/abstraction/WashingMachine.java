package abstraction;

public class WashingMachine extends Appliances {
//	String brand="LG";
//	double powCon=50;
	
	//With directly giving the values
//	
//	public void turnOn() {
//		System.out.println("The brand and Power Consumption of Washing Machine are:"+brand+" " +powCon);
//	}
	//Passing fields through Constructor
	WashingMachine(String brand,double powCon){
		this.brand=brand;
		this.powCon=powCon;
	}
	
	public void turnOn() {
		System.out.println("Washing Machine Details:");
		System.out.println(brand+" "+powCon);
		
	}

	

}
