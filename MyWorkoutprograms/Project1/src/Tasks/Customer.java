package Tasks;

public class Customer 
{
	private String name;
	private long adhar_id;
	private String ifsc;
	private int bank_bal;
  
	  
	 Customer()
	{
		ifsc="IDB160602";
	}
	 
	
	Customer(String name)
	{
		this();
		this .name=name;
	}
	Customer(String name,long adhar_id)
	{
		this();
		this.name=name;
		this .adhar_id=adhar_id;
	}
	Customer(String name,int bank_bal,long adhar_id)
	{
		this();
		this.name=name;
		this.bank_bal=bank_bal;
		this.adhar_id=adhar_id;
	}
	void setadhar(long adhar_id)
	{
		this. adhar_id=adhar_id;
	}
	void setbankbal(int bank_bal)
	{
		this.bank_bal=bank_bal;
	}
	void setname(String name)
	{
		this.name=name;
	}
	long getadhar()
	{
	     return adhar_id;
	}
	int getbankbal()
	{
		return bank_bal;
	}
	String getname()
	{
		return name;
	}
	void display()
	{
		System.out.println("Customer name is "+this.name+" " +"Customer adhar id is "+this.adhar_id+" "+"Customer bank bal is "+this.bank_bal+" "+"Customer ifsc id is "+this.ifsc);
	    
	}
	void eligible()
	{
		
		     if(bank_bal>=2000)
		      {
			    System.out.println(name+" is eligible for the loan");
			
		       }
		     else
		      {
			    System.out.println(name+"  is not eligible for the loan");
		       }
		}
				
	}
			
	
	



