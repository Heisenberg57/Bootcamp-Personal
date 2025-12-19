public class CardPayment implements PaymentMethod {

    @Override
    public boolean validate() {
        System.out.println("Validating Card details...");
        return false; // assume invalid card
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Card");
    }
}
