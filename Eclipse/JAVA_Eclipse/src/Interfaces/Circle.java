package Interfaces;

public class Circle implements Shape,Colorful{
	private int r;

	Circle(int r){
		this.r=r;
	}

	@Override
	public void fillColor() {
		System.out.println("colorfilled");
	}

	@Override
	public void draw() {
		System.out.println("Drawn Circle");
	}

	@Override
	public void calculateArea() {
		double area= 3.14*r*r;
		System.out.println("Area of Circle is : "+area);
	}
	

}
