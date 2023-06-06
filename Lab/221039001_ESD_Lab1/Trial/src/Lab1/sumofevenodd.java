package Lab1;
import java.util.Scanner;

public class sumofevenodd {
    public static void main(String[] args) 
    {
        int n, sumE = 0, sumO = 0;int nE=0,nO=0;float avge,avgo;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
                nE++;
            }
            else
            {
                sumO = sumO + a[i];
                nO++;
            }
        }
        avge=sumE/nE;
        avgo=sumO/nO;
        System.out.println("Sum of Even Numbers:"+sumE);
        System.out.println("Average of Even Numbers:"+avge);
        System.out.println("Sum of Odd Numbers:"+sumO);
        System.out.println("Average of Odd Numbers:"+avgo);
    }
}
