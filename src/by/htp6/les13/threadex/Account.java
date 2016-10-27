package by.htp6.les13.threadex;

public class Account {
	private Integer balance;
	
	public Account(int balance){
		this.balance = balance;
	}

	public void deposit(int amount){
		synchronized (balance) {
			balance = balance + amount;	
		}
		//
		
	}
	
	public void withdraw(int amount){
		balance = balance - amount;
	}
}
