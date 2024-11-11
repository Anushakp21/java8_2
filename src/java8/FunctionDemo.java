package java8;

import java.util.function.Function;

public class FunctionDemo {
	public static void main(String[] args) {
		Function<Integer, Integer> func=(value) -> value*value;
		System.out.println(func.apply(8));
	}

}
