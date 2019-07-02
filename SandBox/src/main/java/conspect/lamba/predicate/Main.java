package conspect.lamba.predicate;

import java.util.Scanner;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> isZero = value -> value == 0;
        System.out.println(isZero.test(0));
        System.out.println(isZero.test(4));

        Consumer<Double> print = value -> System.out.println("Value: " + value);
        print.accept(5.5);

        Function<Integer, Double> converter = num -> Double.valueOf(num);
        System.out.println(converter.apply(3));

        Supplier<String> line = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the line: ");
            return scanner.nextLine();
        };
        System.out.print("The line entered: " + line.get());

        UnaryOperator<Double> result = value -> Math.sqrt(value);
        System.out.println("\n" + result.apply(16D));

        BinaryOperator<Integer> result1 = (value1, value2) -> value1 + value2;
        System.out.println(result1.apply(2,5));








    }




}
