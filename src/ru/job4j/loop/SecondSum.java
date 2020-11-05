package ru.job4j.loop;

public class SecondSum {
    public static int sum(int a, int b) {
        int s=0;
        for (int i=0; i<=(b-a); i++){
            if (i%2==0) {
                s=s+i+a;
            }
        }
        return s;
    }
}