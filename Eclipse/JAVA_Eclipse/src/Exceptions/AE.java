package Exceptions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AE {

	public static void main(String[] args) {
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Numbers: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			int div = a/b;
			System.out.println("The value of divison "+div);
		}
		catch(ArithmeticException e){
			System.err.println(e);
			
		}
		finally {
			System.out.println("Arithmetic Operation Completed");
		}
		
;
		

	}

}
