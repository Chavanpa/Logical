package pkg;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		
		System.out.println("Enter any String");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		scn.close();

	}

}
