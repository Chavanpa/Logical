package pkg;

public class Stringexm {

	public static void main(String[] args) {
		
		String s="Velocity";

		System.out.println(s.length());
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		StringBuilder sbldr=new StringBuilder();
		sbldr.append(s);
		sbldr.reverse();
		System.out.println(sbldr);
		
		StringBuffer sbldr1=new StringBuffer();
		sbldr1.append(s);
		sbldr1.reverse();
		System.out.println(sbldr);

	}

}
