package javademo.mavenproject2;

public class Constructor {
	
	int a,b,c ;

	private Constructor(){             //default Constructor
		this.a = 4;	
	}
	
	public Constructor(int a) {          //parameterized Constructor
		this.a = a;
	}
	
	public Constructor(int a, int b) {           //parameterized Constructor
		this.a = a;
		this.b = b;
		c = a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor obj = new Constructor();
		System.out.println("default Constructor " + obj.a);

		Constructor obj1 = new Constructor(10);
		System.out.println("parameterized Constructor " + obj1.a);
		
		Constructor obj2 = new Constructor(20,30);
		System.out.println("parameterized Constructor " + obj2.c);
	}

}
