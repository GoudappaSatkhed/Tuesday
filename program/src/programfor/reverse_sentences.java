package programfor;

public class reverse_sentences {
public static void main(String[] args) {
	String str= "hi how are you";
	String[] s1= str.split("");
	for(int i=s1.length-1;i>=0; i--){
//		System.out.print(s1[i]+" " );
		System.out.print(s1[i]+"");
	}
}
}
