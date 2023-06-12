package Tasks;

public class Bank_check
{
	public static void main(String[] args) {
		Bank c= new Bank();
		c.credit(500);
		c.credit(250);
		c.depit(700);
		c.check_bal();
		//System.out.println(bal);
	}

}
