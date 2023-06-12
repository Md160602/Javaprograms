package Tasks;

public class Bank 
{
	private int bal;
	double roi;
	void credit(int amt)
	{
		bal=bal+amt;
		System.out.println("Successfully depited");
	}
	void depit(int amt)
	{
		bal=bal-amt;
		System.out.println("Succesffullu Cretited");
	}
	void check_bal()
	{
		System.out.println(bal);
	}
	

}
