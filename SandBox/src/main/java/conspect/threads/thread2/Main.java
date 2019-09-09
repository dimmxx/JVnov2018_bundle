package conspect.threads.thread2;

public class Main {

    public static void main(String[] args) {

        ThreadMe threadMe = new ThreadMe();
        Thread thread = new Thread(threadMe);
        thread.start();
    }


}
