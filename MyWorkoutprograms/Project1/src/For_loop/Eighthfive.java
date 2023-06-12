package For_loop;

public class Eighthfive 
{
	public static void main(String[] args)
	{
		Eighthfive obj8=new Eighthfive();
		obj8.pattern2();
		
	}
	public void pattern2()
	{
		for(int row=1;row<=4;row++)
		{
			for(int col=4;col<=row;col--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
