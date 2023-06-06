package javathreadproducer;

import java.io.PrintWriter;

public class Consumer extends Thread {
	
	static PrintWriter out = new PrintWriter(System.out, true);
		
	Mediator med;
		
	Consumer(Mediator med) {
		this.med = med;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			
			out.println("Consumer got: " + med.get());
		
			try {
				sleep((int)(1000.0*Math.random()));
			} catch (InterruptedException ignore) { }
		}
	}

}
