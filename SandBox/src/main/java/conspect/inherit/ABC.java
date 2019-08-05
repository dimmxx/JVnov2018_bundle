package conspect.inherit;

public class ABC {

    public static void printlnLine() {
        System.out.println("------------------------");
    }


    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();

        a.printX();
        b.printX();
        c.printX();

        printlnLine();

        a.printA();
        b.printB();
        c.printC();

        printlnLine();

        System.out.println(a.x);
        System.out.println(b.x);
        System.out.println(c.x);

        printlnLine();

        System.out.println(a.x);
        System.out.println(((A)b).x);
        System.out.println(((A)c).x);

        printlnLine();

        b.printA();
        c.printA();
        c.printB();

        printlnLine();

        A ab = new B();
        ab.printA();
        ((B)ab).printB();
        printlnLine();

        B bc = new C();
        bc.printA();
        bc.printB();
        ((C)bc).printC();





    }


}
