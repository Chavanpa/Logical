package ExtraPrac;

public class DublicateWord {

	public static void main(String[] args) {
		
		String s="Big black bug bit a big black dog on his big black nose";
		s=s.toLowerCase();
		String[] ss=s.split(" ");
		int count;
		for(int i=0;i<ss.length;i++) {
			count=1;
			for(int j=i+1;j<ss.length;j++) {
				if(ss[i].equals(ss[j])) {
					count++;
					ss[j]="0";
				}
				
			}
			if(count >1 && ss[i]!="0") {
				System.out.println(ss[i]);
			}
		}
		

	}

}
