package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WarmUp {

    public static void main(String[] args) {

        String s = "UDDDUDUU";

        System.out.println(countingValleys(s.length(), s));

    }


    static int countingValleys(int n, String s) {

        int level = 0;
        int countValley = 0;
        boolean inValley = false;
        //UDDDUDUU
        for(int i = 0; i < s.length(); i++){

            if(level < 0){
                inValley = true;
            } else inValley = false;

            char symbol = s.charAt(i);

            switch (symbol){
                case 'U':
                    level += 1;
                    break;
                case  'D':
                    level -= 1;
            }
            System.out.print(":" + level);

            if(!inValley & level >= 0) countValley++;




        }

        return countValley;

    }


    static int sockMerchant(int n, int[] ar) {
        int sockCounter = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == -1) continue;
            for (int j = i + 1; j < n; j++) {
                if (ar[j] == -1) continue;
                ;
                if (ar[i] == ar[j]) {
                    sockCounter++;
                    ar[i] = ar[j] = -1;
                }
            }
        }
        return sockCounter;
    }


}









