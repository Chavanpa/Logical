package pkg;

public class Uppercase {

	public static void main(String[] args) {
   
		String s="Chavan Yash";
         s=s.replaceAll(" ", "");
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
			if(Character.isUpperCase(ch)) {
				System.out.print("Upper case:- "+ch);
			}
			
			else {
				System.out.print("Lower case:- "+ch);
			}
			System.out.println();
		}

	}

}
