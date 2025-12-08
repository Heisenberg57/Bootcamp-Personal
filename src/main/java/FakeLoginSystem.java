package JavaTest;

import java.util.Scanner;

public class FakeLoginSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String correctUser = "suyog";
		String correctPass = "test123";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username: ");
		String user = sc.nextLine();
		
	    System.out.println("Enter password: ");
        String pass = sc.nextLine();
        
        if(user.equals(correctUser) && pass.equals(correctPass)) {
        	System.out.println("Login Succesful");
        	
        	System.out.println("Choose environment to run tests: dev/uat/prod");
        	String env = sc.nextLine();
        	
        	switch(env.toLowerCase()) {
        		case "dev":
        			System.out.println("Running smoke tests in DEV environment");
        			break;
        			
        		case "uat":
        			System.out.println("Running smoke tests in UAT environment");
        			break;
        		case "prod":
        			System.out.println("Running smoke tests in PROD environment");
        			break;
        		default:
        			System.out.println("Unknown environment, Exiting");
        			
        			
        	}
        	
        }
        else {
        	System.out.println("Login failed, exiting program");
        }
        
        sc.close();

		
		

	}

}
