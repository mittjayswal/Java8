package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SortedExample {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(10);
		l.add(1);
		l.add(2);
		l.add(25);
		
		System.out.println("Befor sorting: "+l);
		List<Integer> l1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("after default sortiing"+l1);
		
		List<Integer> l2 = l.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("\nCustomized descending order: "+l2);
		
		Integer min = l.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum value in arraylist = "+min);
		
		Integer max = l.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Maximum value in arraylist = "+max);
		
		System.out.println("\nFor each of java 8");
		l.stream().forEach(System.out :: println);
		
		System.out.println("\nconvert strem to array");
		Integer [] array = l.stream().toArray(Integer [] :: new);
		for (int x : array){
			System.out.println(x);
		}
		
		System.out.println("\nUse of Strem.of method : ");
		Stream<Integer> s = Stream.of(1,22,333,4444,5555);
		s.forEach(System.out :: println);
		
		Double [] d = {10.0,11.22,55.67};
		Stream<Double> s1 = Stream.of(d);
		s1.forEach(i -> System.out.print(i+","));
		
				
	}
}
