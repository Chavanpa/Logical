package pkg1;

public class PracticeExam {

	public static void main(String[] args) {
		
		int num=454;
		int temp=num;
		int sum=0;
		while(num!=0)
			
		{
			int r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		if(temp==sum)
		{
			System.out.println("No is polindrome");
			
		}
		else
		{
			System.out.println("No is not polindrome");
		}

	}

}
