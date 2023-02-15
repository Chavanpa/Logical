package pkg;

public class RevStringUsingSplit {

	public static void main(String[] args) {
		
		String s="Yash Chavan";
		String[] str=s.split("\\s ");
		
		String revString="";
		
		for(int i=0;i<str.length;i++)
		{
			String r=str[i];
			String Revsubstring="";
			
			for(int k=r.length()-1;k>=0;k--)
			{
				Revsubstring=Revsubstring+r.charAt(k);
			}
			
			revString=revString+Revsubstring+" ";
		}
		System.out.println(revString);
		
		
		

	}

}
