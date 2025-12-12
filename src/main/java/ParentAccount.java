public class ParentAccount {
	
	protected String accountHolder;
	protected double balance;
	
	public ParentAccount(String accountHolder,double balance) {
		this.accountHolder = accountHolder;
		this.balance = balance;		
	}
	
	public void printDetails() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Balance: " + balance);
	}
	
	public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
	
}
