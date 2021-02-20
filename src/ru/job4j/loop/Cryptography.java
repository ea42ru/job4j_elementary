package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.equals("")) {
            return "empty";
        }
        if (s.length() <= 4) {
            return s;
        }
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if ((s.length() - i) > 4) {
                result = result + "#";
            } else {
                result = result + s.charAt(i);
            }
        }
        return result;
    }
}

