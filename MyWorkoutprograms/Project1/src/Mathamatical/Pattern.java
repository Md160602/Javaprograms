package Mathamatical;

public class Pattern { public static void main (String args[])
	{
	   Pattern obj1=new Pattern();
	   obj1.matrix();
	   obj1.pattern2();
	
	}
    public void matrix()
    {
    	int row=1;
    	while(row<5)
    	{
    		int col=1;
    		while(col<=5)
    		{
    			System.out.print("* ");
    			col++;
    		}
    		row++;
    		System.out.println();
    	}
    	System.out.println("______________");
    }
    public void pattern2()
    {
    	for(int row=1; row<=5;row++)
    	{
    		for (int col=1;col<=5;col++)
    		{
    			if(col==1 || col==5)
    			{
    			System.out.print("* ");
    			}
    		}
    		for(int space=1;space<=3;space++)
    		{
    			System.out.print("+ ");
    		}
    		System.out.println();
    		
    	}	
    }

}
