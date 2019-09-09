package conspect.threads.thread1;

public class Caller implements Runnable {

    private CallMe callMe;
    private String message;

    public Caller(CallMe callMe, String message) {
        this.callMe = callMe;
        this.message = message;
        new Thread(this).start();
    }

    @Override
    public void run() {
        synchronized (callMe){
            callMe.getMessage(message);
        }

    }
}
