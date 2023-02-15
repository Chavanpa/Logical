package ExtraPrac;

public class Uppercase {

	public static void main(String[] args) {
		  String s="yash chavan";
	      String[] ss=s.split("\\s ");
	      String rev="";
	      for(int i=0;i<ss.length;i++) {
	    	  String r=ss[i];
	    	  String rev1="";
	    	  for(int j=r.length()-1;j>=0;j--) {
	    		  rev1=rev1+r.charAt(j);
	    	  }
	    	  rev=rev+rev1+" ";
	    	  
	      }
	}

}
