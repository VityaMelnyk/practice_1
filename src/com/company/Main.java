package com.company;

import java.util.Arrays;

public class Main {

    public static String getPrefix(String[] array) {

        int minimal = Arrays.stream(array).mapToInt(String::length).min().orElse(0);
        String prefix = "";
        String firstWord = array[0];
        boolean flag = true;
        for (int i = 0; i < minimal; i++) {
            char ch = firstWord.charAt(i);
            for (int j = 0; j < array.length; j++) {
                if (array[j].charAt(i) != ch) {
                    flag = false;
                    break;
                }
                }
                if (flag == false) {
                    break;
                } else {
                    prefix += ch;

            }
        }
        return prefix;


    }

    public static void main(String[] args) {
        String[] array = {"abx", "abcd", "abcef", "abd", "aba"};
        System.out.println(getPrefix(array));
    }
}
