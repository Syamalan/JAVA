package Interfaces;

public interface Vehicle {
	default void startEngine() {
		System.out.println("Engine Started");
	}

}
