package conspect.bluefield.task11;

public class M {

    static void m(Class<? extends A> T, A... o) {
		for (A e : o)
			if (T.isInstance(e))
				System.out.print("a");
	}
	public static void main(String... args) {

    	A[] item = new A[]{new X(), new Y()};

    	m(X.class, item);

		System.out.println("\n" + item[0].getClass().getName());
		System.out.println(item[1].getClass().getName());
		System.out.println(item.getClass().getName());
	}





}
