package mate;

public class App {
    public static void main(String[] args) {

        HashMapM<String, String> hm = new HashMapM();



        hm.put("1", "1");
        hm.put("2", "2");
        hm.put("3", "3");
        hm.put("4", "4");

//        hm.put(6, "six");
//        hm.put(7, "seven");
//        hm.put(2, "new two");


//        for(int i = 1; i < 15; i++) {
//            hm.put(1, "one");
//        }


        hm.printOutMap();

        System.out.println(hm.get("3"));


    }
}
