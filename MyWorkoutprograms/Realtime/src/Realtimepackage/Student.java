package Realtimepackage;

public class Student {
	private String name;    //ALL instance variable are private.
	private int reg_no;
	private String dept;
	private String college_name;
	private final static String Ins_name="Welcome Payilagam";
	boolean flag=false;
	Student(String name) //constructors are initialize the instance variable
	{                        //in case of customer come with only name.It will works.
		this.name=name;
	}
	Student(String name,int reg_no) //If customer the come with name and roll_no.It will works.
	{
        this.name=name;
		this.reg_no=reg_no;
	}
	Student(String name,int reg_no,String dept)  //If customer the come with name,dept and roll_no.It will works.  
	{
		this.name=name;
		this.reg_no=reg_no;
		this.dept=dept;
	}
	Student(String name,int reg_no,String dept,String college_name)   //If customer the come with all the necessary details .It will works.
	{
		this.name=name;
		this.reg_no=reg_no;
		this.dept=dept;
		this.college_name=college_name;
	}
	Student() //If the customer come with not  any details.It will works.
	{
		//flag=true;
		System.out.println("Please give me your Details ");
	}
	void setreg_no(int reg_no)   //THis method is used to set reg_no.
	{
		this.reg_no=reg_no;
	}
	void setdept(String dept)    //THis method is used to set dept.
	{
		this.dept=dept;
	}
	void setcollege_name(String college_name)    //THis method is used to college_name.
	{
		this.college_name=college_name;
	}
	int getreg_no()    //THis method is used to get reg_no.

	{
		return reg_no;
	}
	String getdept()    //THis method is used to get dept.
	{
		return dept;
	}
	String getcollege_name()   //THis method is used to get college_name.
	{
		return college_name;
	}
	//Override the Object class method and the method name is toString.
	    public String toString()
    {
    	return(Ins_name +" "+"Studen name is "+name+" "+"Stydent reg no is "+reg_no+" "+"Student college name is "+college_name+" "+"Student department is "+dept);
    	
    }
	
    
    
}
