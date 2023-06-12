package Realtimepackage;

import java.util.Scanner;

public class Array {
	
		Scanner scan=new Scanner(System.in);
		
	
	int [] size()
	{
		System.out.println("Enter your array size");
		int size=scan.nextInt();
		System.out.println("Your array size is"+size);
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		return arr;
	}
	public static void main(String[] args)
	{
		Array obj=new Array();
		int n[]=obj.size();
		
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
	}

}
