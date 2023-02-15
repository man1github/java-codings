package javademo.mavenproject2;

public class Main {
	//this keyword
	int x;
	
	public Main(int x) {                // constructor 
		this.x = x;
	}

	  public static void main(String[] args) {	  
		  Main obj = new Main(6);
		  System.out.println(obj.x);
	  }
	   
}
