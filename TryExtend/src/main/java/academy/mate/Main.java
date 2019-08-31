package academy.mate;


class A {
    int a = 2, b = 3;

    public void display() {
        int c = a + b;
        System.out.println(c);
    }
}

class B extends A {

    int a = 5;
//    B(){
//        a = 5;
//        b = 6;
//    }

}


public class Main {

    public static void main(String arr[]) {
        A x = new A();
        B y = new B();
        x.display();
        y.display();
        System.out.println(y.a);
    }
}


