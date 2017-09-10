package Java8;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		int [] x = {0,5,10,15,20,25,30};
		Predicate<Integer> p1 = i->i>10;
		Predicate<Integer> p2 = i-> i%2==0;
		
		System.out.println("The numbers greater than 10 are:");
		m1(p1, x);
		System.out.println("The even numbers are:");
		m1(p2, x);
		System.out.println("The numbers are not greater than 10 are: ");
		m1(p1.negate(),x);
		System.out.println("The numbers are greater than 10 and even are: ");
		m1(p2.and(p1), x);
		System.out.println("The numbers are greater than 10 or even are: ");
		m1(p1.or(p2), x);
		
	}
	public static void m1(Predicate<Integer> p,int []x){
		for(int x1:x){
			if(p.test(x1)){
				System.out.println(x1+" ");
			}
		}
	}
}
