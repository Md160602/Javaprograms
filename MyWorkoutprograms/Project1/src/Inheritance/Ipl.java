package Inheritance;

public class Ipl extends Cricket {
	public static void main (String args[])
	{
		Ipl obj=new Ipl();
		obj.mem();
		obj.teams();
		obj.points();
	}
	public void teams()
	{
		System.out.println("There are ten teams in this tournament");
	}
    public void points()
    {
    	System.out.println("Each teams has two points when winning the match");
    }
}
