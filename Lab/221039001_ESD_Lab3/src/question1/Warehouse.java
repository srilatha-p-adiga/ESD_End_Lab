package question1;

import java.util.*;

public class Warehouse {
	
	private double capacity;
	private double balance;

   
    public Warehouse() {
    	this.capacity = 0.0;
        this.balance = 0.0;
    }

    
    public Warehouse(double capacity) {
        this.capacity = capacity;
        this.balance = capacity;
    }

    public double getBalance() {
        // TODO implement here
        return this.balance;
    }

    public double getCapacity() {
        // TODO implement here
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        // TODO implement here
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        // TODO implement here
    	if(amount < (this.capacity - this.balance))
    		this.balance += amount;
    	else
    		System.out.println("Not enough space ");
        return;
    }

    public double takeFromWarehouse(double amount) {
        // TODO implement here
    	if(amount < this.balance)
    		this.balance = this.balance - amount;
    	else
    		System.out.println("Not enough ");
        return this.balance;
    }

    public String toString() {
        // TODO implement here
        return "warehouse with capacity: " + this.capacity + "Balance: " + this.balance;
    }

}