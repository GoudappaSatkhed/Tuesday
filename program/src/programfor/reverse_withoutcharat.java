package programfor;

public class reverse_withoutcharat {
public static void main(String[] args) {
	String str = "java";
	char []ch=str.toCharArray();
	for(int i=ch.length-1; i>=0; i--){
		System.out.print(ch[i]);
		System.out.println(ch[i]);
	}
}
}
