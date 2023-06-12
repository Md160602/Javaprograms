package Mathamatical;

public class Triangle {
	public static void main(String args[])
	{
		Triangle obj=new Triangle();
		obj.top_left();
		obj.bot_left();
		obj.top_right();
		obj.bot_right();
	}
	public void top_left()
	{
		int row=1;
		while(row<=5)
		{
			int col=1;
			while(col<=row)
			{
			    System.out.print(col+" ");
			    col++;
			}
			row++;
			System.out.println();
			
		}
		System.out.println("__________________________");
	}
	public void bot_left()
	{
		int row=5;
		while(1<=row)
		{
			int col=1;
			while(col<=row)
			{
				System.out.print(col+" ");
				col++;
			}
			row--;
			System.out.println();
		}
		System.out.println("__________________________");
	}
	
	/* _ _ _ _ 1
	 * _ _ _ 1 2
	 * _ _ 1 2 3
	 * _ 1 2 3 4
	 * 1 2 3 4 5 
	 */
	public void top_right()
	{
		int row=1;
		while(row<=5)
		{
	    
			int space=4;
			while(space>=row)
			{
				System.out.print(" ");
				space--;
			}
				int col=1;
				while(col<=row)
				{
					System.out.print(col);
					col++;
				}
		row++;
		
		System.out.println();
	}
		System.out.println("__________________");
	}
	/* 1 2 3 4 5
	 * _ 1 2 3 4 
	 * _ _ 1 2 3 
	 * _ _ _ 1 2
	 * _ _ _ _ 1
	 */
	public void bot_right()
	{
		int row=5;
		
		while(row>=1)
		{
			int space=5;
			while(space>row)
			{
				System.out.print(" ");
				space--;
			}
			int col=1;
			while(col<=row)
			{
				System.out.print(col);
				col++;
			}
			row--;
			System.out.println();
		}
		
			
			
	}

}
