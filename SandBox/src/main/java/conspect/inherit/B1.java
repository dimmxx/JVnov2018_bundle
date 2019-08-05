package conspect.inherit;

public class B1 extends A1{

     String b;

    {
        System.out.println("Init block Class B1");
    }

    public B1() {
        this.b = "Class B1";
        System.out.println("Constructor " + b);
    }







}
