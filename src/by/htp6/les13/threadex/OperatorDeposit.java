package by.htp6.les13.threadex;

public class OperatorDeposit implements Runnable {
	private Account account;
	private Object obj;

	public OperatorDeposit(Account account, Object obj) {
		this.obj = obj;
		this.account = account;
	}

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			synchronized (obj) {
				account.deposit(100);
			}
		}

	}

}
