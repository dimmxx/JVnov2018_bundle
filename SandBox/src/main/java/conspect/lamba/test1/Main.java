package conspect.lamba.test1;

public class Main {

   private static double var1 = 100.00;
   private static double var2 = 200.00;

    public static void main(String[] args) {

        double var5 = 1000;
        double var6 = 3000;

        Operation operation = new Operation() {
            @Override
            public int getResult(int num1, int num2) {
                return num1 + num2;
            }
        };
        System.out.println(operation.getResult(2, 4));

        Operation lambda = (val1, val2) -> val1 + val2;
        System.out.println(lambda.getResult(5, 7));

//====================================================================

        Printer printer = new Printer() {
            @Override
            public void printLn(String string) {
                System.out.println(string);
            }
        };
        printer.printLn("Hello non-lambda");

        Printer printerLambda = string -> System.out.println(string);
        printerLambda.printLn("Hello lamba");

//====================================================================

        Factorial factorial = value -> {
            int result = 1;

            for (int i = 1; i <= value; ++i) {
                result *= i;
            }
            return result;
        };
        System.out.println(factorial.getResult(3));

//====================================================================

        OperationVariable operationVariable = () -> var1 + var2;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(operationVariable.getResult());

        OperationVariable operationVariable1 = () -> {
            double var3 = 400;
            double var4 = 500;
            return var1 + var2 + var3 + var4;
        };
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(operationVariable.getResult());
        System.out.println(operationVariable1.getResult());

OperationVariable operationVariable2 = () -> {
            //double var5 = 400;
            double var1 = 500;
           return var1 + var2;
        };


        System.out.println(var1);
        System.out.println(var2);
        System.out.println(operationVariable.getResult());
        System.out.println(operationVariable1.getResult());
        System.out.println(operationVariable2.getResult());

//====================================================================

        OperationGeneric<Integer> operationGeneric = (value1, value2) -> value1 + value2;
        System.out.println(operationGeneric.getResult(3, 5));

        OperationGeneric<String> operationGenericString = (value1, value2) -> value1 + value2;
        System.out.println(operationGenericString.getResult("Hello ", "World!"));

    }







}
