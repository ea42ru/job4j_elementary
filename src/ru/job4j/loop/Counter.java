package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int summa = 0;
        for (int i = start; i <= finish; i++) {
            summa = summa + i;
        }
        return summa;
    }

    public static void main(String[] args) {
        System.out.println(sum(0, 10));
        System.out.println(sum(3, 8));
        System.out.println(sum(8, 50));
        System.out.println(sum(1, 1));
    }
}