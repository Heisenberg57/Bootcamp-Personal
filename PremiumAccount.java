public class PremiumAccount extends AccountBase {
	
	private double premiumFee = 1200;
	private double wealthManagementFee = 2000;
	
	public PremiumAccount(String accountHolder, double balance) {
		super(accountHolder,balance);
	}

	@Override
	public double calculateAnnualCharges() {
		// TODO Auto-generated method stub
		return premiumFee + wealthManagementFee;
	}

}
