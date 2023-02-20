package com.array.javabasics;

import org.testng.annotations.Test;

public class ArrayClass1 {
	
  @Test
  public void f() {
	  
	  String[][] student = new String[3][3];
	  student[0][0] = "guru";
	  student[0][1] = "fourth";
	  student[0][2] = "abc";

	  student[1][0] = "ram";
	  student[1][1] = "fifth";
	  student[1][2] = "drc";

	  student[2][0] = "dev";
	  student[2][1] = "third";
	  student[2][2] = "ghj";
	  
	  for(String[] s : student) {
		  for(String ss : s) {
			  System.out.println();
		  }
	  }

  }
}
