package pkg;

public class Star1quadral {

	public static void main(String[] args) {
		
		System.out.println("First Quadrant Star Pattern");
		
		int num=1;
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}

	}

}
