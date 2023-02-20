package com.loop.javabasics;

public class Loopdemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no1 = 12345; // get last digit
		int no2 = 12340;
		System.out.println(no1 - no2);

		no2 = 12300; // get last two digit
		System.out.println(no1 - no2);

		System.out.println(no1 / 10); // get first four digit
		System.out.println(no1 / 1000); // get first two digit

		name();
		name1();
		name2();
		reverseInt();
		named3();
		name4();

	}

	public static void name() {

		System.out.println("************");

		int num1 = 12345; // half triangle from right to left downwards
		while (num1 != 0) {
			System.out.println(num1);
			num1 = num1 / 10;
		}
	}

	public static void name1() { // half triangle from left to right downwards
		System.out.println("************");

		int num1 = 12345;
		int div = 10000;
		while (div > 0) {
			System.out.println(num1 / div);
			div = div / 10;
		}
	}

	public static void name2() { // half triangle upward and downward
		System.out.println("****************");

		int num1 = 12345;
		int div = 10000;
		while (div > 0) {
			System.out.println(num1 / div);
			div = div / 10;
		}
		while (num1 != 1) {
			int num2 = 10;
			System.out.println(num1 / num2);
			num1 = num1 / num2;
		}
	}

	public static void reverseInt() { // get 54321, reverse the int 12345
		System.out.println("************");

		int num1 = 12345;
		int num2 = 10;
		int count = 0;
		while (num1 != 0) {
			System.out.print(num1 % num2);
			num1 = num1 / num2;
			count++;
		}
		System.out.println();
		System.out.println("count " + count);

	}

	public static void named3() {  // it can pass multiple variable
		System.out.println("************");

		for (int num1 = -2, num2 = 3; num1 < 0 && num2 > 0; num1++, num2++) {
			System.out.println("num1 is = " + num1 + "num2 is = " + num2);
		}

	}

	public static void name4() { //find the value
		System.out.println("*****************");

		int a = 1;
		int b = 2;
		int c = 3;

		System.out.println(a++ + b++ + ++a + ++b + ++a + b++);
		System.out.println(++a + c++ + b++ + ++b + ++c + a++);
	}
}
