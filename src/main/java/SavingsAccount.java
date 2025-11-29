public class SavingsAccount extends Account{

    @Override
    void withdraw(double amount){
        if (amount<=balance){
            balance -= amount;
            System.out.println("Savings withdraw successful. New balance: " + balance);
        }
        else {
            System.out.println("Insufficient balance in savings account!");
        }
    }
}
