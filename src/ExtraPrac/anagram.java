package ExtraPrac;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
	  String s1="Race";
	  String s2="Care";
	  s1=s1.toLowerCase();
	  s2=s2.toLowerCase();
	  
	  if(s1.length()==s2.length()) {
		  char[] ch=s1.toCharArray();
		  char[] ch1=s2.toCharArray();
		  Arrays.sort(ch);
		  Arrays.sort(ch1);
		  
		  if(Arrays.equals(ch, ch1)) {
			  System.out.println("String "+s1 +" and " +s2 +" is Anagram ");
		  }
		  else {
			  System.out.println("String "+s1 +" and " +s2 +" is not Anagram");
		  }
		  
	  }else {
		  System.out.println("String "+s1 +" and " +s2 +"  is not Anagram");
	  }
	  

	}

}
