package conspect.lamba.German;

@java.lang.FunctionalInterface
public interface FunctionalInterface<T> {

    T doSomething(T o);

    default void example(){
        System.out.println("Default method");
    }

}
