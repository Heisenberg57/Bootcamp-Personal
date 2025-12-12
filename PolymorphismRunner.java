
import java.util.ArrayList;
import java.util.List;

public class PolymorphismRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<ParentAccount> accounts = new ArrayList<>();
		
		accounts.add(new ChildSavingsAccount("Suyog",5000,0.05));
		accounts.add(new ChildCurrentAccount("Valentina",8000,3000));
		
		for(ParentAccount acc:accounts) {
			System.out.println("Account Details");
			acc.printDetails();  
			
			 System.out.println("Depositing 1000...");
	            acc.deposit(1000);  
		}
		

	}

}
