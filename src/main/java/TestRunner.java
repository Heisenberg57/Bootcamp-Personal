package JavaTest;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestCase tc1 = new TestCase();
		
		//Set Fields
		tc1.testName = "Login Test";
		tc1.testDescription = "Verify user can login with valid credentials";
		tc1.steps = 3;
		tc1.expectedResultMatch=false;
		
		tc1.run();

	}

}
