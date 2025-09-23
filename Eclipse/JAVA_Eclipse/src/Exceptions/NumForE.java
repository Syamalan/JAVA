package Exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumForE {

	public static void main(String[] args)throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string");
		String name = br.readLine();
		try {
			int i = Integer.parseInt(name);
			System.out.println("The integer is "+i);
		}
		catch(NumberFormatException e) {
			System.err.println(e);
		}
		finally {
			System.out.println("Operation Complete");
		}
	}

}
