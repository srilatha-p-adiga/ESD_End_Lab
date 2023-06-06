package assignment2;

public class ClockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c1 = new Clock();
		assert(c1.validateTime() == true);
		
		Clock c2 = new Clock(12,56,59);
		assert(c2.validateTime() == true);
		assert(c2.getTimeMode() == "PM");
		
		Clock c3 = new Clock(25,6,6);
		assert(c3.validateTime() == false);
		
		Clock c4;
		c4 = c1;
		assert(c4.equals(c1));
	}

}
