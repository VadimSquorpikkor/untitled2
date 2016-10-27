package by.htp6.les05.main;

import by.htp6.les05.main2.*;

public class Main {

	public static void main(String[] args) {
		Man doc = new Doctor();
		
		doc.doInjection();
		
		//Doctor doc2 = new Doctor();
		//doc2.doInjection();
		
		Man[] m = new Man[2];
		m[0] = new Man();
		m[1] = new Doctor();
		
		HeadDoctor hd = new HeadDoctor();
		
		hd.go();
		
	}

}

class Man{
	
	public void doInjection(){
		System.out.println("do man");
	}
	
	public void go(){}
	
	public void a(){}
}





