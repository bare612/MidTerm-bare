package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
         Queue<String> que = new LinkedList<String>();

         que.add("JOHN");
         que.add("HASSAN");
         que.add("LOLA");

		System.out.println(que.poll());
		System.out.println(que.poll());
		System.out.println(que.peek());




	}

}
