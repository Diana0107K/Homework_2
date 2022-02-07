package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String text = "Java is the #1 programming language and development platform.";
        Pattern wordInString = Pattern.compile ("\\b(?i)LanGuage\\b");
        Matcher sW = wordInString.matcher(text);
        while (sW.find()) {
            System.out.println(sW.start());
       }
    }
}
