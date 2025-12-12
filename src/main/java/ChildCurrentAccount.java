public class ChildCurrentAccount extends ParentAccount{
	private double overdraftLimit;

	public ChildCurrentAccount(String accountHolder, double balance , double overdraftLimit) {
		super(accountHolder, balance);
		this.overdraftLimit = overdraftLimit;
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public void printDetails() {
        super.printDetails();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }

	@Override
	public void deposit(double amount) {
	    System.out.println("Depositing into Current Account with overdraft rules...");
	    super.deposit(amount);
	}

}
