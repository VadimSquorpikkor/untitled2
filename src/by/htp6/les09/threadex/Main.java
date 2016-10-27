package by.htp6.les09.threadex;

public class Main {

	public static void main(String[] args) {
		Thread th1 = new Talking();
		
		Walking w = new Walking();
		Thread th2 = new Thread(w);
		
		
		th1.start();
		th2.start();
		
		System.out.println("in main");

	}

}
