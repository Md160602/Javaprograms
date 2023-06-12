package Mathamatical;

public class Recfibonacci {public static void main(String[] args) 
{
	
	Recfibonacci obj=new Recfibonacci();
	obj.fibo(10);
}
    int first=-1;
    int second=1;
    int ans;
    public int fibo(int n)
     {
    	
    	if(n==0)
    	{
    		return 10;
    	}
    	ans=first+second;
    	System.out.println("The first ten fibonacci numbers are");
    	System.out.println(ans);
    	first=second;
	    second=ans;
	    return fibo(n-1);

     
     
     }

}
