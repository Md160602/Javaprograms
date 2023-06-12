package For_loop;

public class Firstfive {
	public static void main(String[] args) 
	{
		Firstfive obj=new Firstfive();
		obj.five();
		obj.hun();
		obj.natural();
		obj.even();
	}
	public void five()
	{
	   for(int count=1;count<=5;count++)
	   {
		   System.out.println("Hai Dev");
	   }
	   System.out.println("_____________________");
	}
	public void hun()
	{
		int n=100;
		for(int count=1;count<=5;count++)
		{
			System.out.println(n);
		}
		 System.out.println("_____________________");
	}
	public void natural()
	{
		int n=1;
				for(;n<=10;n++)
				{
					System.out.println(n);
				}
				 System.out.println("_____________________");
	}
	public void even()
	{
		
		for(int count=1;count<=10;count++)
		{
		
		if(count%2==0)
		{
			System.out.println(count);
			count++;
		}
	
	}
		System.out.println("_____________________");
	}
	

}
