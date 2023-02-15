package javademo.mavenproject2;

public class Car {
	
	int a = 4;
	
	public boolean statement() {	
		  boolean a = true;
		  boolean b = false;
		  return b; 	
	}
	
	public String name() {
		String a = "benz";
		String b = "bmw";		
		return a + b;
	}
	
	public String color() {
		String a = "black";
		String b = "white", c = a + "-" + b;		
		return c + this.a;		
	}

}
