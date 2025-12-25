public class AbstractRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountBase acc1 = new DigitalAccount("Suyog", 6000);
		AccountBase acc2 = new DigitalAccount("NSK", 15000);
		
		System.out.println("=== Digital Account ===");
	    acc1.printDetails();
	    System.out.println("Annual Charges: " + acc1.calculateAnnualCharges());

	}

}
