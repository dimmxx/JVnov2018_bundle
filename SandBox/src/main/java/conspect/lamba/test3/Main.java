package conspect.lamba.test3;

public class Main {

    public static void main(String[] args) {
//===============================================================================
//        int v1 = 100;
//        Executor executor = new Executor();
//        AnyOperation anyOperation = new AnyOperation() {
//            @Override
//            public int getResult() {
//                return 2;
//            }
//        };
//        int result = executor.execute(v1, anyOperation);
//        System.out.println(result);
//================================================================================
//        int v1 = 100;
//        Executor executor = new Executor();
//        AnyOperation anyOperation = () -> 2;
//        int result = executor.execute(v1, anyOperation);
//        System.out.println(result);
//================================================================================
        int v1 = 100;
        Executor executor = new Executor();
        int result = executor.execute(v1, () -> 2);
        System.out.println(result);
//================================================================================

    }
}
