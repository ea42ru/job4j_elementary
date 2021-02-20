package ru.job4j.loop;

public class Symmetry {
    public static boolean check(int i) {
        String number = "" + i;
        for (int j = 0; j < number.length() / 2; j++) {
            if (number.charAt(j) != number.charAt(number.length() - 1 - j)) {
                return false;
            }
        }
        return true;
    }
}