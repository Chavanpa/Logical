package pkg;

public class Fibonacci {

	public static void main(String[] args) {
		
		int a,b=0,c=1;
		System.out.println("Fibonacci Series is:");
		for(int i=1;i<=9;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(a+" ");
		}
		

	}

}
