package conspect.threads.thread4;

import java.util.concurrent.CountDownLatch;

public class ThreadFillArray implements Runnable {

    private String direction;
    private int[][] array;
    private int iteration;
    private CountDownLatch countDownLatch;

    private StringBuilder stringBuilder;

    public ThreadFillArray(String direction, int[][] array, int iteration, CountDownLatch countDownLatch, StringBuilder stringBuilder) {
        this.direction = direction;
        this.array = array;
        this.iteration = iteration;
        this.countDownLatch = countDownLatch;
        this.stringBuilder = stringBuilder;
        new Thread(this).start();
    }

    @Override
    public void run() {
        switch (direction) {
            case "forward":
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array[i].length; j++) {
                        writeArray(i, j, iteration);
                    }
                }
                countDownLatch.countDown();
                break;

            case "backward":


                for (int i = array.length - 1; i >= 0; i--) {
                    for (int j = array[i].length - 1; j >= 0; j--) {
                        writeArray(i, j, iteration);
                    }
                }
                countDownLatch.countDown();
        }
    }

    private void writeArray(int i, int j, int iteration) {
        if (array[i][j] == iteration) {
            try {
                if (array[i + 1][j] == -1){
                    array[i + 1][j] = iteration + 1;
                    stringBuilder.append((i + 1) + ":" + j + "=" + (iteration + 1) + "; ");
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                if (array[i - 1][j] == -1){
                    array[i - 1][j] = iteration + 1;
                    stringBuilder.append((i - 1) + ":" + j + "=" + (iteration + 1) + "; ");
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                if (array[i][j + 1] == -1){
                    array[i][j + 1] = iteration + 1;
                    stringBuilder.append(i + ":" + (j + 1) + "=" + (iteration + 1) + "; ");
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
            try {
                if (array[i][j - 1] == -1){
                    array[i][j - 1] = iteration + 1;
                    stringBuilder.append(i + ":" + (j - 1) + "=" + (iteration + 1) + "; ");
                }
            } catch (ArrayIndexOutOfBoundsException e) {

            }
        }


    }
}
