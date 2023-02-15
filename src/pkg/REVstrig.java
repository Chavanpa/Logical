package pkg;

public class REVstrig {

	public static void main(String[] args) {

     String str="Yash Nanabgau Chavan";
     System.out.println("Your Full Name is: "+str);
     String[] s=str.split(" ");
     
     String revmain="";
     
      for(int i=0;i<s.length;i++)
      {
    	  String r=s[i];
    	  String revsub="";
    	  for(int j=(r.length()-1);j>=0;j--)
    	  {
    		  revsub=revsub+r.charAt(j);
    	  }
    	  revmain=revmain+revsub+" ";
      }
      System.out.println("After rev. Your Full Name is:"+revmain);
     
     

	}

}
