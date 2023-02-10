package day1;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5,b = 6,c, d, e, f, g;
		c = a + b;
		d = a - 3;
		e = b * c;
		f = b / 3;
		g = a % 2;
		
		float h = 7, i;  // 7 deciaml digits
		i = h/4;
		h +=5;   // compound assignment                        
		
		System.out.println("the value of c is " + c );
		System.out.println("the value of d is " + d );
		System.out.println("the value of e is " + e );
		System.out.println("the value of f is " + f );
		System.out.println("the value of g is " + g );
		System.out.println("the value of i is " + i + " and " + "the value of h is " + h );
		
		d = ++a;  //pre increment
		System.out.println("the value of d is " + d );
		
		System.out.println("***********");

		c = a++;   //post increment 
		
		d = ++a;   //pre increment 
		
		System.out.println("the value of c is " + c );
		System.out.println("the value of d is " + d );
	
		System.out.println("***********");

		byte z = 121;   // max 127
		z  += 5;
		System.out.println("value of z is " + z);
		
		short y = 500;    //limit 32767
		y *= 5;
		System.out.println("the value of y is " + y);
		
		double x;       // 15 decimal digits
		x = 5.5 + 5.6;
		System.out.println("using double,x is " + x);
		
		long w;
		w = 9876543210l + 44;
	    System.out.println(w);
	    
	    int j = 3, k = 4, l;
	    l = j + k + j++ + k++ + ++j + ++k;
	    
	    System.out.println(l);

	}

}
