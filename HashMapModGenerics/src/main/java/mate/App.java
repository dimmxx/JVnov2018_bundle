package mate;

public class App {
    public static void main(String[] args) {

        HashMapM<Integer, String> hm = new HashMapM();


        hm.put(2, "two");
        hm.put(6, "six");
        hm.put(7, "seven");
        hm.put(2, "new two");


//        for(int i = 1; i < 15; i++) {
//            hm.put(1, "one");
//        }


        hm.printOutMap();


    }
}
