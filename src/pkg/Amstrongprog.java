package pkg;

public class Amstrongprog {

	public static void main(String[] args) {
		// Armstrong Number-153,371, 1634
		
		int n=153;
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
			
		}
		if(temp==sum)
		{
			System.out.println(temp+"  Is an Armstrong Number.");
		}
		else
		{
			System.out.println(temp+"  is not an Armstrong Number");
		}

	}

}
