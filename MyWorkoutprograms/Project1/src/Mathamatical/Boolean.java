package Mathamatical;

public class Boolean {
	public static void main(String args[])	//This method is find prime num using boolean gates.
	{
		Boolean obj=new Boolean();
		obj.primes(77);
	}
	public void primes(int num)
	{
		boolean flag=false;
		int n=2;
		while(n<num/2)
		{
			if(num%n==0)				//if num have atleast on div its a prime.
			{
				flag=true;
				break;
			}
			n++;
		}
			if(flag==true)
			{
				System.out.println("Its not a prime");
			}
			else
			{
				System.out.println("Its a prime number");
			}
		   	
		
	}

}
