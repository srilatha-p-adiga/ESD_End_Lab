package week8;

class FindAverage{

	public void avgnum(int[] arr) {

		double sum=0;

		for (int i=0; i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
		double average=sum/arr.length;
		
		System.out.println("The original list...");

        for (int i=0; i<arr.length;i++) {

            System.out.println(arr[i]);

         }
        System.out.println("The average of the array is  "+ average);
     }
  }

public class q6 {
    static int arr[] = {7, 23, 6, 87, 34, 56, 2, 100, 54 , 21};
    public static void main(String[] args) {

       FindAverage ns = new FindAverage();
       Runnable r1 = ()->{
       System.out.println("Within run()...");
       ns.avgnum(arr);
};

     Thread t1 = new Thread(r1);
     t1.start();
   }
}
