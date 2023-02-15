package pkg;

public class Star4quadrant {

	public static void main(String[] args) {
		
		//Fourth quadrant star pattern...
		
		System.out.println("Fourth quadrant star pattern...");
		
		for(int i=0;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
