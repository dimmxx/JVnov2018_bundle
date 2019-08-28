package conspect.bluefield.task10;

public class M {

    public void opi(I... i) {
		for (I x : i)
			x.op();
	}
	public static void main(String[] args) {
		A o1 = new B();
		B o2 = new B();
		C o3 = new C(o1);
		D o4 = new D(o2);
		new M().opi(o1, o2, o3, o4);
	}





}
