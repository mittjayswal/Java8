package Java8;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<String, Integer> f = s-> s.length();
		System.out.println(f.apply("mitt"));
		System.out.println(f.apply("check if function working"));
		
		
	}
}
