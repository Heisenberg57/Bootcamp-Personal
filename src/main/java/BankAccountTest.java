public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bk1 = new BankAccount("Suyog",12345,50000);
        bk1.displayDetails();
        bk1.deposit(2000);
        bk1.withdraw(3000);
        bk1.displayDetails();
    }
}
