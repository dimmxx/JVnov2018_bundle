package conspect.threads.thread1;

public class Main {

    public static void main(String[] args) {

        CallMe callMe = new CallMe();

        new Caller(callMe, "A");
        new Caller(callMe, "B");
        new Caller(callMe, "C");



    }


}
