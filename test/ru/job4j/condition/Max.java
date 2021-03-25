package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int max(int left, int right, int o3) {
        int result = max(left, right);
        result = max(result, o3);
        return result;
    }

    public static int max(int left, int right, int o3, int o4) {
        int result = max(left, right, o3);
        result = max(result, o4);
        return result;
    }
}