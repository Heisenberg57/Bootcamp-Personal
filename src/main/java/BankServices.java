public class BankServices {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Suyog",12345,8000);
        BankAccount acc2 = new BankAccount("Valentina",54321,12000);

        System.out.println("-------Before Transaction--------");
        acc1.displayDetails();
        acc2.displayDetails();

        //operations
        acc1.deposit(2000);
        acc1.withdraw(5000);

        acc2.withdraw(3000);
        acc2.deposit(10000);

        System.out.println("------After Transaction------");
        acc1.displayDetails();
        acc2.displayDetails();


    }
}
