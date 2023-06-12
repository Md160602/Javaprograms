package For_loop;

public class Fivthfive {
	public static void main(String[] args) 
	{
		Fivthfive obj5=new Fivthfive();
		obj5.neon();
		obj5.magic();
		obj5.least_multiple(13,19);
		obj5.highest_multiple(13,19);
		obj5.least_with_three(5,15,55);
		obj5.highest_with_three(5,15,55);
		
	}
	public void neon()
	{
		int num=9;
		int square=num*num;
		int sum_ans=0;
		for(int sum=square;square>0;square=square/10)
		{
			int a=square%10;
			sum_ans=sum_ans+a;
		}
		if(sum_ans==num)
		{
			System.out.println(sum_ans+" It is a neon number");
		}
		else
		{
			System.out.println(sum_ans+" It is not a neon number");
		}
		System.out.println("----------------------------");
	}
	public void magic()
	{
		int num=1458;
		int given_num=num;
		int sum=0;
		for(;num>0;num=num/10)
		{
			int a=num%10;
			sum=sum+a;
		}
		int ans=sum;
	
		System.out.println(sum+ " is a sum of the number");
		int rev=0;
		for(;sum>0;sum=sum/10)
		{
			int a=sum%10;
			rev=rev*10+a;
		}
		System.out.println(rev+" Reverse of given number");
		int answer=ans*rev;
		//System.out.println(ans);
		System.out.println(answer);
		if(given_num==answer)
		{
			System.out.println(given_num+" It is magic number");
		}
		else
		{
			System.out.println(given_num+" It is not a magic number");
		}
		System.out.println("--------------------");
		
	}
	public void least_multiple(int n1,int n2)
	{
		int large=n1>n2?n1:n2;
		int range=n1*n2;
		for(;large<=range;large++)
		{
			if(large%n1==0 && large%n2==0)
			{
				break;
				
			}
			
		}
		System.out.println(large);
		System.out.println("------------------");
		
	}
	public void highest_multiple(int n1,int n2)
	{
		int small=n1<n2?n1:n2;
		int high=0;
		for(int i=1;small>=i;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				high=i;
			}
			
		}
		System.out.println(high);
		System.out.println("------------------");
	}
	public void least_with_three(int n1,int n2,int n3) 
	{
		int d=n1>n2?n1:n2;
		int range=n1*n2*n3;
		int large=n3>d?n3:d;
		for(;large<=range;large++)
		{
			if(large%n1==0 && large%n2==0 && large%n3==0)
			{
				break;
			}
		}
		System.out.println(large);
		System.out.println("------------------");
	}
	public void highest_with_three(int n1,int n2,int n3)
	{
		int hcf=0;
		int n4=n1<n2?n1:n2;
		int small=n3<n4?n3:n4;
		for(int i=1;small>=i;i++)
		{
			if(n1%i==0 && n2%i==0 && n3%i==0)
			{
				hcf=i;
			}
		}
		System.out.println(hcf);
		System.out.println("------------------");
	}
		
	

}
