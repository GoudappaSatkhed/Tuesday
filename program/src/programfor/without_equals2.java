package programfor;

public class without_equals2 {
	static boolean pali(char[] ch){
		int i=0;
		int j=ch.length-1;
		while(i<j){
			if(ch[i]!=ch[j]){
				return false;
			}
			i++;
			j--;
		}
			return true;
		}
	

	public static void main(String[] args) {
		String str ="level";
		char [] ch= str.toCharArray();
		if(pali(ch)){
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
