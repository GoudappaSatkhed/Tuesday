package programfor;

public class ponidromstring_equals {
public static void main(String[] args) {
	String str="appa";
	String reverese ="";
	for(int i=str.length()-1; i>=0;i--){
		reverese= reverese+ str.charAt(i);
	}
	if(str.equals(reverese)){
		System.out.println("it is polindrome");
	} else {
		System.out.println("it is not polidrome");
	}
}
}
