package Inheritance;   //This package name is Inheritance.

import Tasks.Mahadevan;  //protected modifiers working at wherever outside of the class and
                         //outside of the package but  when we use extends keyword using time only it will work.


public class Run extends Mahadevan     //protected modifiers working in outside of the package.
{
	
	 public static void main(String[] args)   
 	{
		
		Run object =new Run();
		object.accbal();
		object.age();
		object.atm_pin();
		System.out.println(object.balance);
		System.out.println(object.my_age);
		System.out.println(object.pin);
		
		
	}

}
