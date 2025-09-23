package Interfaces;

public class PaypalPayment implements Payment{

	@Override
	public void pay() {
		System.out.println("Payment done through Paypal");
	}

}
