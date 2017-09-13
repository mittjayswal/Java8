package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {

	/* 1. Find the string which length is greater than =4 
	 * 2. and convert all elemenst into uppercase
	 * 3. count the number of element in arraylist >=4*/
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Mitt");
		l.add("ab");
		l.add("abc");
		l.add("Yatin");
		l.add("Krunal");
		
		System.out.println("original arraylist l = "+l);
		List<String> l1 = l.stream().filter(s->s.length()>=4).collect(Collectors.toList());
		System.out.println("l1 (4 or more letter) = "+l1);
		
		System.out.println("\nTo convert all the elements of arraylist into uppercase ");
		List<String> l2 = l.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(l2);
		
		Long count = l.stream().filter(s->s.length()>=4).count();
		System.out.println("\nThe number of strings whose lenght >=4 is = "+count);
	}
}
