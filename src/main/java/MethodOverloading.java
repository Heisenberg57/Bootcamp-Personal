package JavaTest;

public class MethodOL {
	
	public static int add(int a,int b) {
		System.out.println("Integer Method Called");
		return a+b;
	}
	
	public static double add(double a, double b) {
		System.out.println("Double version called");
		return a+b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intResult = add(10, 20);            // calls int version
        double doubleResult = add(10.5, 20.8);  // calls double version

        System.out.println("Int result = " + intResult);
        System.out.println("Double result = " + doubleResult);

	}

}
