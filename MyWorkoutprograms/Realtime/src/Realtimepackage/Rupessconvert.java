package Realtimepackage;
import java.util.Scanner;

public class Rupessconvert 
{
	
	double one_rupees=82.86;
	double one_dollar=one_rupees;
	void convert(double dollar)
	{
		System.out.println("Given american dollar is "+dollar);
		dollar=dollar*one_rupees;
		System.out.println("Given dollar in indian rupees is "+dollar);
	}
	void convert2(double rupess)
	{
		System.out.println("Given indian rupees is "+rupess);
		rupess=rupess/one_dollar;
		System.out.println("Given rupess in USA dollar is "+rupess);
		
	}
	public static void main(String[] args)
	{
		Rupessconvert obj=new Rupessconvert();
		System.out.println("Enetr the USA dollar");
		Scanner scan=new Scanner(System.in);
		double x=scan.nextDouble();
		
		obj.convert(x);
		System.out.println("---------------------");
		System.out.println("Enter the Indain rupees");
		double y=scan.nextDouble();
		obj.convert2(y);
		
	}

}
