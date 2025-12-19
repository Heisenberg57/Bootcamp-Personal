public class CardPayment implements PaymentMethod {

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		System.out.println("Validating Card details...");
		return false;
	}

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Paid ₹" + amount + " using Card");
		
	}

}
