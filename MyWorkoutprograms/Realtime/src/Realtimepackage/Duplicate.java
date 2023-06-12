package Realtimepackage;

import java.util.Scanner;

public class Duplicate 
{
	Scanner scan=new Scanner(System.in);
	int size;
	int arr[];
	
	int [] dup()
	{
		System.out.println("Enter your array size");
		size=scan.nextInt();
	
		int arr[]=new int [size];
		System.out.println("Your array size is "+size);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int count=0;
		boolean flag=false;
		int n=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=n;
					System.out.println(arr[i]);
					flag=true;
					n++;
				}
				
			}
			
		}
		if(count>=1 )
		{
			
		System.out.println("Duplicate array is present "+count+" times");
		}
		if(flag==false)
		{
			System.out.println("Absence of duplicate array");
		}
		return arr;		
	}
	void dup2(int array[])
	{
		/*
		 * for (int i=0;i<array.length;i++) { System.out.println(array[i]); }
		 */
		int i;
		for(i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					array[j]=Integer.MIN_VALUE;
					
					
				}
				
				
			}
			if(array[i]!=Integer.MIN_VALUE)
			{
			System.out.println(array[i]);
			}
		}
		
	}
	public static void main(String[] args)
	{
		Duplicate obj=new Duplicate();
		int ary[]=obj.dup();
		obj.dup2(ary);
		
	}

}
