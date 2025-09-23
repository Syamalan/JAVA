package AIC;

public class PrinterCre extends Printer {
	public void createPrinter() {
		Printer p =new Printer() {
			@Override
			void printMessage() {
				System.out.println("This is Printer Creator Class");
			}
		};
		p.printMessage();
	}

	public static void main(String[] args) {
		PrinterCre cre = new PrinterCre();
		cre.createPrinter();
	}

	
}
