
package week8;
import java.util.Arrays;

public class q7 {
public static void main(String[] args) {

Runnable r1 = ()->{

	int temp;
	int arr[] = {7, 23, 6, 87, 34, 56, 2, 100, 54 , 21};
	
	int[] arr2=arr; 
	for (int i=0; i<arr.length-1;i++) {

		for(int j=i+1;j<arr.length;j++) {

			if(arr[j]<arr[i]) {

				temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
			}
		}
	}
    
	for (int i=0; i<arr.length;i++) {
		System.out.println(arr[i]);
	}
 };

Runnable r2 = ()->{

	 String str = "srilatha";

	    
	    char array[] = str.toCharArray();

	    Arrays.sort(array);
	   
	    str = new String(array);
	    System.out.println(str);
	    
};

Thread t1 = new Thread(r1);
Thread t2 = new Thread(r2);

t1.start();
t2.start();
try {

	t2.join();
	t1.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
  }
 }
}
