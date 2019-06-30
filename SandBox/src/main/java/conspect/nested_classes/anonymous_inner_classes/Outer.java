package conspect.nested_classes.anonymous_inner_classes;

//Анонимные внутренние классы объявляются без указания имени класса.
//Они могут быть созданы двумя путями:
//
//-------Как наследник определённого класса:


//public class Outer {
//
      //// Анонимный класс наследуется от класса Demo
//    static Demo demo = new Demo() {
//        @Override
//        public void show() {
//            super.show();
//            System.out.println("Inner Anonymous Class method");
//        }
//    };
//
//    public static void main(String[] args) {
//        demo.show();
//    }
//
//}
//
//class Demo {
//    public void show() {
//        System.out.println("Superclass method");
//    }
//}


//-------Как реализация определённого интерфейса:

public class Outer {

    // Анонимный класс, который реализует интерфейс Hello
    static Hello hello = new Hello() {
        @Override
        public void show() {
            System.out.println("Метод внутреннего анонимного класса");
        }
    };

    public static void main(String[] args) {
        hello.show();
    }
}

interface Hello {
    void show();
}