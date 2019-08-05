package conspect.inherit;

public class B extends A {

    String x = "class b";

    void printB(){
        System.out.println(x);
        System.out.println("From b: " + ((A)this).x);
    }



}
