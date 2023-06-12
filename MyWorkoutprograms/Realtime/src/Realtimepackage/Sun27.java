package Realtimepackage;

import java.util.Scanner;

public class Sun27
{
	void method()
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your array size");
	int size=scan.nextInt();
	int arr[]=new int[size];
	int bck[]=arr;
	System.out.println("Your array size is "+size);
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();
	}
	if(arr.length%2==0)
	{
	int x=arr.length/2;
	System.out.println("Middle element is "+arr[x]);
	scan.close();
	}
	if(arr.length%2==1)
	{
		int x=arr.length/2;
		System.out.println(arr[x]);
		System.out.println(arr[x-1]);
	}
	}
	public static void main(String[] args) 
	{
		Sun27 obj=new Sun27();
		obj.method();
		
	}
}
