public class SavingsMainAccount extends MainAccount{
    SavingsMainAccount(String name, int accNo, double bal){
        super(name,accNo,bal);
    }

    @Override
    void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("SavingsAccount withdraw succesful, New Balance: ");
        }
        else {
            System.out.println("SavingsAccount: Insufficient balance!");
        }
    }
}
