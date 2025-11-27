public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    //Constructor
    BankAccount(String name, int number, double bal){
        this.accountHolder = name;
        this.accountNumber = number;
        this.balance = bal;
    }

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        if (amount<=balance){
            balance=balance-amount;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    void displayDetails(){
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: "+ balance);
    }
    }

