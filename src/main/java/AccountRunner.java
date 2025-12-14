public class AccountRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildSavingsAccount sa = new ChildSavingsAccount("Suyog", 5000, 0.05);
		ChildCurrentAccount ca = new ChildCurrentAccount("Valentina",8000,3000);
		
		 System.out.println("=== Savings Account ===");
	     sa.printDetails();
	     sa.applyInterest();
	      

	     System.out.println("\n=== Current Account ===");
	     ca.printDetails();
	     ca.deposit(2000);

	}

}
