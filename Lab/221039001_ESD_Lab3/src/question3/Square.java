package question3;
import java.util.*;

public class Square extends Rectangle {
	
    public Square() {
    	super();
    }

   

    public  Square(double side, String color, boolean filled) {
        
    	super(side,side,color,filled);
    
    }

    public  Square(double side) {
        super(side,side);
    }

    public double getSide() {
        // TODO implement here
        return super.getWidth();
    }

    public void setSide(double side) {
    	super.setWidth(side);
    	super.setLength(side);
    }

   
    public void setwidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    public void setLength(double side) {
    	 super.setWidth(side);
         super.setLength(side);
    }

   
    public String toString() {
    	String end=super.toString();
    	 return "A Square with side="+super.getWidth()+", which is a subclass of "+end;
    }

}