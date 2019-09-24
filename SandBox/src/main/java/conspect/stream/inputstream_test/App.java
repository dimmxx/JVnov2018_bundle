package conspect.stream.inputstream_test;

import java.io.*;

public class App {

    public static void main(String[] args) throws IOException {

//        while (true){
//            Integer x = System.in.read();
//            System.out.println(Integer.toString(x, 2));
//        }

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
        
        byte[] array = new byte[]{1,2,3,4,5,6,7,8,9,0};
        ByteArrayInputStream bais = new ByteArrayInputStream(array);
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = bais.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        System.out.println(result.toString());


    }


}
