package java8;

import java.util.function.Predicate;
interface m
{
	public void test(Integer num);
}

public class PredicaeDemo {
	public static void main(String[] args) {
		Predicate<Integer> pre=(num) -> num > 0;
		System.out.println(pre.test(-1));
	}

}
