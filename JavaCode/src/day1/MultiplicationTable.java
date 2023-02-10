package day1;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// print 5 table
		int a = 5;
		
		for (int i = 1; i <= 10; i++) {     // for loop
			System.out.println(a + "*" + i + "=" + (a*i));
		}
		
		System.out.println("*****************");
		
		int b = 7,c = 1;             // while loop
		while (c <= 15) {
			System.out.println(b + "*" + c + "=" + (b*c));
			c++;
		}
		
		System.out.println("*****************");
		
		int d = 9, e = 1;       // do-while loop
		do {
			System.out.println(d + "*" + e + "=" + (e*d));
			e++;
		} while (e <= 20);
		
		System.out.println("*****************");

		// print tables from 1 to 10
		
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println("*****************");
		}
		

	}

}
