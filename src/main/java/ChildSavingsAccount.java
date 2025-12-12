public class ChildSavingsAccount extends ParentAccount {
	
	private double interestRate;

	public ChildSavingsAccount(String accountHolder, double balance,double interestRate) {
		super(accountHolder, balance);
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub
	}
	
	// Child-specific method
    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest applied: " + interest);
    }
    
    

}
