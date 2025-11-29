public class AccountTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.balance = 5000;

        savingsAccount.withdraw(2000);
        savingsAccount.withdraw(4000);
    }
}
