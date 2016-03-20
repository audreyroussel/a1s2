import java.util.Scanner;

public class isPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Phrase ?");
		String phrase = scan.next();
		boolean ans=isPal(phrase);
		System.out.println(ans);
		
	}
	public static boolean isPal(String phrase){
		phrase=phrase.toUpperCase();
		phrase=phrase.replaceAll(" ","");
	    if (phrase.length() == 0 || phrase.length() == 1){
	    	return true;
	    }
	    if (phrase.charAt(0)==phrase.charAt(phrase.length()-1)){
	    	return isPal(phrase.substring(1,phrase.length()-1));
	    }
	    else {
	    	return false;
	    }
	}
	
}
