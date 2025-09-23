package com.example.shapes;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius ");
		int r = sc.nextInt();
		Circle c= new Circle();
		c.area(r);
		sc.close();
	}

}
