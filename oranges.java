import java.util.*;
public class oranges{
	public static void main(String[] args){
		List<String> list1 = new LinkedList<String>();
		list1.add("apples");
		list1.add("fruits");
		list1.add("topspin");
		list1.add("pudding");
		list1.add("plumpie");
		System.out.println("Contents of List1: ");
		output(list1);
		
		String[] moar = {"reborn", "freee", "fire", "stress"};
		List<String> list2 = new LinkedList<String>(Arrays.asList(moar));
		System.out.println("Contents of list2: ");
		output(list2);
		
		list1.addAll(list2);
		list2 = null;
		System.out.println("After adding all the contents in List: ");
		output(list1);
		Collections.sort(list1);
		output(list1);
		
		Collections.reverse(list1);
		output(list1);
		
		Collections.fill(list1, "Feel the love");
		output(list1);
	}
	
	private static void output(List<String> l1){
		for(String x : l1){
			System.out.printf("%s ", x);
		}
		System.out.println();
	}
}