package mate;

public class App {
    public static void main(String[] args) {

        HashMapM<Integer, String> hm = new HashMapM();


        hm.put(5, "two");
        hm.put(5, "six");
        //hm.put(7, "seven");


//        for(int i = 1; i < 15; i++) {
//            hm.put(1, "one");
//        }


        hm.printOutMap();


    }
}
