package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
       String longestWord = "Java is the #1 programming language and development platform.";
       String[] array = longestWord.split("\\s|[.,;:/]");
       String maxString = "";
       for (String w:array) {
           if(w.length() > maxString.length()){
               maxString = w;
           }
       }
        System.out.println(maxString);
    }
}
