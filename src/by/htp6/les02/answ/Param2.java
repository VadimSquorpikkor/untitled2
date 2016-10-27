package by.htp6.les02.answ;

import java.util.Date;

public class Param2 {

	public static void main(String[] args) {
		//int  x    = 78;
		Date date = new Date();
		Date d1;
		d1 = date;
		
		
		date.setMonth(4);
		
		System.out.println(date.getMonth());
		meth(date);
		
		Integer x = new Integer(34);
		Integer y = new Integer(x);// 1.5

	}
	
	
	private static void meth(Date d){
		d.setMonth(6);
	}

}
