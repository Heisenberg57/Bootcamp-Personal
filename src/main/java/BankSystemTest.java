public class BankSystemTest {
    public static void main(String[] args) {
        MainAccount mc;

        //Polymorphism

        mc = new SavingsMainAccount("Suyog",101,8000);
        mc.withdraw(3000);
        mc.showDetails();

        //Polymorphism

        mc = new CurrentMainAccount("Valentina",202,5000);
        mc.withdraw(9000);
        mc.showDetails();
    }
}
