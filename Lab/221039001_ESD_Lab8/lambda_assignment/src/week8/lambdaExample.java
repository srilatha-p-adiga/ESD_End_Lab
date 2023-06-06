package week8;

interface func1{
	int factorial(int n);
	
}

interface func2{
	void ischar(char ch);
}

interface func3{
	void isprime(int p);
}

interface func4{
	void isleap(int year);
}

interface func5{
	void printpattern(int row);
}

public class lambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func1 f=(n)->{
			int res=1;
			for(int i=n;i>0;i--)
				res=res*i;
			return res;
		};
		System.out.println("Factorial of 5 is " + f.factorial(5));
		
		func2 f2=(ch)->{
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				System.out.println("It is a character");
			else if(ch >= '0' && ch <= '9')
				System.out.println("It is a digit");
			else
				System.out.println("It is a special character");
		};
		System.out.println("------------------------------------------------");
		f2.ischar('a');
		f2.ischar('@');
		
		func3 f3=(p)->{
			int flag = 0;
			 if (p == 0 || p == 1)
				    flag = 1;

				  for (int i = 2; i <= p / 2; ++i) {

				    // if n is divisible by i, then n is not prime
				    // change flag to 1 for non-prime number
				    if (p % i == 0) {
				      flag = 1;
				      break;
				    }
				  }
				  
				  if (flag == 0)
					   System.out.println("Is a prime Number");
					  else
						  System.out.println("Is not  a prime Number");
		};
		System.out.println("------------------------------------------------");
		f3.isprime(5);
		f3.isprime(6);
	
		func4 f4=(year)->{
			if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0))
				System.out.println("Is a Leap year");
			else
		    	System.out.println("Is not  a Leap year");
		};
		
		System.out.println("------------------------------------------------");
		f4.isleap(2012);
		
		func5 f5=(row)->{
			  for (int i = 1; i <= row; i++)
		        {
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(i + " ");
		            }
		            System.out.println();
		        }
		};
		System.out.println("------------------------------------------------");
		f5.printpattern(5);
	}
}
