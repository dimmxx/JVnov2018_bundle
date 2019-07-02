package conspect.lamba.test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppLambda {

    public static void main(String[] args) {

        String[] array1 = {"revolution", "automobile", "cryptography"};
        String[] array2 = {"a", "to", "at", "@"};
        String[] array3 = {"mama", "parent"};

        List<String[]> list = new ArrayList<>();
        list.add(array1);
        list.add(array2);
        list.add(array3);


        for (String[] str : list) System.out.println(Arrays.toString(str));
        list.sort((o1, o2) -> o1.length - o2.length);
        for (String[] str : list) System.out.println(Arrays.toString(str));

        list.sort((o1, o2) -> {
            int len1 = 0;
            int len2 = 0;
            for(String str : o1) len1 +=str.length();
            for(String str : o2) len2 +=str.length();
            return len1 - len2;
        });

        for (String[] str : list) System.out.println(Arrays.toString(str));


    }
}
