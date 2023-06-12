package Realtimepackage;

import java.util.Scanner;

public class Friday26 
{
	void method()
	{
		Scanner scan=new Scanner(System.in) ;
		System.out.println("Enter your array size");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Your array size is "+size);
		for(int i=0;i<arr.length;i++)
		{
		   arr[i]=scan.nextInt();
		}
		boolean flag=false;
		System.out.println("Please enter elements to research");
		int value=scan.nextInt();
		scan.close();
		for(int i=0;i<arr.length;i++)
		{
			
		if(value==arr[i])
		{
			flag=true;
		}
		}
		if(flag==true)
		{
			System.out.println("Elements found");
		}
		else
		{
			System.out.println("Not found");
		}
	}
	public static void main(String[] args)
	{
		Friday26 obj=new Friday26();
		obj.method();
		
	}

}
