package ExtraPrac;

public class PrimeNo1 {

	public static void main(String[] args) {
		 
		for(int i=0;i<100;i++) {
			int count=0;
			for(int n=i;n>=1;n--) {
				if(i%n==0) {
					count=count+1;
				}
				
			}
			if(count==2) {
				System.err.println(i+" Prime");
			}
		}

	}

}
