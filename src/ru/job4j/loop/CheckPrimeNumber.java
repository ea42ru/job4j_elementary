package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        // По условиям тестов 1 - не простое число.
        if (number == 1) {
            return false;
        }

        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
