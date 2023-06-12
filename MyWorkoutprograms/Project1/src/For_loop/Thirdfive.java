package For_loop;

public class Thirdfive {
	public static void main(String[] args) {
		Thirdfive obj3=new Thirdfive();
		obj3.div_all();
		obj3.sum();
		obj3.counting();
		obj3.reverse();
		obj3.add_rev();
		
	}
	public void div_all()
	{
		int given_num=25;
		for(int i=1;i<=given_num;i++)
		{
			if(given_num%i==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("_____________________");
			
	}
	public void sum()
	{
		int a=0;
		for(int num=333;num>0;num=num/10)
		{
			int n=num%10;
			a=a+n;
			
		}
		System.out.println(a);
		System.out.println("_____________________");
	}
	public void counting()
	{
		int count=0;
	
		for(int num=5456;num>0;num=num/10)
		{
			count++;
		}
		System.out.println(count);
		System.out.println("_____________________");
	}
	public void reverse()
	{
		int rev=0;
		for(int num=8608;num>0;num=num/10)
		{
			int a=num%10;
			rev=rev*10+a;
			
		}
		System.out.println(rev);
		System.out.println("_____________________");
	}
	public void add_rev()
	{
		int rev=0;
		int add=0;
		for(int num=8608;num>0;num=num/10)
		{
			int a=num%10;
			rev=rev*10+a;
		}
		    int sum=rev;
			for(;sum>0;sum=sum/10)
			{
				int a=sum%10;
				add=add+a;
				
			}
			System.out.println(add);
			System.out.println("---------------------");
		}
		
	}

	


