package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListStream {

	public static void main(String[] args) {
		/* Create Arraylist and then return double of that element and 
		 * store it into second object
		*/
		List<Integer> l1 = new ArrayList<>();
		l1.add(0);
		l1.add(10);
		l1.add(15);
		l1.add(20);
		l1.add(25);
		
		List<Integer> l2 = new ArrayList<>();
		System.out.println("Java 7 approach");
		System.out.println("l1 = "+l1);
		for (Integer i:l1){
			l2.add(i*2);
		}
		System.out.println("l2 = "+l2);
		
		System.out.println("\nJava 8 approach");
		System.out.println("l1 = "+l1);
		List<Integer> l3 = l1.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println("l3 = "+l3);
	}
}
