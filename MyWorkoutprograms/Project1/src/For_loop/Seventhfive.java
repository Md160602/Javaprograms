package For_loop;

public class Seventhfive 
{
	public static void main(String[] args)
	{
		Seventhfive obj7=new Seventhfive();
		obj7.prime();
		obj7.prime_count();
		obj7.prime_using_while();
		obj7.pattern1();
	}
	public void prime()
	{
		int range=100;
		
		for(int i=1;i<=range;i++)
		{
			int count=0;
			for(int n=1;n<=i;n++)
			{
				if(i%n==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
			
          
			
		}
		 System.out.println("----------------------");
				
	}
	public void prime_count()
	{
		int prime=2;
		for(int count=15;count>0;prime++)
		{
			int ans=0;
			for(int i=1;prime>=i;i++)
			{
				if(prime%i==0)
				{
					ans++;
				}
				
			}
			if(ans==2)
			{
				System.out.println(prime);
				count--;
			}
			
		}
		System.out.println("----------------------");
		
	}
	public void prime_using_while()
	{
		int count=1;
		int prime=2;
		while(count<=15)
		{
			int i =1;
			int div=0;
			while(i<=prime)
			{
				if(prime%i==0)
				{
					div++;
				}
				i++;
			}
			if(div==2)
			{
				System.out.println(prime);
				count++;
				
			}
			prime++;
			
		}
		System.out.println("--------------------------");
	}
	public void pattern1()
	{
		for(int row=1;row<=4;row++)
		{
			for(int space=3;space>=row;space-- )
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
