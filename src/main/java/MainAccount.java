public class MainAccount {
    String holderName;
    int accountNumber;
    double balance;

    MainAccount(String name,int accNo, double bal){
        this.holderName = name;
        this.accountNumber = accNo;
        this.balance = bal;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println(amount + " deposited. New balance: " + balance);
    }

    //Will be overridden.
    void withdraw(double amount){
        System.out.println("Generic withdraw from main account");
    }

    void showDetails(){
        System.out.println(holderName + " | Acc: " + accountNumber + " | Bal: " + balance);
    }
}
