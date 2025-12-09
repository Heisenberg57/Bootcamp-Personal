package JavaTest;

public class TestRunnerAdvanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestCaseAdvanced tca1 = new TestCaseAdvanced("LoginTest","Verify Login Flow",3,true);
		TestCaseAdvanced tca2 = new TestCaseAdvanced("SignUpTest","Verify Signup Flow",7,false);
		
		tca1.run();
		tca2.run();
	}

}
