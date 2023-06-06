package second_internal;


public class StringThread extends Thread {
private String test;
private int mode=0;

	StringThread(String test, int mode)
	{	this.test=test;
		this.mode=mode;
	}
	
	@Override
		public void run() {
			// TODO Auto-generated method stub
			switch(mode)
			{ case 1: arrangeAlpha();
					  break;
			  case 2: reverse();
			  		  break;
			  case 3: toUpper();
			  		  break;
			}
		}
	
	private void arrangeAlpha()
	{   char temp;
		char[] chArr=test.toCharArray();
		
		//sorting
		for(int i=0;i<test.length()-1;i++)
			for(int j=1;j<test.length()-i;j++)
			{	if(chArr[i]>chArr[j])
				{	temp=chArr[i];
					chArr[i]=chArr[j];
					chArr[j]=temp;
				}		
			}
			
		
		this.test=String.valueOf(chArr);
	}
	
	private void reverse()
	{
		StringBuffer sb = new StringBuffer(test);
		sb.reverse();
		this.test=sb.toString();
	}
	
	private void toUpper()
	{	this.test=test.toUpperCase();
	}
	
	public String getString()
	{
		return this.test;
	}
	
}
