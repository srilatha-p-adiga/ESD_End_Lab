package week7;
import java.util.Random;


public class NumberGenerator {
	    private int number;
	    private boolean valueSet = false;

	    public synchronized void put() {
	        while (valueSet) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        Random random = new Random();
	        number = random.nextInt(10) + 1;
	        System.out.println("Producer produced: " + number);
	        valueSet = true;
	        notify();
	    }

	    public synchronized void take() {
	        while (!valueSet) {
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("Consumer consumed: " + number);
	        valueSet = false;
	        notify();
	   }
}

