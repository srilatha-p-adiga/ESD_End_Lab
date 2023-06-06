package week4assignment;

public class testcalculator {
	public static void testAdd()
	{
		Calculator obj;
		obj=BasicCalculator.getInstance();
		obj.put(8);
		obj.put(5);
		obj.add();
		assert(obj.read()==13);
		
		assert(obj.put(10).add().read()==15);
			
	}
	public static void testSub()
	{
		Calculator obj;
		obj=BasicCalculator.getInstance();
		obj.put(8);
		obj.put(5);
		obj.sub();
		assert(obj.read()==3);
		assert(obj.put(10).put(20).sub().read()==-10);
			
	}
	
	public static void testMultiply()
	{
		Calculator obj;
		obj=BasicCalculator.getInstance();
		obj.put(8);
		obj.put(5);
		obj.mul();
		assert(obj.read()==40);
		
		assert(obj.put(10).put(20).mul().read()==200);
			
	}
	public static void testDiv()
	{
		Calculator obj;
		obj=BasicCalculator.getInstance();
		assert(obj.put(45).put(15).div().read()==3);
	
	}
	
	public static void testNeg()
	{
		Calculator obj;
		obj=BasicCalculator.getInstance();
		assert(obj.put(45).put(55).neg().read()==-45);
		assert(obj.neg().read()==45);
		assert(obj.put(10).put(20).neg().read()==-10);
	}
	
	public static void testclearAll()
	{
		Calculator obj;
		obj=BasicCalculator.getInstance();
		assert(obj.put(45).put(55).clearAll().read()==0);
		assert(obj.read()==0);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	testAdd();
	testclearAll();
	testNeg();
	testclearAll();
	testMultiply();
	testDiv();
	testNeg();
		
	}

}
