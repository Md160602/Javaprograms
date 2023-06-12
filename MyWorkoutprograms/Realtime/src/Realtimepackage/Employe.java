package Realtimepackage;

public class Employe 
{
	private String name;
	private int age;
	private long adhar_no;
	private long ph_no;
	public Employe(String name, int age, long adhar_no,long ph_no) 
	//Constructor are used to initialize the instant variable
	{
		//super();
		this.name = name;
		this.age = age;
		this.adhar_no = adhar_no;
		this.ph_no=ph_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getAdhar_no() {
		return adhar_no;
	}
	public void setAdhar_no(long adhar_no) {
		this.adhar_no = adhar_no;
	}
	public void setph_no(long ph_no)
	{
		this.ph_no=ph_no;
		
	}
	public long getph_no()
	{
		return ph_no;
	}
	@Override
	public String toString()   //override the object class toString method
	{
		return "Employe name is "+name+
			   " ,Empoye age is "+age+
			   " ,Employe adhar number is "+adhar_no+
			   " , Employe phone number is "+ph_no;
	}
	@Override
	
	  public int hashCode() //override the  object class hashcode method
	{ 
		return (age);
	}

	@Override
	public boolean equals(Object obj) //override the object class equals method. 
	{
		
		Employe other = (Employe) obj;
		
		if (this.adhar_no==other.adhar_no)
		{
			System.out.println(this.name+" adhar number is equal to "+other.name +" Adhar number.");
			return true;
		}
		return false;
	}
	 
	public static void main  (String[] args)
	{
		System.out.println();
		Employe Employe1=new Employe("Devan",23,1234001,86089285);
		System.out.println(Employe1);
		System.out.println("----------------");
		Employe Employe2=new Employe("Chandru",25,1234002,99423057);
		System.out.println(Employe2);
		System.out.println("----------------");
		Employe  Employe3=new Employe("Selva",24,1234003,86758445);
		System.out.println(Employe3);
		System.out.println("----------------");
		Employe  Employe4=new Employe("Vasanth",22,1234004,73973230);
		System.out.println(Employe4);
		System.out.println("----------------");
		Employe  Employe5=new Employe("Mahadevan",20,1234001,75027123);
		System.out.println(Employe5);
		System.out.println("----------------");
		System.out.println(Employe1.hashCode());
		System.out.println("----------------");
		System.out.println(Employe1.equals (Employe2));
		System.out.println("----------------");
		System.out.println(Employe1.equals (Employe3));
		System.out.println("----------------");
		System.out.println(Employe1.equals (Employe4));
		System.out.println("----------------");
		System.out.println(Employe1.equals (Employe5));
		System.out.println("----------------");
		System.out.println(Employe1==Employe2);
		
	}
	

}
