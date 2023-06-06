package question2;
import java.util.*;


public class Person {

	private String name; 
    private String address;

    public Person() {
    	this.name=name;
    	this.address=address;
    }


    public  Person(String name, String address) {
    	this.name=name;
    	this.address=address;
    }

    public String getName() {
        
        return this.name;
    }

    public String getAddress() {
        // TODO implement here
        return this.address;
    }

    public void setAddress(String address) {
        this.address=address;
        return ;
    }

    public String toString() {
        
        return "The name of the person is "+this.getName()+"and the adress is"+this.getAddress();
    }

}