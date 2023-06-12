package Tasks;

public class Sample
{
	private String atm_pin="****";                    //In this line my atmpin is an private
	
	public void setpin (String pin)                  //so it cannot access outside of the class
	{
		if(atm_pin=="4")
		{
		pin=atm_pin;
		} 
		else
		{
			System.out.println("Please Enter a valid pin");                     
		}

	}
	public String getpin ()
	{
		return atm_pin;
	}

}
