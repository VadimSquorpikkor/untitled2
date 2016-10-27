package by.htp6.les13.threadex;

public class Accountant extends Thread {
	private Account acc;
	
	public void run(){
		acc.deposit(100);
		
	}

}
