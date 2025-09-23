package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiTry {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Enter the numbers");
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			try {
			System.out.println("This is first nested try");
			int div = a/b;
			System.out.println("The value of divison "+div);
			}
			catch(ArithmeticException e){
				System.err.println(e);
			
			}
			try {
				System.out.println("This is Second nested Try");
				int[] arr=new int[5];
				System.out.println("The value of element in array is"+arr[5]);
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.err.println(e);
				
			}
			
		}
		catch(Exception e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Operation Complete");
		}
	}

}
