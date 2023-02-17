package com.loop.javabasics;

public class Loopdemo {

	public static void main(String[] args) {

		// for loop
		for (int i = 1; i <= 100; i++) {
			System.out.println(i + " Manoj");
		}

		// while loop
		int i = 1;
		while (i <= 100) {
			System.out.println(i + " ravi");
			i++;
		}

		// do while loop
		int j = 1;
		do {
			System.out.println(j + " ram");
			j++;
		} while (j <= 100);

		// sum of all natural number from 1 to 50
		int sum = 0;
		for (int k = 0; k <= 3; k++) {
			sum += k;
		}
		System.out.println(sum);

	}

}
