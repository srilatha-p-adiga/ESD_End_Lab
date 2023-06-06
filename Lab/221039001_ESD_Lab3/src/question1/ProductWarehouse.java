package question1;

import java.util.*;

public class ProductWarehouse extends Warehouse {
	
	private String name;

    public ProductWarehouse() {
    	
    }


    public ProductWarehouse(String name, double capacity) {
        super(capacity);
    	this.name = name;
    }


    public String getName() {
        // TODO implement here
        return this.name;
    }


    public String setName(String name) {
        // TODO implement here
    	this.name = name;
        return this.name;
    }


    public String toString() {
        // TODO implement here
    	return "Product " + this.name + "warehouse with capacity: " + getCapacity() + "Balance: " + getBalance();
    }

}