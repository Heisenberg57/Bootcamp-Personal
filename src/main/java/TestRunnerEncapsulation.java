package JavaTest;

public class TestRunnerE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCaseE tc1 = new TestCaseE("Login Test","Verify Login Works",3,true);
		
		tc1.run();
		
		// Example usage of getters
        System.out.println("Accessing fields via getters:");
        System.out.println("Name: " + tc1.getTestName());
        System.out.println("ID: " + tc1.getTestId());
		

	}

}
