package conspect.bluefield.task10;

public class C implements I{

    protected A a;

    public C(A a) {
        this.a = a;
    }

    @Override
    public void op() {
        System.out.print("c");
        a.op();

    }
}
