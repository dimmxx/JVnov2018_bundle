package mate.generics1;

public class Dog <T> {

    T object;

    public Dog(T object){
        this.object  = object;
    }

    public T getObject(){
        return object;
    }

    public void setObject(T o){
        object = o;
    }

//@Override
//    public String toString(){
//        return "Dog object is " + object;
//    }


    @Override
    public String toString() {
        return "Dog{" +
                "object=" + object + ", object class: " + object.getClass() +
                '}';
    }
}
