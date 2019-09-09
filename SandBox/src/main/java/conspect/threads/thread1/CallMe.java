package conspect.threads.thread1;

public class CallMe {
    void getMessage(String msg){
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("]");
    }
}
