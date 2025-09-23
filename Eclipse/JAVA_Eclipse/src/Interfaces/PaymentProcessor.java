package Interfaces;

public class PaymentProcessor {

	public static void main(String[] args) {
		Payment p =new CreditCardPayment();//here we are not creating instance for payment we are just referring it.i,e Dynamic Binding/RTP 
		p.pay();
		Payment q= new PaypalPayment();
		q.pay();
	}

}
