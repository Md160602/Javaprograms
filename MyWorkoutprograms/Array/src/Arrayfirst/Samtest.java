package Arrayfirst;

public class Samtest 
{
	public static void main(String[] args)
	{
		Samtest obj=new Samtest();
		obj.patten();
		obj.array();
		obj.odd_even();
		obj.table();
		obj.subset();
		
	}
	

	void patten()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}
	void array()
	{
		int a[]= {5,4,1,7,2};
		
		int b[]=new int [a.clone().length];
		System.out.println("Given array is ");
		for(int i=0;i<a.length;i++)
			
		{
			System.out.print(a[i]+" ");
			b[i]=a[i];
			
		}
		System.out.println();
		System.out.print("Reverse array is ");
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			
			System.out.print(b[i]+" ");
		}
		System.out.println("-----------------------");
	}
	void odd_even()
	{
		int num=7312;
		int odd=0;
		int even=0;
		
		for(int i=0;num>0;i++)
			
		{
			int n=num%10;
			if(i%2==0)
			{
				even=even+n;
			}
			else
				
			{
				odd=odd+n;
			}
			num=num/10;
		}
		System.out.println("Even th  sum is "+even);
		System.out.println("Odd   sum is "+odd);
		int diff=odd-even;
		System.out.println("Diffrence between odd and even is "+diff);
		System.out.println("-----------------------");
	}
	void table()
	{
		int n=7;
		for(int i=1;i<=10;i++)
		{
			int ans=n*i;
			System.out.println(n+"*"+i+"="+ans);
		}
		System.out.println("------------------------");
	}
	void subset()
	{
		int arr[]= {5,4,7,3,2};
		int brr[]= {5,4,2};
		int count=0;
		for(int i=0;i<brr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(brr[i]==arr[j])
				{
					count++;
					break;
				}
			}
		}
		if(count==brr.length)
		{
			System.out.println("B is a Subset of A");
		}
		else
		{
			System.out.println("B is not a Subset of A");
		}
	}
	

}
