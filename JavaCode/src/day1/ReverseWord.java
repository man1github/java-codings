package day1;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tv = "samsung";
		String reverse ="";
		
		for(int i=tv.length()-1; i>=0; i--) {
			reverse = reverse + tv.charAt(i);
		}
		System.out.print(reverse);

	}

}
