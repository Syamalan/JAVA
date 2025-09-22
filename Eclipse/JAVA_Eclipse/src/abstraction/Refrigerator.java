package abstraction;

public class Refrigerator extends Appliances {
//	String brand="SAMSUNG";
//	double powCon=100;
//	public void turnOn() {
//		System.out.println("The brand and Power Consumption of Refrigerator are:"+brand+" "+powCon);
//	}
	//passing fields through constrcutor
	public Refrigerator(String brand,double powCon) {
		this.brand=brand;
		this.powCon=powCon;
	}
	public void turnOn() {
		System.out.println("Refrigerator Details:");
		System.out.println(brand+" "+powCon);
		
	}

}
