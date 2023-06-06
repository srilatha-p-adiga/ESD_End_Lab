package javathreadproducer;

public class Mediator {

	int val;
	boolean available = false;
	
	synchronized int get() {
		while (!available)
		
			try {
			wait();
			} catch (InterruptedException ignore) { }
		
		notify();
		available = false;
		return val;
	}
	
	synchronized void put(int i) {
	
		while (available)
		
			try {
				wait();
			} catch (InterruptedException ignore) { }
		
		notify();
		val = i;
		available = true;
	}
}
