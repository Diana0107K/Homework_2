package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        Pattern wordStartAndEndA = Pattern.compile("\\b[аa]((\\w*[аa]\\b)|(\\b))");
        Matcher sAe = wordStartAndEndA.matcher("aakchj lkjhb asdfc dfgchca adfgccccja.");
        System.out.println(sAe.find());
    }
}
