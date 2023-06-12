package For_loop;

public class Fourthfive {
	public static void main(String[] args) 
	{
		Fourthfive obj4=new Fourthfive();
		obj4.prime();
		obj4.prime_boolean();
		obj4.rev_natural();
		obj4.rev_prime();
		obj4.sum_prime(); 
	}
	public void prime()
	{
		int num=13;
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
			if(count==2)
			{
				System.out.println(num+" It is a prime number");
			}
			else
			{
				System.out.println(num+" It is not a prime number");
			}
			System.out.println("_____________________");
	}
	public void prime_boolean()
	{
		boolean flag=false;
		int num=77;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=true;
				break;
			}
		}
			if(flag=true)
			{
			    System.out.println(num+" It is not a prime number");
			}
			else
			{
				System.out.println(num+" It is a prime number");
			}
			System.out.println("_____________________");
		}
     public void rev_natural()
     {
    	 for(int num=10;num>0;num--)
    	 {
    		 System.out.println(num);
    	 }
    	 System.out.println("_____________________");
     }
     public void rev_prime()
     {
    	 int rev=0;
    	 for(int num=123;num>0;num=num/10)
    	 {
    		 int a=num%10;
    		 rev=rev*10+a;
    	 }
    	 System.out.println(rev+" is a reverse of given number ");
    	 int count=0;
    	 for(int i=1;i<=rev;i++)
    	 {
    		 if(rev%i==0)
    		 {
    			 count++;
    		 }
    	 }
    	 if(count==2)
    	 {
    		 System.out.println(rev+" is a prime number");
    	 }
    	 else
    	 {
    		 System.out.println(rev+" is not a prime number");
    	 }
    	 System.out.println("_____________________");
     }
     public void sum_prime()
     {
    	 int sum=0;
    	 int count=0;
    	 for(int num=777;num>0;num=num/10)
    	 {
    		 int a=num%10;
    		 sum=sum+a;
    	 }
    	 System.out.println("Sum of the number is "+sum);
    	 for(int i=1;i<=sum;i++)
    	 {
    		 if(sum%1==0)
    		 {
    			 count++;
    		 }
    	 }
    	 if(count==2)
    	 {
    		 System.out.println(sum+" It is prime number");
    	 }
    	 else
    	 {
    		 System.out.println(sum+" It is not a prime number ");
    	 }
     }

}
