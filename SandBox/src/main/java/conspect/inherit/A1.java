package conspect.inherit;

public class A1 {

    String a;

    {
        System.out.println("Init block Class A1");
    }

    public A1() {
        this.a = "Class A1";
        System.out.println("Constructor " + a);
    }
}
