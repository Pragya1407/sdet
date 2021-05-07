package Activity3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Random indexGen = new Random();
		System.out.println("Enter the integer number to continue and non integer number to terminate");
		while(scan.hasNextInt())
			list.add(scan.nextInt());
		System.out.println("Enter the number:"+list);
		
		Integer nums[] = list.toArray(new Integer[0]);
        int indexnew = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + indexnew);
        System.out.println("Value in arary at generated index: " + nums[indexnew]);

		
        scan.close();
	}

}
