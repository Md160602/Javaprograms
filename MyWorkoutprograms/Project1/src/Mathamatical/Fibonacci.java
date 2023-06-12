package Mathamatical;

public class Fibonacci {
	public static void main(String args[])				//using third variable
	{
		Fibonacci obj=new Fibonacci();
		obj.fibo(20);
		obj.fibo2(10);
		obj.prime(10);
	}
	public void fibo(int num)
	{
		int count=1;
		int first=-1;
		int second=1;
		System.out.println("The first 20 fibonacci numbers are");
		while(count<=num)
		{
			int ans=first+second;
			System.out.println(ans);
			first=second;
			second=ans;
			count++;
		}
		System.out.println("___________________");
	}
	public void fibo2(int range)				//Without using third variable
	{
		if(range>0)
		{
		int first=0;							//if user gives 1 .it will print dirsctly first fibo number of 0 is print
		int second=1;
		if(range>=1)							//if user gives 2 it will pritn first two fibo numbers 0,1
		{
			System.out.println(0);				//if user gives three r more it will print first and second directly and while executed t0range conditions
		}
		if(range>=2)
		{
			System.out.println(1);
		}
		int count=3;
		while(range>=count)
		{
			
			System.out.println(first+second);
			second=first+second;
			first=second-first;
			count++;
		}
		System.out.println("___________________");
		}
		else
		{
			System.out.println("Please check your number");
		}
	}
	public void prime(int range) 				//this method is used to print first 10 prime numbers.
	
	{
	    int count=0;
	    int prime_num=2;
		while(count<range)
		{
			int i=1;
			int div=0;
			while(i<=prime_num)
			{
				if(prime_num%i==0)
				{
					div++;
				}
				i++;
			}
				if(div==2)
				{
					System.out.println(prime_num);
					count++;
				}
				prime_num++;
			}
			
		}
	}
		


