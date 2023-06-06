package week6;
import java.util.Random;


public class TestThread {
	public static void getArray(int n,int m, int[][] arr) 
	{
		Random random = new Random();
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=random.nextInt(100)+1;
			}
		}
	}
	public static void PrintArray(int n,int m,int[][] arr) {
		System.out.println("Elements in the array: ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void beginTest() throws InterruptedException {
		int res1,res2,res3,totalsum=0,n=3,m=4;
		int[][] arr; arr = new int[n][m];
		TestThread.getArray(n, m, arr);
		TestThread.PrintArray(n, m, arr);
		Thread my_thread1 = new Thread(new Row1Thread(0,1,m,arr));
		my_thread1.start();
		my_thread1.join();
		res1=Row1Thread.getResult();
		Thread my_thread2 = new Thread(new Row2Thread(1,2,m,arr));
		my_thread2.start();
		my_thread2.join();
		res2=Row2Thread.getResult();
		Thread my_thread3 = new Thread(new Row3Thread(2,3,m,arr));
		my_thread3.start();
		my_thread3.join();
		res3=Row3Thread.getResult();
		System.out.println("Main Thread Calculating the total sum: ");
		totalsum= res1+res2+res3;
		System.out.println("Total sum of the elements in the array: "+totalsum);
	}
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		TestThread.beginTest();
	}
}
