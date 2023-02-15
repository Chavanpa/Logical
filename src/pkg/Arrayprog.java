package pkg;

import java.util.Arrays;

public class Arrayprog {

	public static void main(String[] args) {
		
		int a[]= {12,32,23,56,45,98,67};
		
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int s=0;
		for(int i=(a.length-1);i>0;i--)
		{
			s=s+a[i];
			
		}
		System.out.println(Arrays.toString(a));

	}

}
