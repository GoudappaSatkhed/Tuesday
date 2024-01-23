package programfor;

import java.util.Set;
import java.util.TreeSet;

public class Panagram {
public static void main(String[] args) {
	String str ="The quick Bown fox jumps Over the lazy dog";
	str=str.toLowerCase();
	Set s1 = new TreeSet();
	for(int i=0; i<str.length(); i++){
		char ch=str.charAt(i);
		if(ch!=''){
			s1.add(ch);
		}
	}
	if(s1.size()==26){
		System.out.println("it is panagram");
	}
 }
}
