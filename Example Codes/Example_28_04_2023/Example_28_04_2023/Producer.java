package javathreadproducer;

import java.io.PrintWriter;

public class Producer extends Thread {
	
	static PrintWriter out = new PrintWriter(System.out, true);
	Mediator med;
	
	Producer(Mediator med) {
		this.med = med;
	}
	
	public void run() {
	
		for (int i = 0; i < 10; i++) {
			med.put(i);
			out.println("Producer put: " +i);
			try {
				sleep((int)(100.0*Math.random()));
			} catch (InterruptedException ignore) { }
		}
	}

}
