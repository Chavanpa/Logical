package pkg;

public class Palindrome {

	public static void main(String[] args) {
		
		int n=121;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
		{
			System.out.println(temp+" Palindrome Number");
		}
		else
		{
			System.out.println(temp+" Not Palindrome Number");
		}
		

	}

}
