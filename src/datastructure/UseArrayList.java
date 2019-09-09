package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */
		List<String> statesOfusa = new ArrayList<>();
		statesOfusa.add("NY");
		statesOfusa.add("VA");
		statesOfusa.add("AR");
		statesOfusa.add("PA");

		List<String> statesOfCanada = new ArrayList<>();
		statesOfCanada.add("Vancouver");
		statesOfCanada.add("Montreal");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("USA", statesOfusa);
		map.put("Canada", statesOfCanada);


		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "" + entry.getValue());

		}

	}
}
