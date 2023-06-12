package Tasks;

import java.util.Scanner;

public class Homework 
{
	Scanner scan=new Scanner(System.in);
	public static void main(String[] args)
	{
	      Homework obj=new Homework();
	      //obj.add_even();
	      //obj.rev_prime();
	      //obj.pattern();
	     // obj.repeat();
	      //obj.nonrepeat();
	      //obj.sum_of_index();
	      obj.consecutive();
    }
	public void add_even()
	{
		int sum1=0;
		int sum2=0;
	    int count=0;
		for(int n=149327;n>0;n=n/10)
		{
			int a =n%10;
			count++;
			if(count%2==1)
			{
				sum1=sum1+a;
			}
			else
			{
				sum2=sum2+a;
			}
			
		}
		System.out.println("Sum of the eventh number of place is "+sum1);
		System.out.println("Sum of the odd place number is "+sum2);
		int ans=sum1-sum2;
		System.out.println("Difference of odd and even place  number is "+ans);
		System.out.println("----------------------");
		
	}
	public void rev_prime()
	{
		int rev=0;
		for(int n=149327;n>0;n=n/10)
			
				{
			        int a=n%10;
			        rev=rev*10+a;
				}
		System.out.println(rev+"Reverse of given number");
		int prime=rev;
		int count=0;
		for(int i=1;i<=prime;i++)
		{
			
		if(prime%i==0)
		{
			count++;
		}
		
		}
		if(count==2)
		{
			System.out.println(prime+"It is a prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
		System.out.println("----------------------");
	}
	public void pattern()
	{
		for(char row='a';row<='d';row++)
		{
			for(int col=1;col<=4;col++)
			{
			      System.out.print(row+" ");
			}
			System.out.println();
	
		}
		
	}
	void repeat()
	
	{
		int arr[]= {1,2,3,4,5,3};
		int count=0;
		//boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					//System.out.println(arr[i]);
					count++;
					if(count==1)
					{
						System.out.println("The first repeative element is "+arr[i]);
						
					}
					
				}
				
			}
				
		}
		
		
	}
  void nonrepeat()
	
	{
		int arr[]= {1,2,2,1,3};
		
		System.out.println();
		 
		for(int i=0;i<arr.length;i++)
			
		{
			int count=0;
			
			for(int j=0;j<arr.length;j++)
				
			{
			
				if(arr[i]==arr[j])
				{
					count++;
				}
		}
			if(count==1)
			{
				System.out.println("Non Repeative element is "+arr[i]);
				
			}
		}
	}
  void sum_of_index() 
  {
	  System.out.println();
	  int arr[]= {1,2,3,4,5,6};
	  int sum=0;
	  for(int i=0;i<arr.length;i++)
	  {
		  sum=sum+i;
	  }
	  System.out.println("Enter your checking number");
	  
	  int num=scan.nextInt();
	  if(num==sum)
	  {
		  System.out.println(num+" Given number is equal to sum of  the indices "+sum);
	  }
	  else
	  {
		  System.out.println(num+" Given number is  not equal to sum of  the indices "+sum);
	  }
	  
  }
  void consecutive()
  {
	  System.out.println();
	  int arr[]= {1,2,3,5,8};
	 // System.out.println("Enter your checking number");
	  int num=5;
	  
	  boolean flag=false;
	  for(int i=0;i<arr.length-1;i++)
	  {
		  
		  for(int j=i+1;j>i;j--)
		  {
			  
			 int  sum=arr[i]+arr[j];
			  if(num==sum)
			  {
				  flag=true;
				  System.out.println("Yes its exepecting is an concecutive array ");
				  break;
			  }
		  }
	  }
	  if(flag==false)
	  {
		  System.out.println("Non concesutive ");
	  }
	  
		  
	  
	  
  }
		

}
