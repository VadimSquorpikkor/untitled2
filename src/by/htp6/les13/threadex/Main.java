package by.htp6.les13.threadex;

public class Main {

	public static void main(String[] args) {
		Account acc= new Account(200);
		Object lock = new Object();
		Thread th1 = new Thread(new OperatorDeposit(acc, lock));
		Thread th2 = new Thread(new OperatorWithDraw(acc, lock));
		
		th1.start();
		th2.start();
		
		

	}

}
