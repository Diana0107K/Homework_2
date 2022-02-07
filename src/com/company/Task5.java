package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = "lkchjcc cclсkjhb sdfc dfgchc dfgcсcj cccc";
        Pattern wordCcc = Pattern.compile("\\b\\w*[сc]\\w*[сc]\\w*[сc]\\w*\\b");
        Matcher wC = wordCcc.matcher(text);
        int i = 0;
        while (wC.find()) {
            i++;
        }
        System.out.println(i);
    }
}
