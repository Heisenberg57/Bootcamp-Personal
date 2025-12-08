package JavaTest;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("===BASIC CALCULATOR===");
		System.out.println("Enter First Number");
		double num1 =  sc.nextInt();
		
		System.out.println("Enter Second Number");
		double num2 = sc.nextInt();
		
		System.out.println("Choose Operation (+,-,*,/,%)");
		char op = sc.next().charAt(0);
		
		double result = 0;
		boolean validOp = true;
		
		switch(op) {
			case '+':
				result = num1+num2;
				break;
			case '-':
				result = num1-num2;
				break;
			case '*':
				result = num1*num2;
				break;	
				
			case '/':
				if(num2 == 0) {
					System.out.println("Cannot divide by zero");
					validOp = false;
				}
				else {
					result = num1/num2;
				}
				break;
			
			case '%':
				if(num2 == 0) {
					System.out.println("Modulus by Zero not allowed");
					validOp = false;
				}
				else {
					result = num1 % num2;
				}
				break;
				
			default:
				System.out.println("Invalid operator selected");
				validOp = false;
				
				
		}
		
		if (validOp) {
			System.out.println("Result: " + result);
		}
		
		sc.close();
		

		
	}

}
