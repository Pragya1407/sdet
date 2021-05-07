package Activity3_1;
import java.util.ArrayList;

public class Activity3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Tom");
		myList.add("Ram");
		myList.add("Jhon");
		myList.add("Harry");
		myList.add("Marry");
		System.out.println("All the name of the array are:" );
		for(String S:myList)
			
		System.out.println(S);
		System.out.println("The 3rd name in the ArrayList is " + myList.get(2));
		System.out.println("Is Tom exist in the ArrayList " + myList.contains("Tom"));
		
		System.out.println("the number of names in the ArrayList =" + myList.size());
        myList.remove(3);
        myList.remove("Tom");
		System.out.println("the number of names in the updated ArrayList =" + myList.size());
	}

}
