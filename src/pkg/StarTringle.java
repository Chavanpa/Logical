package pkg;

public class StarTringle {

	public static void main(String[] args) {
		
		// Star pattern tringle..
		
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
