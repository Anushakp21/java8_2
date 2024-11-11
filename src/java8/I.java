package java8;

public interface I {
	default void  show()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		I i=new I(){
			@Override
			public void show()
			{
				System.out.println("he");
			}
		};
			i.show();
	}
}
