package question3;

public class testshape {

	 public static void main(String[] args) {
		Shape s= new Shape();
		assert(s.getColor()=="red");
		assert(s.isFilled()==true);
		s.setColor("Yellow");
		s.setFilled(true);
		assert(s.getColor()=="Yellow");
		System.out.println(s.toString());
		

		
		Circle c= new Circle();
		assert(c.getRadius()==1.0);

		c= new Circle(2.0,"Red",true);
		System.out.println(c.toString());

	


		Square sq= new Square();
		assert(sq.getWidth()==1);
		assert(sq.getPerimeter()==4);
		

		sq= new Square(4.0,"red",false);
		assert(sq.getWidth()==4);
	
	}

	}
