package question3;
import java.util.*;

/**
 * 
 */
public class Circle extends Shape {

	private double radius ;
	private final double PI=3.1415926535;
    public Circle() {
    	radius=1.0;
    }

    public void Circle(double radius) {
        // TODO implement here
    	this.radius=radius;
    }

   public  Circle(double radius, String color,boolean filled)
    { super(color,filled);
      this.radius=radius;
    }
   
    
    public double getRadius() {
        
        return this.radius;
    }

    public void setRadius(double radius) {
        // TODO implement here
    	this.radius=radius;
        return ;
    }

    public double getArea() {
        double area=3.143*this.radius*this.radius;
        return area;
    }

    public double getPerimeter() {
        // TODO implement here
    	double pm=2*3.143*this.radius;
        return pm;
    }

   
    public String toString() {
            	String end=super.toString();
    	  return "A Circle with radius= "+radius+", which is a subclass of"+end;
    }

}