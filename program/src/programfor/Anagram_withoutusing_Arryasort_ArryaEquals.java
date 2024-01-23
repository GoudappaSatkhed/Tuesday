package programfor;

public class Anagram_withoutusing_Arryasort_ArryaEquals {
public static void main(String[] args) {
	String s1="abcd";
	String s2 ="dcba";
	Frequency(s1,s2);
}
static boolean Frequency(String s1, String s2){
	int [] arr= new int [123];
	for(int i=0; i<s1.length(); i++){
		char ch =s1.charAt(i);
		arr[ch]++;
	}
	for(int i=0; i<s2.length();i++){
		char ch =s2.charAt(i);
		arr[ch]--;
	}
	for(int i=0;i<arr.length; i++){
		if(arr[i]!=0){
			System.out.println("is not Anagram");
			return false;
		} 
	}
	System.out.println("anagram");
	return true;
}
}
