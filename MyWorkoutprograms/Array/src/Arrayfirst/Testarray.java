package Arrayfirst;

import java.util.Scanner;

public class Testarray 
{
	Scanner scan=new Scanner(System.in);
	void pattern()
	{
		for(int i=0;i<5;i++)
		{
			for(int space=5;space>1+i;space--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
	void array()
	{
		System.out.println("Enter your array size");
		int size=scan.nextInt();
		int arr[]=new int [size]; 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
		    System.out.println("Eventh element is ");
		     System.out.println(sum=sum+arr[i]);
			}
		
		
		if(i%2==1)
		{
			System.out.println("Odd elemen is ");
			System.out.println(sum=sum+arr[i]);
		}
	}
	}
	public static void main(String[] args) 
	{
		Testarray obj=new Testarray();
		//obj.pattern();
		obj.array();
	}

}