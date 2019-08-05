package conspect.inherit;

public class C extends B {

    String x = "class c";

    void printC(){
        System.out.println(x);
        System.out.println("From c: " + ((B)this).x);
        System.out.println("From c: " + ((A)this).x);
        System.out.println("From c: " + super.x);
    }




}
