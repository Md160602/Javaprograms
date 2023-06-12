package For_loop;

public class Secondfive {
	public static void main(String[] args)
	{
		Secondfive obj2=new Secondfive();
		obj2.rev_even();
		obj2.divisible();
		obj2.div_both();
		obj2.div_by_seven();
		obj2.div_both();
	}
	public void rev_even()
	{
		for(int count=10;count>0;count--)
		{
			if(count%2==0)
			{
				System.out.println(count);
			}
		}
		System.out.println("_____________________");
	}
	public void divisible()
	{
		int i=250;
		for(int range=300;range>=i;range--)
		{
			if(range%9==0)
			{
				System.out.println(range);
			}
		}
		System.out.println("_____________________");
	}
	public void div_both()
	{
		int range=100;
		for(int i=200;range<=i;range++)
		{
			if(range%3==0 && range%5==0)
			{
			System.out.println(range);
			}
		}
		System.out.println("_____________________");
	}
	public void div_by_nine()
	{
		int i=100;
		for(int range=1;range<=i;range++)
		{
			if(range%9==0)
			{
			System.out.println(range);
			}
		}
		System.out.println("_____________________");
	}

	public void div_by_seven()
	{
		int i=500;
		for(int range=100;range<=i;range++)
		{
			if(range%7==0 && range>=450 )
			{
				System.out.println(range);
			}
		}
		System.out.println("_____________________");
	}
	

}
