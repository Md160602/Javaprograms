package simple;

public class Factorial {
	public static void main(String args[])
	{
	  Factorial object=new Factorial();
	  object.fact(5);
	}
	int ans=1;
	public void fact(int n)
	{
		ans=ans*n;
		if(n>0)
		{
			fact(n-1);
		}
		System.out.println(ans);
	}

}
