package Exceptions;

public class NullPE {

	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println("The length of string is "+name.length());
		}
		catch(NullPointerException e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Operation Complete");
		}
	}

}
