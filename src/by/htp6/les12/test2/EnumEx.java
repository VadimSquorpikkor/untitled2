package by.htp6.les12.test2;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Season s;
		
		s = Season.SPRING;
		s.setAverageTemperature(12);
		
		System.out.println(Season.SPRING.getAverageTemperature());
		
		if(s == Season.WINTER){
			
		}
	}

}

class Season{
	public static final Season WINTER = new Season(-10);
	public static final Season SPRING = new Season(10);
	public static final Season SUMMER = new Season(20);
	public static final Season FALL = new Season(8);
	
	private int averageTemperature;	
	
	private Season(){}
	
	private Season(int temp){
		averageTemperature = temp;
	}

	public int getAverageTemperature() {
		return averageTemperature;
	}

	public void setAverageTemperature(int averageTemperature) {
		this.averageTemperature = averageTemperature;
	}
	
	
}
