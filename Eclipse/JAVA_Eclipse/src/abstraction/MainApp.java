package abstraction;

public class MainApp {

	public static void main(String[] args) {
		WashingMachine wm= new WashingMachine("LG",100);
		wm.turnOn();
		Refrigerator r= new Refrigerator("SAMSUNG",50);
		r.turnOn();
		Microwave m= new Microwave("LIB",70);
		m.turnOn();

	}

}
