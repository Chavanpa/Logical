package pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class class1 {

	public static void main(String[] args) {
		
		String s = "Yash chavan";
		char[] s1=s.toCharArray();
		List<Character> s2=new ArrayList<>();
		for(char d:s1) {
			s2.add(d);
			Collections.reverse(s2);
	ListIterator itr=s2.listIterator();
	while(itr.hasNext())
		System.out.print(itr.next());
		}
		

	}

}
