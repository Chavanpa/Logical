package pkg1;

import java.util.Arrays;

public class ClassA {

	public static void main(String[] args) {
		int a[]= {12,32,23,56,45,98};
		
		//Reverse of Arrays
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		//print Arrays
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		
		//Copy of Array
		int b[]=Arrays.copyOf(a, 3);
		System.out.println(Arrays.toString(b));
		
		//largest no of arrays
		int max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(max < a[i])
			{
				max=a[i];
			}
		}
		System.out.println("MAximum no of Arrays:- "+max);
		
		//Smallest no of Arrays
		int min=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			if(min > a[i])
			{
				min=a[i];
			}
		}
		System.out.println("Minimum no of aarays:- "+min);
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		for(int i=0;i<=a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int t=a[j];
					a[j]=a[i];
					a[i]=t;
				}
			}
			
		}
     System.out.println(Arrays.toString(a));
     
     //Find the duplicate values of arrays..
     int d[]= {10,20,30,20,40,60,60,50,10};
     
     for(int i=0;i<=d.length-1;i++)
		{
    	 int count=0;
			for(int j=i+1;j<d.length;j++)
			{
				if(d[i]==d[j])
				{
					count=count+1;
				}
			}
			System.out.println(d[i]+" Repeated "+count);
		}
	}

}
