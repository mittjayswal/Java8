package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PracticeJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Mitt", "Mazz", 25),
				new Person("Yatin", "Panchal", 25),
				new Person("Selvin", "Galchar", 28),
				new Person("swami", "Thakkar", 16)
				);
		
		//Step 1: sort list by last name
		Collections.sort(people, (o1,o2)->o1.getLastName().compareTo(o2.getLastName()));
		
		//step2:create method that prints all data
		System.out.println("Printing all Elemeents in list");
		printConditionally(people,p->true,p->System.out.println(p));
		
		//step3:create method that prints last nam estart with m
		System.out.println("Person Start with last Name = m");
		printConditionally(people,p->p.getLastName().startsWith("M"),p->System.out.println(p.getLastName()));
	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate,Consumer<Person> consumer) {

		for(Person p:people){
			if(predicate.test(p)){
				consumer.accept(p);
			}
		}
	}

	
}
