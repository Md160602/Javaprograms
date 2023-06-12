package Arrayfirst;

import java.util.Scanner;

public class Arrayconcept 
{
		Scanner scan=new Scanner(System.in);
		
	
	int[] display()
	{   
		System.out.println("Enter your Array size");
		int size=scan.nextInt();
		int arr[]=new int[size];
		System.out.println("Your array size is "+size);
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		scan.close();
		return arr;
		
	}
	public static void main(String[] args) 
	{
		Arrayconcept obj=new Arrayconcept();
		 int []array=obj.display();
          int bck[]=array;
		for(int i = 0;i<array.length;i++)
		{
		System.out.println(array[i]);
		}
		
	}
	

}
