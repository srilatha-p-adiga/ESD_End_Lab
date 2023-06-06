package week6;

public class Row1Thread extends Thread {
	private int[][] a;
	private int i,m;
	private static int id,res=0;
	
	public Row1Thread(int i,int id,int m,int[][] a) {
		Row1Thread.id=id;
		this.i=i;
		this.m=m;
		this.a=a;
	}
	
	@Override
	public void run() 
	{ System.out.println("Thread - "+id+" is Calculating the sum of row - "+i);
		for(int i=0;i<1;i++) {
			for(int j=0;j<m;j++) {
				res+=a[i][j];
			}
		}
	}
	
	public static int getResult() {
		return res;
	}
}
