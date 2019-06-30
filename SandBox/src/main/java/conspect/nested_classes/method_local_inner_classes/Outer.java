package conspect.nested_classes.method_local_inner_classes;

public class Outer {

    void outerMethod() {
        final int num = 100;
        System.out.println("Метод внешнего класса " + num);
        // Внутренний класс является локальным для метода outerMethod()
        class Inner {
            public void innerMethod() {
                System.out.println("Метод внутреннего класса " + num);
            }
        }
        Inner inner = new Inner();
        inner.innerMethod();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.outerMethod();
    }
}

//Внутренний класс в локальном методе не может использовать локальные переменные
//внешнего метода до тех пор, пока локальная переменная не будет объявлена
//как финальная (final).