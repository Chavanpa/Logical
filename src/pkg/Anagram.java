package pkg;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 String s1 = "Race";
		  String s2 = "Care";
		    
		  s1=s1.toLowerCase();
		  s2=s2.toLowerCase();
		    
		  if(s1.length()==s2.length())
		  {
			  char[] ch1=s1.toCharArray();
			  char[] ch2=s2.toCharArray();
			  Arrays.sort(ch1);
			  Arrays.sort(ch2);
			  
			boolean result=  Arrays.equals(ch1, ch2);
			if(result) {
				System.out.println(s1+" and " + s2+" are Anagram.");
			  
		  }else
		  {
				System.out.println(s1+" and " + s2+" are not Anagram."); 
		  }
		}
		  else
			{		      
		      System.out.println(s1 + " and " + s2 + " are not anagram.");
		    }

	}

}
