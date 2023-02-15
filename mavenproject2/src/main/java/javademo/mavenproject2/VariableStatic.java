package javademo.mavenproject2;

public class VariableStatic {

	// static for memory management
	int x = 1;
	static int y = 1;     

	public void increment() {

		x++;
		y++;
		System.out.println(x + " " + y);
	}
	
	public static void name() {              //static method
		System.out.println("manoj");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		name();
		
		VariableStatic obj = new VariableStatic();
		obj.increment();
		obj.increment();
		System.out.println("*******************");

		VariableStatic obj1 = new VariableStatic(); // static Variable value continues
		obj1.increment();
		obj1.increment();
	}

}
