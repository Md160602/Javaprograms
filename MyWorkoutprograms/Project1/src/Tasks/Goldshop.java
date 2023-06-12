package Tasks;

public class Goldshop 
{
	 Goldshop()
	{
		System.out.println("Welcome");
	}
	Goldshop(int amount)
	{
		this();
		if(amount>10000)
		{
		System.out.println("Give a free golden Membership");
		}
	}
	Goldshop(int amount,int coin)
	{
		this(amount);
		System.out.println("Give a Gold coin");
		
	}
	Goldshop(int amount,int coin,int exchange_gold)
	{
		this(amount,coin);
		System.out.println("Flat cashback 10000");
	}

}
