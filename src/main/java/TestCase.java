package JavaTest;

public class TestCase {
		
		//fields(attributes)
		String testName;
		String testDescription;
		int steps;
		boolean expectedResultMatch;
		String status;
		
		//Method to execute the test.
		public void run() {
			System.out.println("Running test: "+ testName);
			System.out.println("Description: "+testDescription);
			System.out.println("Test Execution took these much steps: "+steps);
			
			if(expectedResultMatch) {
				status ="PASS";
			}
			else {
				status="FAIL";
			}

			
			System.out.println("Status: "+status);
		}
		
		

	}


