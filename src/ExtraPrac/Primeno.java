package ExtraPrac;

public class Primeno {

	public static void main(String[] args) {
		
		for(int i=0;i<=100;i++) {
			int count=0;
			for(int n=i;n>=1;n--) {
				if(i%n==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}

	}

}
