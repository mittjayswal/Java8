package Java8;

import java.util.function.Consumer;

public class ConsumerBasic {

	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		c.accept("Hello");
		c.accept("How are you? ");
	}
}
