package question3;
import java.util.*;

public class Rectangle extends Shape {
	
	 private double width ;
	 private double length ;
    public Rectangle() {
    	width = 1.0;
   	  length = 1.0;
    }
    
    public  Rectangle(double width, double length) {
     
    	this.width=width;
    	this.length=length;
    	
    }

    public  Rectangle(double width, double length, String color, boolean filled) {
        // TODO implement here
    	super(color,filled);
    	this.width=width;
    	this.length=length;
    	
    	
    }

    public double getWidth() {
        // TODO implement here
        return this.width;
    }

    public void setWidth(double width) {
        // TODO implement here
    	this.width=width;
        return ;
    }

    public double getLength() {
        // TODO implement here
        return this.length;
    }

    
    public void setLength(double length) {
        // TODO implement here
    	this.length=length;
        return ;
    }

    public double getArea() {
        // TODO implement here
    	double area=this.length * this.width;
        return area ;
    }

    public double getPerimeter() {
        // TODO implement here
    	double perimeter=2*(this.length+this.width);
        return perimeter;
    }

    
    public String toString() {
        // TODO implement here
        return "Rectangle with length  "+this.length+"and width "+this.width;
    }

}