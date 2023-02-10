package day1;

public class CountCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "we are in a competitive field";
		int count = 0;
		
		for(int i =0; i<word.length(); i++) {
			
			if(word.charAt(i) != ' ') {
				count++;
			}
			
	     }
		System.out.println("total characters present in the string " + count);
		

	}

}
