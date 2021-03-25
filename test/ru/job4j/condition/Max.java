package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int o3) {
        return max(max(left, right), o3);
    }

    public static int max(int left, int right, int o3, int o4) {
        return max(max(left, right, o3), o4);
    }
}