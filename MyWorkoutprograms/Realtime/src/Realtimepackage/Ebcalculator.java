package Realtimepackage;

import java.util.Scanner;

public class Ebcalculator implements Ebbill
{
	String cus_name;
	int cus_id;
	
	Ebcalculator()
	{
		String name="TNEB";
		System.out.println(name);
	}
	
	 Ebcalculator(String cus_name,int cus_id) 
	 {
		 this();
	   this.cus_name=cus_name;
	   System.out.println("Customer Name is "+cus_name);
	   this.cus_id=cus_id;
	   System.out.println("Customer ID is "+cus_id);
	 }
	 
	
	
	double bill_amount=0;
	
	
	 public void calc(double watts)
	 {
		 double wats; wats=watts;
	  
	  if(wats<501) 
	  {
		  if(wats>0 && wats<=100)
		  {
	  
	      }
		  else if(wats>100 && wats<201)
		  { 
			  bill_amount=((wats-100)*2.25);
	  
	        }
		  else if(wats>200 && wats<401)
		  {
			  bill_amount=(200-100)*2.25+(wats-200)*4.50;
	  
	       } 
		  else
		  {
			  bill_amount=(wats-400)*6.00+(400-200)*4.50+(200-100)*2.25;
	  
	  }
		 
	  System.out.println("Your using wats is "+wats+"."+"Your paying amount is "+bill_amount); 
	  
	  }
}
	 
	public void calc2(double watts)
	
	{
		double wats=watts;
		double bill_amount=0;
	
		if(wats>500)
		{
			 if(wats>100 && wats<401)
			{
				bill_amount=(wats-100)*4.50;
			}
			else if(wats>400 && wats<501)
			{
				bill_amount=(wats-400)*6.00+(400-100)*4.50;
			}
			else if(wats>500 && wats<601)
			{
				bill_amount=(wats-500)*8.00+(500-400)*6.00+(400-100)*4.50;
			}
			else if(wats>600 && wats<801)
			{
				bill_amount=(wats-600)*9.00+(600-500)*8.00+(500-400)*6.00+(400-100)*4.50;
			}
			else if(wats>800 && wats<1001)
			{
				bill_amount=(wats-800)*10+(800-600)*9.00+(600-500)*8.00+(500-400)*6.00+(400-100)*4.50;
			}
			
			else if(wats>1000)
			{
				bill_amount=(wats-1000)*11+(1000-800)*10+(800-600)*9.00+(600-500)*8.00+(500-400)*6.00+(400-100)*4.50;

			}
			 System.out.println("Your using wats is "+wats +"."+"Your paying amount is "+bill_amount);
		}
		
	}
	public static void main(String[] args) 
	{
		
		
		Ebbill object=new Ebcalculator("Mahadevan",12345);
		System.out.println("Enter Your wats value");
		Scanner obj=new Scanner(System.in);
		double x=obj.nextDouble();
		 
		object.calc(x);
		
		System.out.println("--------------------");
		
		
		 
		  Ebbill object2=new Ebcalculator("Lajeem",54321); object2.calc(155);
		  System.out.println("--------------------"); Ebbill object3=new
		  Ebcalculator("Dinesh",67890); object3.calc(300.00);
		  System.out.println("--------------------"); Ebbill object4=new
		  Ebcalculator("Senthil",45678); object4.calc(489.00);
		  System.out.println("--------------------"); Ebbill object5=new
		  Ebcalculator("Kaveen",54567); object5.calc(499.99);
		  System.out.println("--------------------"); Ebbill object6=new
		  Ebcalculator("Nehru",10987); object6.calc2(750);
		  System.out.println("--------------------"); Ebbill object7=new
		  Ebcalculator("Selva",34257); object7.calc2(1000);
		  System.out.println("--------------------"); Ebbill object8=new
		  Ebcalculator("Chandru",22145); object8.calc2(1200);
		  System.out.println("--------------------"); Ebbill object9=new
		  Ebcalculator("Vasanth",14567); object9.calc2(2000);
		 
		 System.out.println("--------------------"); Ebbill object10=new
		  Ebcalculator("Jayasheelan",23456); object10.calc(200);
		 
	}
	

}
