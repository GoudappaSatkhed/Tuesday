package programfor;

import java.nio.charset.MalformedInputException;

//public static boolean pali(String str){
//	int i=0;
//	int j=str.length()-1;
//	while(i<j){
//		if(str.charAt(i)!=str.charAt(j)){
//			return false;
//		}
//		i++;
//		j--;
//	}
//	return true;

public class without_equals {
//	public static void main(String[] args) {
//		String x="appa";
//		if(pali(x)){
//			System.out.println("palindrome");
//		} else {
//			System.out.println("not");
//		}
//	}
//}

	static boolean polindrome(char[] ch){
		int i=0;int j=ch.length;
		while (i<j){
			if(ch[i] != ch[j]){
				return false;
			}
			i++;
			j--;
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		String str="level";
		char []ch =str.toCharArray()
;		if(polindrome(ch)){
			System.out.println("palindrom");
		
			} else {
				System.out.println("not palindrome");
		}
		
	}

}

