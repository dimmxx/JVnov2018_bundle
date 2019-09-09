package conspect.threads.thread4;

public class App {

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        printArray(array);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = -1;
            }
        }

        array[5][5] = 0;
        printArray(array);



        int itteration = 0;

        while (true){


        }








    }


    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("|");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("|%2s%1s", array[i][j], "");
            }
        }
        System.out.println("|");
    }




}
