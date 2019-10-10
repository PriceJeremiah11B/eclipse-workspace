
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

		//this is a simple list, or array that goes into a Collection.
	
		public static void main(String[] args) {
			String[] fruit = { "Apples", "Pears", "Tomatoes", "Grapes"};
			
			System.out.println("Standard fruity array " + fruit + "\n");
			
			List<String> fruitList = new ArrayList<String>(Arrays.asList(fruit));
			
			System.out.println("This is a List: " + fruitList + "\n");
			fruitList.add("Apples");
			fruitList.add("Grapes");
			//these are duplicate values, which the array will allow to add, regardless.
			//the array is non-bias against the data.
			
			System.out.println("List after adding things: " + fruitList + "\n");
			
			//unsorted
			Set<String> fruitSet = new HashSet<String>(fruitList);
			System.out.println("This is an unsorted set: " + fruitSet);
			
			//sorted
			TreeSet<String> fruitTree = new TreeSet<String>(fruitList);
			fruitList.add("Bananas");
			
			//key/value unsorted
			Map<String, Integer> fruitHashYum = new HashMap<>();
			fruitHashYum.put("Banana", 10000);
			fruitHashYum.put("Pear", 5553200);
			System.out.println("Unsorted Map " + fruitHashYum);
			
			//key/value sorted
			Map<String, Integer> fruitTreeMap = new TreeMap<>();
			fruitTreeMap.put("Banana", 10000);
			fruitTreeMap.put("Pear", 5553200);
			System.out.println("Sorted Map " + fruitTreeMap);
			
			
		}
	
	
			
			
		}
