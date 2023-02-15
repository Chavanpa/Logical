package pkg;

public class Star3quadrant {

	public static void main(String[] args) {
		
		// Third quadrant Star pattern...
		
		System.out.println("Third Quadrant Star Pattern :-");
		
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
