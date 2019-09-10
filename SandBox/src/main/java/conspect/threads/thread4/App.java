package conspect.threads.thread4;

import java.util.concurrent.CountDownLatch;

public class App {

    public static void main(String[] args) {

        int[][] array = new int[100][100];
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = -1;
            }
        }

        array[2][0] = 0;
        printArray(array);


        int iteration = 0;

        while (iteration <= array.length * array.length) {

            CountDownLatch countDownLatch = new CountDownLatch(1);

//            ThreadFillArray threadFillArray1 = new ThreadFillArray("forward", array, iteration, countDownLatch);
//            Thread threadForward = new Thread(threadFillArray1);

            ThreadFillArray threadFillArray2 = new ThreadFillArray("backward", array, iteration, countDownLatch);
            Thread threadBackward = new Thread(threadFillArray2);

            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            iteration++;


        }

        printArray(array);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("|");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("|%3s%1s", array[i][j], "");
            }
        }
        System.out.println("|");
    }


}
