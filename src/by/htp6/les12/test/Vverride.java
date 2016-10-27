package by.htp6.les12.test;

public class Vverride {

	public static void main(String[] args) {
		A a = new B();
		
		a.math();

	}

}


class A{
	
	public void math(){
		System.out.println("a");
	}
}

class B extends A{
	
	public void math(){
		System.out.println("b");
	}
	
	
}