package AIC;

public class Greeter{

		public void generateGreeting() {
			Greeting g= new Greeting() {
				@Override
				public void sayHello() {
					System.out.println("Hello..");				
				}
			};
			g.sayHello();
		}
		public static void main(String[] args) {
			Greeter greet= new Greeter();
			greet.generateGreeting();
		}
}


	