package JavaTest;

public class ArrayUtils {
	
	
	public static int sumOfArray(int[] nums) {
		int sum = 0;
		
		for(int n:nums) {
			sum+=n;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] values = {10,20,30,40,50};
		
		int result = sumOfArray(values);
		
		System.out.println("Sum of Array: "+ result);
		
		

	}

}
