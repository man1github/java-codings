package day1;

import java.util.Scanner;

public class CalculatorProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter first number");
			int firstNumber = scanner.nextInt();
			
			System.out.println("enter second number");
			int secondNumber = scanner.nextInt();
			
			int sum = firstNumber + secondNumber;
			System.out.println("sum value is " + sum);
			
			int subraction = firstNumber - secondNumber;
			System.out.println("subraction value is " + subraction); 
			
			int multiplication = firstNumber * secondNumber;
			System.out.println("multiplication value is " + multiplication);
			
			int division = firstNumber / secondNumber;
			System.out.println("division value is " + division);
		}
 	}

}
