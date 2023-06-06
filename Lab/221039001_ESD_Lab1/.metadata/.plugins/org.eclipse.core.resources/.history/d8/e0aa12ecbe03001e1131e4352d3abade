package second_internal;

public class testThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringThread s1,s2,s3;
		s1=new StringThread("testString",1);
		s2=new StringThread("testString",2);
		s3=new StringThread("testString",3);
		
		s1.start();
		s2.start();
		s3.start();
		
		try
		{
			s1.join();
			s2.join();
			s3.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("alphabetical order:"+s1.getString());
		System.out.println("\nreverse order:"+s2.getString());
		System.out.println("\nUppercase:"+s3.getString());
		System.out.println("\nMain Exited!!");
	}

}
