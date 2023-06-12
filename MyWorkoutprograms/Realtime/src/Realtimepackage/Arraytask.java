package Realtimepackage;

import java.util.Scanner;

public class Arraytask
{
	Scanner scan=new Scanner(System.in);
	int size=scan.nextInt();


	public static void main(String[] args)
	{
		Arraytask object=new Arraytask();
		object.ageCalculatin();
	}
       void ageCalculatin()
	{
		System.out.println("Enter the array Size");
		int ary[]=new int[size];
		for(int i=0;i<ary.length;i++)
		{
			System.out.println(ary[size]);
		}
	}

}
