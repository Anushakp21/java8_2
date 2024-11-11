package java8;

public class DefaultDemo implements I
{
	public void show1()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		DefaultDemo d=new DefaultDemo();
		d.show();
	}
}
