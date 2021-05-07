package Activity3_1;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println("The Queue is "+q);
		q.remove(3);
		System.out.println("The updated Queue is"+q);
		System.out.println("The first number of the Queue is "+q.peek());
		System.out.println("The size of the Queue is " +q.size());
		System.out.println("The updated Queue is " + q);


	}

}
