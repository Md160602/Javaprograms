package Realtimepackage;

import java.util.Scanner;

public class Sun28 
{
	Scanner scan=new Scanner(System.in);
	int size;
	int arr[];
	
	int[] method()
	{
		System.out.println("Enter your array size");
		size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Your array size is "+size);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int max=Integer.MIN_VALUE;
		System.out.println("Integer minimum number is "+max);
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Your maximum element is "+max);
		int min=Integer.MAX_VALUE;
		System.out.println("Integer maximum number is "+min);
		int i=0;
		while(i<arr.length)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
			i++;
		}
		System.out.println("Your Minimum element is "+min);
		
		return arr;
	}
	void second_max(int ary[])
	{
		System.out.println(size);
		for(int i=0;i<ary.length;i++)
		{
			System.out.println(ary[i]);
		}
		int max=Integer.MIN_VALUE+1;
		int second_max=Integer.MIN_VALUE;
		for(int i=0;i<ary.length;i++)
		{
			if(max<ary[i]) 
			{
				second_max=max;
				max=ary[i];
				
			}
			if(second_max<ary[i] && max!=ary[i])
			{
				second_max=ary[i];
			}
		}
		System.out.println("max is"+max);
		System.out.println("s max is "+second_max);
	}
	public static void main(String[] args)
	{
		Sun28 obj=new Sun28();
		int array[]=obj.method();
		/*
		 * for(int i=0;i<array.length;i++) { System.out.println(array[i]); }
		 */
		obj.second_max(array);
		
	}

}
