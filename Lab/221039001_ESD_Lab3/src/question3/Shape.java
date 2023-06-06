package question3;
import java.util.*;

public class Shape {

	private String color ;
    private boolean filled ;
    
    public Shape() {
    	this.color="red";
    	this.filled=true;
    	}

    
    public Shape(String color, Boolean filled ) {
        // TODO implement here
    	this.color=color;
    	this.filled=filled;
    }

    
    public String getColor() {
        // TODO implement here
        return this.color;
    }

    
    public void setColor(String color) {
        // TODO implement here
    	this.color=color;
        return;
    }

    public boolean isFilled() {
        // TODO implement here
    	if(this.filled)
    		return true;
    	return false;
    }

    public void setFilled(boolean filled) {
        // TODO implement here
    	this.filled=filled;
        return ;
    }

    public String toString() {
        // TODO implement here
    	return "shape  with color: " + this.color + " and filled : " + this.filled;
    }

}