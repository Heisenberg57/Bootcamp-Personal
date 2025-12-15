public abstract class AccountBase {
	
	protected String accountHolder;
	protected double balance;
	
	public AccountBase(String accountHolder, double balance) {
		this.accountHolder=accountHolder;
		this.balance=balance;
	}
	
	//Normal method.
	public void printDetails() {
		System.out.println("Account Holder"+accountHolder);
		System.out.println("Balance"+balance);
	}
	
	public abstract double calculateAnnualCharges();
	
	
	
	

}
