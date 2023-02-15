package javademo.mavenproject2;

public class Variable {

	String name = "pulsar";
	String color = "green";
	
	
	public void bike() {
		
		String name  = "yamaha";
		System.out.println(name + this.name + color);
		
	}
	
	public static void main (String[] args) {
		
		Variable obj = new Variable();
		System.out.println(obj.name);
	}
}
