package mate.generics1;

public class DemoDog {

    public static void main(String[] args) {

        Dog<Integer> dogInt = new Dog(15);

        System.out.println(dogInt.toString());

        System.out.println(dogInt.getObject());

        dogInt.setObject(4);

        System.out.println(dogInt.getObject());

        Dog<String> dogStr = new Dog<>("Heloo");

        System.out.println(dogStr.toString());








    }




}
