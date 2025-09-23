package Exceptions;

import java.util.Scanner;

public class ArrayExc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		try {
			System.out.println("The value of element in array is"+arr[5]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.err.println(e);
			
		}
		finally {
			System.out.println("Operation Complete");
		}
		
	}

}
