package by.htp6.les13.threadex;

public class OperatorWithDraw implements Runnable {
	private Account account;
	private Object obj;

	public  OperatorWithDraw(Account account, Object obj) {
		this.obj = obj;
		this.account = account;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			synchronized (obj) {
				account.withdraw(50);
			}
		}

	}

}
