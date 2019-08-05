package conspect.inherit;

public class C1 extends B1 {

    String c;

    {
        System.out.println("Init block Class C1");
    }

    public C1() {
        this.c = "Class C1";
        System.out.println("Constructor " + c);
    }








}
