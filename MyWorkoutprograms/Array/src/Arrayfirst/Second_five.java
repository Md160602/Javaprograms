package Arrayfirst;

import java.util.Scanner;


public class Second_five 
{
	Scanner scan=new Scanner(System.in);
	
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
		if(arr.length%2==0)
		{
			int x=arr.length/2;
			int y=x-1;
			System.out.println("Middle element is "+arr[x]);
			System.out.println("Middle element is "+arr[y]);
		}
		if(arr.length%2==1)
		{
			int x=arr.length/2;
			System.out.println("Middle element is "+arr[x]);
		}
	}
	public static void main(String[] args) 
	{
		Second_five obj=new Second_five();
		obj.method();
		
		
	}

}
