package java8;
@FunctionalInterface
 interface Demo {
	void show();
}
class Demo2
{
	public static void main(String[] args) {
		Demo d=() -> System.out.println("hello");
			d.show();
	}
}


