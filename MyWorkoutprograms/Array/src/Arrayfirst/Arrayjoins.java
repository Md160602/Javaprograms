package Arrayfirst;

public class Arrayjoins 
{
	public static void main(String[] args) 
	{
		int a[]= {7,3,5,1,9};
		int b[]= {3,4,8,1};
		int count=0;
	    for(int i=0;i<b.length;i++)
	    {
	    	for(int j=0; j<a.length;j++)
	    	{
	    		if(b[i]==a[j])
	    		{
	    			count++;
	    			break;
	    		}
	    	}
	    }
	   // System.out.println(count);
         
	    
	   
	    int c[]=new int[a.length+b.length-count];
	    System.out.println( "C array length is "+c.length);
		
		  for(int i=0;i<a.length;i++) {
			  c[i]=a[i]; 
		  }
		 
	    int kavn=a.length;
	   
	    
	    for(int i=0;i<b.length;i++)
	    {
	    	 boolean flag=false;
	    	for(int j=0;j<a.length;j++)
	    	{
	    		if(b[i]==a[j])
	    		{
	    			flag=true;
	    			break;
	    			
	    		}
	    	}//
	    
	    	  // System.out.println(flag);
	    
	    	   if(flag==false)
	    	   {
	    	      c[kavn]=b[i];
	    	      kavn++;
	    	   }
	    	   
	    }
	    for(int i=0;i<c.length;i++)
	    {
	    	System.out.println(c[i]);
	    }
	}
	    	 
	    	
	    
	    
	    
	    
	    
	    
	
}
