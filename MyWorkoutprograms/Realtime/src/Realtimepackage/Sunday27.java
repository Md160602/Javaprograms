package Realtimepackage;

import java.util.Scanner;

public class Sunday27 
{
	void arrayconcept()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your array size");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Your array size is "+size);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Enetr the search number ");
		int count=0;
		int value=scan.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			
			if(value==arr[i])
			{ 
				count++;
				
			}
			
			
		}
		
		if(count==0)
		{
			System.out.println("Given number is not in");
		}
		else
		System.out.println("Given number is present at "+count);
			
		}	
		
		void patter()
		{
			for(int i=1;i<=4;i++)
			{
				for(int space=2;space<=i;space++)
				{
					System.out.print(" ");
				}
				for(int j=4;j>=i;j--)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
		
		
		
		
	
	public static void main(String[] args) 
	{
		Sunday27 obj=new Sunday27();
		obj.arrayconcept();
		obj.patter();
		System.out.println(obj);
	}
}