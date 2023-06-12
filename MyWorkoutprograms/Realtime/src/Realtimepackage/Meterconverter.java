package Realtimepackage;

import java.util.Scanner;

public class Meterconverter
{
	double one_meter=1000;
	double one_km=one_meter;
	void convert(double kilometer)
	{
		System.out.println("Given kilometer is "+kilometer);
		kilometer=kilometer*one_meter;
		System.out.println("Given kilometer in meter is  "+kilometer);
	}
	void revconvert (double meter)
	{
		System.out.println("Given meter is "+meter);
		meter=meter/one_km;
		System.out.println("Given meter in kilometer is "+meter);
	}
	public static void main(String[] args)
	{
		Meterconverter obj=new Meterconverter();
		System.out.println("Enter the kilometer ");
		Scanner object=new Scanner(System.in);
		double x=object.nextDouble();
		obj.convert(x);
		System.out.println("--------------------");
		System.out.println("Enter the Meter ");
		//Scanner object2=new Scanner(System.in);
		double y=object.nextDouble();
		obj.revconvert(y);
		//System.out.println("--------------------");
		
		
	}

}
