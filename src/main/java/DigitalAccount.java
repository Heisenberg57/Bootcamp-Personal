public class DigitalAccount extends AccountBase{
	
	private double maintenanceFee = 500;

	public DigitalAccount(String accountHolder, double balance) {
		super(accountHolder, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateAnnualCharges() {
		// TODO Auto-generated method stub
		return maintenanceFee;
	}
	

}
