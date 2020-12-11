package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        if (post.length > word.length) {
            return false;
        }

        int shift = word.length - post.length;
        for (int i = 0; i < post.length; i++) {
            if (word[i + shift] != post[i]) {
                return false;
            }
        }
        return true;
    }
}