package JavaTest;

import java.util.Scanner;

public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Seconds");
		
		int totalSeconds = sc.nextInt();
		
		int hours = totalSeconds / 3600;
		int minutes = (totalSeconds % 3600)/60;
		int seconds = totalSeconds % 60;
		
		System.out.println("Converted Time: " 
                 + hours + "h " 
                 + minutes + "m " 
                 + seconds + "s");
		 
		sc.close();

		
		
		

	}

}
