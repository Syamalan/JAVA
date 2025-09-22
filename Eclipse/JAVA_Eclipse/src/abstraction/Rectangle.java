package abstraction;

public class Rectangle extends Shape{
	private int l=12;
	private int b=10;
	public void area() {
		double area = l*b;
		System.out.println("Area of Rectangle is :"+area);
	}

}
