package conspect.nested_classes.static_nested_classes;

public class Outer {
    // Статический внутренний класс
    static class Inner {
        private void show() {
            System.out.println("Метод внутреннего класса");
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}

//Статические вложенные классы технически не являются внутренними классами.
//По сути, они представляют собой члены внешнего класса