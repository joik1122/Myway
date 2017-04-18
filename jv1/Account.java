package sys;

public class Account {
	
	private String owner;
	private long balance;
	
	public Account(String own, long bal) {
		this.owner = own;
		this.balance = bal;
	}
	
	void setter(String str) {
		this.owner = str;
	}
	void setter(long num) {
		this.balance = num;
	}
	
	String getterOwn() {
		return owner;
	}
	long getterBal() {
		return balance;
	}
	
	public long deposit(long amount) {
		this.balance += amount;
		return this.balance;
	}
	
	public long withdraw(long amount) {
		this.balance -= amount;
		return this.balance;
	}
	
	public static void main(String[] args) {
		
		Account person = new Account("¿Ã±§øÏ", 6900000);
		person.withdraw(100000);
		person.deposit(200000);
		System.out.println("¿‹±› : " + person.balance);
		
	}
}
