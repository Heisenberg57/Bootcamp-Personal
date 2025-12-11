package JavaTest;

public class TestCaseAdvanced {
	
	//static counter for auto ID generation.
	private static int counter=1;
	
	//Fields(attributes)
	private String testId;
    private String testName;
    private String testDescription;
    private int steps;
    private boolean expectedResultMatch;
    private String status;
    
    //constructor
    public TestCaseAdvanced(String testName, String testDescription, int steps, boolean expectedResultMatch) {
    	this.testName = testName;
    	this.testDescription = testDescription;
    	this.steps = steps;
    	this.expectedResultMatch = expectedResultMatch;
    	
    	this.testId = "TC-" + counter;
    	counter++;
    }
    
    //Method to execute the test.
    public void run() {
    	System.out.println("========================================");
        System.out.println("Test ID: " + testId);
        System.out.println("Test Name: " + testName);
        System.out.println("Description: " + testDescription);
        System.out.println("Steps Executed: " + steps);

        if (expectedResultMatch) {
            status = "PASS";
        } else {
            status = "FAIL";
        }

        System.out.println("Status: " + status);
        System.out.println("========================================\n");
    }
	
	

}
