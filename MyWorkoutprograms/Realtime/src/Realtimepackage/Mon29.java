package Realtimepackage;

import java.util.Scanner;

public class Mon29 
{
	Scanner scan=new Scanner(System.in);
	int size;
	int arr[];
	
	void  dup()
	{
		System.out.println("Enter your array size");
		size=scan.nextInt();
	
		int arr[]=new int [size];
		System.out.println("Your array size is "+size);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			
				if(arr[i]==1)
				{
					arr[i]=-1;
				}
				
			
		}
		for(int i=0;i<arr[i];i++)
		{
			System.out.println(arr[i]);
		}
		
		//return arr;		
	}
	public static void main(String[] args) 
	{
		Mon29 obj=new Mon29();
		//obj.dup();
		obj.task();
		
	}
	void task()
	{
		//System.out.println("Enter your array size");
		//size=scan.nextInt();
		int a[]= {1,2,3,4};
		for(int i=0;i<a.length;i++)
		{
			
		}
		int b[]= {5,6,7,8};
		int arr[]=new int [a.length];
				
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=a[i]+b[i];
			System.out.println(arr[i]);
		}
			
	}
	

}
