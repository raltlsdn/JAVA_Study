package study.d200610;

public class Account {
	private int balance;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	public void setBalance(int put) {
		if (put < Account.MIN_BALANCE || put > MAX_BALANCE) {
			return;
		}
		this.balance = put;
	}
	
	public int getBalance() {
		return balance;
	}
}
