package AIC;

public class ShapeCre{

		public void createShape(){
			Shape s = new Shape(){
				public void draw(){
					System.out.println("Shape is Drawn");
				}

			};
			s.draw();
		}
		public static void main(String[] args) {
			ShapeCre cre= new ShapeCre();
			cre.createShape();
		}

}
