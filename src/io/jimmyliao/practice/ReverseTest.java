package io.jimmyliao.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReverseTest {
    public ReverseTest() {
        super();
    }

    public static String reverseRecursive(String str) {
        if(str.length() < 2)
            return str;
        return reverseRecursive(str.substring(1)) + str.charAt(0);
    }

    public static String reverseIterate(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();
        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static void main(String[] args) {
        String reverseStr = "";

        if(args[0] != null){
            System.out.println("Input: "+args[0].toString());
           reverseStr = reverseIterate(args[0].toString());
           System.out.println("ReversetIterate: " + reverseStr);

            reverseStr = reverseRecursive(args[0].toString());
            System.out.println("reverseRecursive: " + reverseStr);
        }else{
            System.out.println("Syntax: \"Input String\"}");
        }
    }
}
