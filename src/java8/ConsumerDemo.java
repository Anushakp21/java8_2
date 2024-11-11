package java8;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<Integer> cons=(value) -> System.out.println(value);
		cons.accept(2);
	}

}
