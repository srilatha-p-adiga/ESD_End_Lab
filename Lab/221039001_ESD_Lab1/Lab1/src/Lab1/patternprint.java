package Lab1;

import java.util.Scanner;

public class patternprint {
	 public static void main(String[] args)
	    {
		 int n;
		    Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number of rows:");
	        n = s.nextInt(); 
	        int rows = n;
	        System.out.println("## Printing the pattern ##");
	        for (int i = 1; i <= rows; i++)
	        {
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(i + " ");
	            }
	            System.out.println();
	        }
	    }

}
