package Arraymid;


public class Binary_search 
{
	public static void main(String[] args) 
	{
		Binary_search obj=new Binary_search();
		obj.removeelement();
		obj.removeindex();
		obj.addelement();
		obj.method();
		
	}
	void method()
	{
	   System.out.println("Binary search ;");
	   int s_arr[]= {-5,-3,0,1,2,3,4,5,9,12,13,15};
	   int lower=0;
	   int higher=s_arr.length;
	   int find_num=-5;
	   int middle=lower+higher/2;
	    while(lower<=higher)
	   {
		  if(find_num==s_arr[middle])
		   {
			   System.out.println("Your searching element is present in "+middle+" Index");
			   System.out.println("Yes Your searching number is "+s_arr[middle]);
			   break;
		   }
		  
				   
		   if(find_num>s_arr[middle])
		   {
			   lower=middle+1;
			   middle=(middle+higher)/2;
			   
		   }
		   if(find_num<s_arr[middle])
		   {
			   higher=middle-1;
			   middle=(lower+middle)/2;
			   
		   }
		   
		}
	     
	 }
	void removeelement()
	{
		int arr[]= {1,2,3,4,5};
		System.out.println("Your given array is ");
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After removing 3 or user given element");
		//System.out.println();
		int brr[]=new int[arr.length-1];
		int rem=3;
		int temp=0;
		for(int i=0;i<arr.length;i++ )
		{
			if(arr[i]!=rem)
			{
				System.out.println(brr[temp]=arr[i]);
				temp++;
			}
			
		}
		System.out.println("-------------------------");
		
	}
	void removeindex()
	{
		int arr[]= {9,8,7,6,5};
		System.out.println("Your given array is ");
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After removing 3 or user given index");
		int remin=3;
		int temp=0;
		int brr[]=new int[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=arr[remin])
			{
				System.out.println(brr[temp]=arr[i]);
				temp++;
			}
		}
		System.out.println("-------------------------");
	}
	void addelement()
	{
		int arr[]= {1,2,4,5,6};  //E/O={1,2,3,4,5,6}  
		System.out.println("Your given array is ");
		for(int i=0;i<arr.length;i++)
		{
		   System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("After adding the 3  element in index of 2");
		int addele=3;
		int addindex=2;
		int temp=0;		
		int brr[]=new int[arr.length+1];
		for(int i=0;i<brr.length;i++)
		{
			if(i==addindex)
			{
				System.out.println(brr[i]=addele);
			}
			if(i!=addindex)
			{
			System.out.println(brr[i]=arr[temp]);
			temp++;
			}
			
		}
				
	}
	   
	   
	

}
