package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder ret = new StringBuilder("");
        boolean fInsert = true;
        for (int i = 0; i < s.length(); i++) {
            if (fInsert) {
                ret.append(s.charAt(i));
            }
            fInsert = s.charAt(i) == ' ';
        }
        return ret.toString();
    }
}
