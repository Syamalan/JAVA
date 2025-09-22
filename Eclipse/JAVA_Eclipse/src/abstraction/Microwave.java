package abstraction;

public class Microwave extends Appliances {
//	String brand="Prestige";
//	double powCon=70;
//	
//	public void turnOn() {
//		System.out.println("The brand and Power Consumption of Microwave are:"+brand+" "+powCon);
//	}
	public Microwave(String brand,double powCon) {
		this.brand=brand;
		this.powCon=powCon;
	}
	public void turnOn() {
		System.out.println("Microwave Details:");
		System.out.println(brand+" " +powCon);
		
	}
}
