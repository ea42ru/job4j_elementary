package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder result = new StringBuilder("");
        boolean fInsert = true;
        for (int i = 0; i < s.length(); i++) {
            if (fInsert) {
                result.append(s.charAt(i));
            }
            fInsert = s.charAt(i) == ' ';
        }
        return result.toString();
    }
}

