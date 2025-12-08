package JavaTest;

public class ElseIfLadder {
	public static void main(String[] args) {
		String env = "uat";
		
		if(env.equals("dev")) {
			System.out.println("Running Tests in Dev Environment");
		}
		
		else if(env.equals("uat")) {
			System.out.println("Running Tests in UAT environment");
		}
		
		else if(env.equals("prod")) {
			System.out.println("Running Tests in Prod environment");
		}
		
		else {
			System.out.println("Invalid");
		}
	}

}
