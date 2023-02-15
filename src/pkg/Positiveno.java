package pkg;

import java.util.Scanner;

public class Positiveno {

	public static void main(String[] args) {
		
		System.out.println("Enter any Number");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		for(int a=1;a<=n;a++)
		{
		if(a%2==0)
		{
			System.out.println(a+": is Even Number");
		}
		else
		{
			System.out.println(a+": is Odd Number");
		}
		scn.close();
		}

	}

}
