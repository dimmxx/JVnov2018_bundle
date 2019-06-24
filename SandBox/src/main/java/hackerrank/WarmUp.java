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

        String s = "abcac";
        long n = 10;

        System.out.println(repeatedString(s, n));





    }


    static long repeatedString(String s, long n) {

        long base = n/s.length()*countA(s);

        long surplus = n % s.length();

        int tail = countA(s.substring(0, (int)surplus));




        return base;
    }
    



    static long countA(String word){
        long counter = 0;
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a') counter++;
        }
        return counter;
    }



    static int jumpingOnClouds(int[] c) {
        int move = 0;
        int step = 2;
        for (int i = 0; i < c.length; i += step) {
            step = 2;
            if (i >= c.length - 1) {
                break;
            }
            if (i == c.length - 2) {
                move++;
                break;
            }
            if (c[i + 2] == 1) {
                step = 1;
            }
            move++;
        }
        return move;
    }

    static int countingValleys(int n, String s) {
        int level = 0;
        int previousLevel;
        int crossSeaLevel = 0;
        boolean inValley = false;
        boolean seaLineCrossed = false;

        for (int i = 0; i < s.length(); i++) {

            previousLevel = level;
            char symbol = s.charAt(i);
            switch (symbol) {
                case 'U':
                    level += 1;
                    break;
                case 'D':
                    level -= 1;
            }
            if (previousLevel == 0 & level < previousLevel) crossSeaLevel++;
        }
        return crossSeaLevel;
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









