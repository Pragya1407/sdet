package JavaActivity2;
public class Activity2 {

	public static void main(String[] args)
				
		// TODO Auto-generated method stub
	 {
		int i=0,alen,sum=0;
		
		int [] arr1 = {10, 77, 10, 54, -11, 10};
		
		alen = arr1.length;
		
			for( i=0; i<=(alen-1); i++)
		{
		       if(arr1[i]==10)
		       {
				sum=sum+10;
		     
		       }
		}
		System.out.println("the sum is  "+sum);
		if(sum==30)
		{System.out.println("The value is equal to 30.");}
		else
		{System.out.println("The value is not equal to 30.");}
	}

}
