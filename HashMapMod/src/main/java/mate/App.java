package mate;

public class App {
    public static void main(String[] args) {

        HashMapM hm = new HashMapM(16, 0.75);

        hm.put(1, "hello");
        hm.put(2, "Dima");
        hm.put(3, "Dima1");
        hm.put(4, "hello");
        hm.put(75, "Dima");
        hm.put(6, "Dima1");
        hm.put(7, "hello");
        hm.put(8, "Dima");
        hm.put(99, "Dima1");
        hm.put(10, "hello");
        hm.put(11, "Dima");
        hm.put(12, "Dima1");
        hm.put(130, "DDD");

        hm.printOutMap();


    }
}
