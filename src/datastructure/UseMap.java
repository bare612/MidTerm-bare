package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<String,Integer> keyValue = new HashMap<>();
		//add data
		keyValue.put("Denver",2);
		keyValue.put("Boston",2);
		keyValue.put("Virginia",5);
		Iterator it = keyValue.entrySet().iterator();

		System.out.println("My city is:");
		System.out.println("");
		while (it.hasNext()){
			Map.Entry setMap = (Map.Entry)it.next();
			System.out.println((setMap.getKey()+" :"+setMap.getValue()+"Years"));
		}
	}

}
