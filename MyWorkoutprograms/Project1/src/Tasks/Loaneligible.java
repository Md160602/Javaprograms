package Tasks;

public class Loaneligible
{
	public static void main(String[] args)
	{
		
	System.out.println("                                     ");
	Customer Dinesh=new Customer("Dinesh");
	Customer lajeem=new Customer( "Lajeem");
	Customer kavin=new Customer("Kavin" , 7557_0226_1627l);
	Customer senthil=new Customer("Senthil" ,5000,7832_9344_6131l);
	Customer nehru =new Customer();
	
	
	senthil.display();
	nehru.display();
	kavin.display();
	
	Dinesh.setadhar(4506_9875_0000l);
	Dinesh.getadhar();
	Dinesh.setbankbal(100000);
	Dinesh.getbankbal();
	
	Dinesh.display();
	lajeem.setbankbal(1500);
	lajeem.getbankbal();
	lajeem.display();
	
	System.out.println("---------------------------");
	
	Dinesh.eligible();
	lajeem.eligible();
	kavin.eligible();
	senthil.eligible();
	nehru.eligible();
	
	}
	

}
