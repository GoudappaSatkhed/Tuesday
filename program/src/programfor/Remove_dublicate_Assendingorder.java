package programfor;

import java.util.TreeSet;

public class Remove_dublicate_Assendingorder {
public static void main(String[] args) {
 int	arr [] = {1,4,5,4,8,9,6};
 TreeSet s1 = new TreeSet();
 for(int no : arr){
	 s1.add(no);
 }
 System.out.println(s1);
}
}
