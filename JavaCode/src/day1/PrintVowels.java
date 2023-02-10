package day1;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "we are in a competitive world";
		
		for (int i = 0; i < word.length(); i++) {			
			char vowels = word.charAt(i);
			
			switch(vowels){
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				
		    System.out.print(vowels);
			}	
		}
		
	}
}
