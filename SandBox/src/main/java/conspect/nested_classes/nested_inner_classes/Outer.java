package conspect.nested_classes.nested_inner_classes;

public class Outer {
    // Простой вложенный класс
    class Inner {
        public void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }

//    вложенный внутренний класс не может содержать в себе статических
//    методов или статических полей. Это связано с тем что,
//    внутренний класс неявно связан с объектом своего внешнего класса,
//    поэтому он не может объявлять никаких статических методов внутри себя.
}

