package by.htp6.les12.test3;

public class EnumEX2 {

	public static void main(String[] args) {
		Season s;
		s = Season.SPRING;
		
		s.setAverageTemperature(12);
		
		if(s == Season.WINTER){}

	}

}

enum Season{
	
	WINTER(-10), SPRING(10, "uhiuhi", 0), SUMMER, FALL;
	
	private int averageTemperature;
	
	Season(){}
	
	Season(int t){
		averageTemperature = t;
	}
	
	Season(int t, String s, long r){
		averageTemperature = t;
	}

	public int getAverageTemperature() {
		return averageTemperature;
	}

	public void setAverageTemperature(int averageTemperature) {
		this.averageTemperature = averageTemperature;
	}	
	
	public static void m(){
		
		WINTER.setAverageTemperature(33);
		
	}
	
}