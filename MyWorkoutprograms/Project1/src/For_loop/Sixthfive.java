package For_loop;

public class Sixthfive
{
	public static void main(String[] args)
	{
		Sixthfive obj6=new Sixthfive();
		obj6.factorial(7);
		obj6.fibonacci(10);
		obj6.fibonacci2(10);
	}
	public void factorial(int num)
	{
		int i=1;
		int fact=1;
		for(;num>i;num--)
		{
			fact=fact*num;
		}
		System.out.println(" The factorial of given number is "+ fact);
		System.out.println("----------------");
	}
	public void fibonacci(int num)
	{
		int first=-1;
		int second=1;
		int ans;
		System.out.println("The first ten fibonacci numbers are ");
		for(;num>0;num--)
		{
			ans=first+second;
			System.out.println(ans);
			first=second;
			second=ans;
		}
		System.out.println("----------------");
	}
	public void fibonacci2(int num)
	{
		int first=-1;
		int second=1;
		System.out.println("The first ten fibonacci numbers are ");
		for(;num>0;num--)
		{
			System.out.println(first+second);
			second=first+second;
			first=second-first;
		}
	}

}
