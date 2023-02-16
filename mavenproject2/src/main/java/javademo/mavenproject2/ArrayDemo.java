package javademo.mavenproject2;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayDemo1();
		
		int[] natural = new int[5];
		natural[0] = 2;
		natural[1] = 3;
		natural[2] = 4;
		natural[3] = 5;
		natural[4] = 6;
		
		for (int i = 0; i < natural.length; i++) {
			System.out.println(natural[i]);
		}
		
		System.out.println("*********************");
		
		for (int j : natural) {
			System.out.println(j);
		}
  		
 	}
	
	public static void ArrayDemo1() {
		
//		String[] color = new String[4]; 
//		color[0]  = "blue";
//		color[1]  = "black";
//		color[2] = "red";
//		color[3] = "green";
		
		String [] color = {"blue", "black", "red", "green"};
		
		System.out.println(Arrays.toString(color));
		
		System.out.println(color[3]);
		System.out.println(color.length);
		
		
		for(String s : color ) {
			System.out.println(s);
		}
		
		int i=0;
		while(i<color.length) {
			System.out.println(color[i]);
			i++;
		}
		
		System.out.println("*********************");

		int j=0;
		do {
			System.out.println(color[j]);
			j++;
		}while(i>color.length);
		
		System.out.println("*********************");

 	 }


}
