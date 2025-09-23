package com.example.shapes;
import com.example.utils.MathUtils;


public class Circle {
	MathUtils pi = new MathUtils();
	//double v = pi.getPI();
	double area;
	public void area(int r) {
		area = (pi.getPI())*r*r;
		System.out.println("The area of circle is "+area);
	}

}
