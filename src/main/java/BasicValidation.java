package JavaTest;

public class BasicValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String username = "admin";
		String password = "admin123";
		
		if(username.equals("admin") && password.equals("admin13")){
			System.out.println("Login Succesfull");
		}
		else {
			System.out.println("Invalid Credentials");
		}

	}

}
