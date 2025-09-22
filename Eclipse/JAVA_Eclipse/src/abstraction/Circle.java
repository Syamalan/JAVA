package abstraction;

public class Circle extends Shape{
	private int r=7;
	public void area() {
		double area=3.14*r*r;
		System.out.println("Area of Circle is :"+area);
	}

}
