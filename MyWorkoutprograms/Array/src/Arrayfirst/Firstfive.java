package Arrayfirst;

import java.util.Scanner;


public class Firstfive 
{
	Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Firstfive obj=new Firstfive();
		obj.method();
		
	}
	
	void method()
	{
		System.out.println("Enter your array size");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Your array size is "+size);
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
			sum=sum+arr[i];
			
		}
		System.out.println();
		System.out.println("Sum of the array is "+sum);
		int avg=sum/arr.length;
		System.out.println();
		System.out.println("Average of the array is "+avg);
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even=even+arr[i];
			}
			if(arr[i]%2!=0)
			{
				odd=odd+arr[i];
			}
		}
		System.out.println();
		System.out.println("Sum of the even array is "+even);
		System.out.println("Sum of the odd array is "+odd);
		int diff=even-odd;
		System.out.println();
		System.out.println("Difference between two array is "+diff);
	}

}
