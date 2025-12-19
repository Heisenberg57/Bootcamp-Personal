public class PaymentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentMethod payment;

        payment = new UpiPayment();
        processPayment(payment, 500);

        System.out.println();

        payment = new CardPayment();
        processPayment(payment, 500);

	}
	
	public static void processPayment(PaymentMethod payment, double amount) {
		if(payment.validate()) {
			payment.pay(amount);
		}
		else {
			 System.out.println("Payment validation failed!");
		}
	}

}
