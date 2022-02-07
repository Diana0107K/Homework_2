package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        Pattern card = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
        Matcher number = card.matcher("l6599-5528-2248-52235kchjcc lkjhb .4444-5555-9999-4444 sdfc dfgchc 5555-4444-9999-6666dfg);.matcher(");
        while (number.find()) {
            System.out.println(number.group());
        }
    }
}