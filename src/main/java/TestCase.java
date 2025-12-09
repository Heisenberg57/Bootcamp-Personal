package JavaTest;

public class TestCase {
		
		//fields(attributes)
		String testName;
		String testDescription;
		String status;
		
		//Method to execute the test.
		public void run() {
			System.out.println("Running test: "+ testName);
			System.out.println("Description: "+testDescription);
			
			status ="PASS";
			System.out.println("Status: "+status);
		}
		
		

	}


