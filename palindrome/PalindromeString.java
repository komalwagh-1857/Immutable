package palindrome;

public class PalindromeString {
public static void main(String[] args) {
	String Str="rotor";
	String reverseStr="";
	int Strinlenght=Str.length();
	
		    
		    int strLength = Str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + Str.charAt(i);
		    }

		    if (Str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(Str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(Str + " is not a Palindrome String.");
		    }
     }
}
