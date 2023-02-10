package day1;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// count number of words in paragraph
		
		String para = "Java is a widely used object oriented programming language and software platform that runs on billions of devices, including notebook computers, mobile devices, gaming consoles, medical devices and many others";		
		
		int count = 1;
		
		for(int i=0; i<para.length(); i++) {
			if((para.charAt(i) == ' ') && (para.charAt(i+1) != ' ')) {
				count++;
			}
		}
		System.out.println("number of words in para - " + count);
		
		
	}

}
