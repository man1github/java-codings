package com.loop.javabasics;

import java.util.Iterator;

public class Loopdemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// using for loop

		// ascending order 50 to 55
		for (int k = 50; k <= 55; k++) {
			System.out.println("ascending order " + k);
		}

		System.out.println("################");

		// Descending order 55 to 50
		for (int l = 55; l >= 50; l--) {
			System.out.println("descending order " + l);
		}
		
		// print only "uar" using string
		
		String name = "ramu";
		for (int i = name.length()-1; i >= 0; i--) {
			if(i == 2) {
				continue;
			}
			System.out.print(name.charAt(i));
		}

	}

}
