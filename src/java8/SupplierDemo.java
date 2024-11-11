package java8;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Random random=new Random();
		Supplier<Integer> sup=() -> random.nextInt(100);
		
		int randomvalue=sup.get();
		System.out.println(randomvalue);
	}

}
