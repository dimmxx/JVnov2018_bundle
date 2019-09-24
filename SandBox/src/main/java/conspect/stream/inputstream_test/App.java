package conspect.stream.inputstream_test;

import java.io.*;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws IOException {

        while (true){
            Integer x = System.in.read();
            System.out.println(Integer.toString(x, 2));
        }

//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        while (true){
//            int x = inputStreamReader.read();
//            System.out.println(x);
//        }

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        while (true){
//            //int x = bufferedReader.read();
//            //System.out.println(x);
//
//            String str = bufferedReader.readLine();
//            System.out.println(str);
//        }

        //InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("src/main/resources/input.txt"));

//        FileInputStream fis = new FileInputStream("src/main/resources/input.txt");
//        FileOutputStream fos = new FileOutputStream("src/main/resources/result.txt");
//        int x = 0;
//        while (x != -1){
//            x = fis.read();
//            System.out.println(x);
//            fos.write(x);
//        }
        
//        char[] array = new char[]{'a','b','c','d','e'};
//        ByteArrayInputStream bais = new ByteArrayInputStream(array);
//        ByteArrayOutputStream result = new ByteArrayOutputStream();
//
//        InputStreamReader inputStreamReader = new InputStreamReader(bais);
//        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(result);
//
//        char[] buffer = new char[1024];
//        char[] output = new char[1024];
//        int length;
//        while (inputStreamReader.read(buffer) != -1) {
//            outputStreamWriter.write(output);
//        }
//        System.out.println(Arrays.toString(output));


    }


}
