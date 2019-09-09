package conspect.threads.thread3;

public class ThreadMe extends Thread {

    @Override
    public void run() {
        System.out.println("This is thread (extended from Thread)");
    }
}
