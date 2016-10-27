package by.htp6.les02.answ;

import java.util.Date;

public class REturnEx {

	public static void main(String[] args) {
		int x;
		
		x = meth1();
		
		Date d;
		d = meth2();
		
		double s = Math.pow(4, 5);
		
		Student st = new Student();
		
		st.setName("Vasya");

	}
	
	
	public static int meth1(){
		int v = 9;
		v = v+ 1;
		return v;
		
	}
	
	public static  Date meth2(){
		Date d = new Date();
		return d;
		
	}

}
