package conspect.bluefield.task8;

public class Main {

    public static void main(String[] args) {

        A o = new X();
        o.m();
        ((X) o).m();
        ((A) o).m();

    }


}
