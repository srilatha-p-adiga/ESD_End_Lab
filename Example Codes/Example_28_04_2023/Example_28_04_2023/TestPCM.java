package javathreadproducer;

public class TestPCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator med = new Mediator();
		Producer prod = new Producer(med);
		Consumer con = new Consumer(med);
		con.start();
		prod.start();

	}

}
