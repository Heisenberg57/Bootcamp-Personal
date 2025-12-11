package JavaTest;

public class TestCaseE {
	private static int counter = 1;
	
	private String testId;
	private String testName;
	private String testDescription;
	private int steps;
	private boolean expectedResultMatch;
	private String status;
	
	
	public TestCaseE(String testName, String testDescription, int steps, boolean expectedResultMatch, String status) {
		this.testName=testName;
		this.testDescription=testDescription;
		this.steps=steps;
		this.expectedResultMatch=expectedResultMatch;
		this.status=status;
		
		this.testId="TC-" + counter;
		counter++;
	}
		
		// GETTERS
	    public String getTestId() {
	        return testId;
	    }

	    public String getTestName() {
	        return testName;
	    }

	    public String getTestDescription() {
	        return testDescription;
	    }

	    public int getSteps() {
	        return steps;
	    }

	    public boolean isExpectedResultMatch() {
	        return expectedResultMatch;
	    }

	    public String getStatus() {
	        return status;
	    }
	    
	    
	 // SETTERS
	    public void setTestName(String testName) {
	        this.testName = testName;
	    }

	    public void setTestDescription(String testDescription) {
	        this.testDescription = testDescription;
	    }

	    public void setSteps(int steps) {
	        this.steps = steps;
	    }

	    public void setExpectedResultMatch(boolean expectedResultMatch) {
	        this.expectedResultMatch = expectedResultMatch;
	    }
	    
	 // RUN METHOD
	    public void run() {

	        System.out.println("========================================");
	        System.out.println("Test ID: " + testId);
	        System.out.println("Test Name: " + testName);
	        System.out.println("Description: " + testDescription);
	        System.out.println("Steps: " + steps);

	        if (expectedResultMatch) {
	            status = "PASS";
	        } else {
	            status = "FAIL";
	        }

	        System.out.println("Status: " + status);
	        System.out.println("========================================\n");
	    }

		
		
	}

