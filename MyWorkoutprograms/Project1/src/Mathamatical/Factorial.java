package Mathamatical;

public class Factorial {
	public static void main(String args[])
	{
		Factorial obj=new Factorial();
		int ans=obj.fact(5);
		System.out.println(ans);
		
		
	}
    public int fact(int n)
    {
    	if(n==1)
    	{
    		return 1;
    	}
    	else
    	{
    		return (n*fact(n-1));    	
        }
    }
    
}
