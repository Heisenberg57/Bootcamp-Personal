package JavaTest;

public class ResultUtils {
	
	public static String getResult(int marks) {
		
		if(marks>=40) {
			return "PASS";
		}
		else {
			return "FAIL";
		}
	}

	public static int getTotalmarks(int writtenMarks, int oralMarks ) {
		return writtenMarks+oralMarks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int student1 = 85;
		int student2 = 33;
		
		String result1 =  getResult(student1);
		String result2 = getResult(student2);
		
		System.out.println("Student 1: " + result1);
        System.out.println("Student 2: " + result2);

		int totalMarks = getTotalmarks(70,18);
		System.out.println(totalMarks);
		
		
		

	}

}
