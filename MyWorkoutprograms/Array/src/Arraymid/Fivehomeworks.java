package Arraymid;

public class Fivehomeworks
{
	void firstrepeat()
	{
		int arr[]= {1,2,3,3,4,4,5};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[i]);
					break;
				}
			}
		}
		
	}

}
