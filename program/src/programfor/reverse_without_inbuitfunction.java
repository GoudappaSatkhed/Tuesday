package programfor;

public class reverse_without_inbuitfunction {
public static void main(String[] args) {
	String str ="java";
	char [] ch= str.toCharArray();
	String reverse ="";
	for(char c:ch){
		reverse =c+ reverse;
	}
	System.out.println(reverse);
}
}
