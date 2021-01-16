package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        boolean fLeft;

        for (int k = 0; k < rsl.length; k++) {
            fLeft = i < left.length;

            if (fLeft && j < right.length) {
                fLeft = left[i] < right[j];
            }

            if (fLeft) {
                rsl[k] = left[i];
                i++;
            } else {
                rsl[k] = right[j];
                j++;
            }
        }
        return rsl;
    }
}