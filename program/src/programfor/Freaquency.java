package programfor;

public class Freaquency {
public static void main(String[] args) {
	String str ="abcd";
	int [] arr = new int [123];
	for(int i=0; i<str.length(); i++){
		char ch =str.charAt(i);
		arr[ch]++;
	}
	for (int i=0; i<arr.length;i++){
		if(arr[i]!=0){
			System.out.println((char)i +" " + arr[i]);
		}
	}
}
}
