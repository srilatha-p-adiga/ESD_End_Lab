package assignment2;

public class Clock {
	//instance variables
	private int hour;
	private int minute;
	private int second;
	
	//parameterized constructor
	Clock(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//constructor
	Clock(){
		this(0,0,0);
	}
	
	//methods
	public boolean validateTime() {
		if(hour>=0 && hour<24 && minute>=0 && minute<60 && second>=0 && second<60)
			return true;
		else
			return false;
	}
	
	public String getTimeMode() {
		if(hour>=0 && hour<12)
			return "AM";
		else
			return "PM";
	}
	
	@Override
    public boolean equals(Object obj) {
    	if (obj == null) return false;

    	Clock that = (Clock) obj;
    	return (this == that ||
    	        this.hour == that.hour && this.minute == that.minute && this.second == that.second);
    }
	
	
}
