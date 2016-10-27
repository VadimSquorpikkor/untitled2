package by.htp6.les13.enumex;

import java.lang.Enum;

class EnumEx {

	public static void main(String[] args) {
		Day d;
		d = Day.MONDAY;
		
		int x = 0;
		double d1 = 3.14;
		
		
		switch(d){
		case MONDAY: break;
		case SUNDAY: break;
		}
		
		Day.SUNDAY.isWeekend();
		// isWeekend(Day.SUNDAY);
		
		
		Book b1 = new Book();
		Book b2 = new Book();
		
		b1.setTitle("sss");
		// setTitle(b1, "sss");
		
		d = Day.SUNDAY;
		System.out.println(d.ordinal());
		
		String str2 = "MONDAY";
		Day d2 = Day.valueOf(str2);
		
		Day[] mas = Day.values();
		
		for(Day el : mas){
			System.out.println(el);
		}

		X x4 = Day.SUNDAY;
	/*	
		final int x1 = 6;
		final String str;
		str = "aaaa";
		//str = "bbbb";
*/
		
		Day t1 = Day.MONDAY;
		Day t2 = Day.MONDAY;
		
		if(t1 == t2){
			
		}
		
		
		String str5 = "MONDAY";
		
		switch (str5){
		case "MONDAY": break;
		}
		
		if(str5.equals(Day.SUNDAY.toString())){};
	}

}

interface X{}
interface Y{}

/*
class Season{
	public static final Season WINTER = new Season();
	public static final Season SPRING = new Season();
	public static final Season SUMMER = new Season();
	public static final Season FALL = new Season();
	
	
}

*/
enum Day implements X, Y{
	MONDAY{
		public boolean isWeekend(){
			return false;
		}
	}, 
	
	SUNDAY(6){
		public boolean isWeekend(){
			return true;
		}		
	};
	
	Day(){}
	
	Day(int x){}
	
	private String mood;
	
	
	public abstract boolean isWeekend();	
	
}


class Book{
	private String title;
	
	//public void setTitle(Book this, String s)
	public void setTitle(String s){
		this.title = s;
	}
	
	
}
