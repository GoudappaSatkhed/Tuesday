package programfor;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1= "cat";
	String s2="act";
	if(s1.length()==s2.length()){
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1,c2)){
			System.out.println("it is Anagram");
		} else { 
			System.out.println(" it os not Anagram");
		}
		
		
	} else {
		System.out.println("it is not Anagram");
	}
	
	
	
	
}
}
