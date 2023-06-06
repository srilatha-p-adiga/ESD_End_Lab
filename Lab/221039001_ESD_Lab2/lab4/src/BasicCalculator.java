package week4assignment;

public class BasicCalculator implements Calculator {

	int arr[];
	int t;	
	
	public BasicCalculator() {
		// TODO Auto-generated constructor stub
	arr=new int[2];
	int t=0;
	}
	
	@Override
	public Calculator put(int n) {
		// TODO Auto-generated method stub
		arr[t]=n;
		t=(t+1)%2;
		return this;
	}
	
	@Override
	public int read() {
		// TODO Auto-generated method stub
		return arr[0];
	}
	
	
	
	@Override
	public Calculator neg() {
		// TODO Auto-generated method stub
		arr[t]=-arr[t];
		return this;
	}
	
	@Override
	public Calculator add() {
		// TODO Auto-generated method stub
		arr[0]=arr[0]+arr[1];
		return this;
	}
	
	@Override
	public Calculator sub() {
		// TODO Auto-generated method stub
		arr[0]=arr[0]-arr[1];
		return this;
	}
	
	@Override
	public Calculator mul() {
		// TODO Auto-generated method stub
		arr[0]=arr[0]*arr[1];
		return this;
	}
	
	@Override
	public Calculator div() {
		// TODO Auto-generated method stub
		if(arr[1]!=0)
				arr[0]=arr[0]/arr[1];
		return this;
	}
	
	@Override
	public Calculator clear() {
		// TODO Auto-generated method stub
		//clearing the current arr position
		arr[t]=0;
		return this;
	}
	
	@Override
	public Calculator clearAll() {
		// TODO Auto-generated method stub
		arr[0]=arr[1]=0;
		t=0;
		return this;
	}
//object of same class is created and the function belonging to same class is called
	public static Calculator getInstance() {
		BasicCalculator cal=new BasicCalculator();
		cal.clearAll();
		return cal;
	}
}
