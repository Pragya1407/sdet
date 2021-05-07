package Activity3_1;

import java.util.HashSet;

public class Activity3_2 {
	
	public static void main(String[] args)
	
	{
		HashSet<String> hs =new HashSet<String>();
		hs.add("Rose");
		hs.add("Lily");
		hs.add("Lotus");
		hs.add("Sunflower");
		hs.add("Orchid");
		hs.add("Marigold");
		System.out.println("The size of the HashSet is " +hs.size());
		hs.remove("Lily");
		System.out.println(hs);
		hs.remove("Tiger");
		System.out.println("Check if Rose is present in the HashSet = " +hs.contains("Rose"));
		System.out.println("Check if Lily is present in the HashSet = " +hs.contains("Lily"));
		System.out.println("The updated set is " +hs);
	}

}
