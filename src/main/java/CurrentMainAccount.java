public class CurrentMainAccount extends MainAccount{
    double overdraftLimit = 5000;

    CurrentMainAccount(String name, int accNo, double bal) {
        super(name, accNo, bal);
    }

    void withdraw(double amount){
        if(amount<=balance+overdraftLimit){
            balance-=amount;
            System.out.println("CurrentAccount withdraw successful. New balance: " + balance);
        } else {
            System.out.println("CurrentAccount: Overdraft limit reached!");
        }

    }
}
