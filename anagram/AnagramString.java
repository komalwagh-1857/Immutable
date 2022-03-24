package anagram;

import java.util.Arrays;

public class AnagramString {
public static void main(String[] args) {
	String s1="dusty";
	String s2="study";
	s1=s1.toLowerCase();
	s2=s2.toUpperCase();
	
	if(s1.length()==s2.length()) 
	{
	char[] array1=s1.toCharArray();	
	char[] array2=s2.toCharArray();	
	
	Arrays.sort(array1);
	Arrays.sort(array2);
	
	if(Arrays.equals(array1,array2)) 
	{
		System.out.println("Given String is Anagram");
		
	}
	else {
		System.out.println("Given String is anagram");
	}
	
	}
  }
}



