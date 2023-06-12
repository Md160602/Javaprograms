package Arraymid;

import java.util.Scanner;

public class Transpose 
{
	Scanner scan=new Scanner(System.in);
	public static void main(String[] args) 
	{
		Transpose obj=new Transpose();
		int brr[][]=obj.sum_column();
	    obj.transpose(brr);
		obj.transpose_same(brr);
		int jrr[][]=obj.print_jagged();
		int hrr[][]=obj.print_jagged();
		obj.sum_jagged(jrr,hrr);
		obj.print();
		
		
	}
	int [][]sum_column()    //THis method is used to sum the elements in column wise.
	{                             //and this method is return type.The return array is used in upcoming method. 
		System.out.println("Given array is  :");
		System.out.println();
		int a=1;
		int arr[][]=new int[5][5];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=a;
				a++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("------------");
		for(int i=0;i<arr.length;i++)
		{   int sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum=sum+arr[j][i];
			}
			System.out.println("Sum of the column wise in "+i+" th column "+sum);
		}
		System.out.println("--------------------");
		return arr;
	}
	void transpose(int crr[][])  //This method is used to Transpose for eg ; 4*5 == 5*4
	{
		System.out.println("Given array is  an Transpose verse in another array: ");
		System.out.println();
		int drr[][]=new int[crr.length][crr[0].length];
		for(int i=0;i<crr.length;i++)
		{
			for(int j=0;j<crr[i].length;j++)
			{
				drr[i][j]=crr[j][i];
			}
		}
		for(int i=0;i<drr.length;i++)
		{
			for(int j=0;j<drr[i].length;j++)
			{
				System.out.print(drr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
	void transpose_same(int err[][])   //THis method is used to transpose but elements store in same array.
	{
		System.out.println("Given array is an transpose verse in same array ");
		System.out.println();
		//int temp=0;
		for(int i=0;i<err.length;i++)
		{
		
			for(int j=0;j<err.length;j++)
			{
				 int temp=err[i][j];
				 err[i][j]=err[j][i] ;
				 err[j][i] = temp;
			}
		}
		for(int i=0;i<err.length;i++)
		{
			for(int j=0;j<err.length;j++)
			{
				System.out.print(err[j][i]+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
	}
	int [] [ ]print_jagged()  //Jagged array is  an array  each element is an array and can be different size.
	{								//This method is used to print the jagged array.
		System.out.println("Printing the  jagged array ;");
		System.out.println();
		int arr[][]=new int[5][];
		  arr[0]=new int [5];
		  arr[1]=new int [4];
		  arr[2]=new int [3];
		  arr[3]=new int [2];
		  arr[4]=new int [1];
		  
		  int a=1;
		  for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr[i].length;j++)
			  {
				  arr[i][j]=a;
				  a++;
			  }
		  }
		  for(int i=0;i<arr.length;i++)
		  {
			  for(int j=0;j<arr[i].length;j++)
			  {
				  System.out.print(arr[i][j]+"  ");
			  }
			  System.out.println();
		  }
		  System.out.println("------------------------");
		  return arr;
	}
	void sum_jagged(int arr[][],int brr[][])   //THis method is used to sum of two jagged arrays .
	{                      						//Must be both jagged array are same size.
		System.out.println("Sum of the two jagged array :");
		System.out.println();
		int sum_rr[][]=new int [arr.length][];
		sum_rr[0]=new int [arr[0].length];
		sum_rr[1]=new int [arr[1].length];
		sum_rr[2]=new int [arr[2].length];
		sum_rr[3]=new int [arr[3].length];
		sum_rr[4]=new int [arr[4].length];
		for(int i=0;i<sum_rr.length;i++)
		{
			for(int j=0;j<sum_rr[i].length;j++)
			{
				sum_rr[i][j]=arr[i][j]+brr[i][j];
			}
		}
		for(int i=0;i<sum_rr.length;i++)
		{
			for(int j=0;j<sum_rr[i].length;j++)
			{
				System.out.print(sum_rr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	void print()
	{
		String age="15";
		int a=5;
		int b=25;
		System.out.println((age+a)+b);
	}
	
			

}