package day1;

public class FibonacciSeries {

	public static void main(String[] args) {

		// Fibonacci Series is a series of numbers in which the next number is the sum of the previous two numbers.
		// for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc

		int num1 = 2, num2 = 3;
		int fibonacciseries = 5;

		for (int i = 1; i <= fibonacciseries; i++) {
			System.out.print(num1 + "  ");
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		}
		System.out.println();
		System.out.println("**********");
		
//		
//		int j = 0;      // while condidtion
//		while (j < fibonacciseries) {
//			System.out.print(num1 + "  ");
//			int nextnum = num1 + num2;
//			num1 = num2;
//			num2 = nextnum;
//			j++;
//		}
//
//		int k = 0;        // do while condidtion
//		do {
//			System.out.print(num1 + "  ");
//			int nextnum = num1 + num2;
//			num1 = num2;
//			num2 = nextnum;
//			k++;
//
//		} while (k < fibonacciseries);
//		 
		
		// print fibonacci series upto 100.
		

//		int num1 = 2, num2 = 3;
//		int fibonacciseries = 100;
//
//		do {
//			System.out.print(num1 + "  ");
//			int nextnum = num1 + num2;
//			num1 = num2;
//			num2 = nextnum;
//		} while (num1<fibonacciseries);
		
		
		// fibonacci series upto 100
		
//		while(num1<fibonacciseries) {
//			System.out.print(num1 + "  ");
//			int nextnum = num1 + num2;
//			num1 = num2;
//			num2 = nextnum;
//		}
		
	}

}
