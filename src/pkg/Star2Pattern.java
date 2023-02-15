package pkg;

public class Star2Pattern {

	public static void main(String[] args) {
		
		// Second quadrant Star pattern...
		
				System.out.println("Second Quadrant Star Pattern :-");
				
				for(int i=0;i<=5;i++)
				{
					for(int j=5;j>=i;j--)
					{
						System.out.print("  ");
					}
					for(int k=0;k<=i;k++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}

	}

}
