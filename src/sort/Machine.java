package sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int cha = money - price;

        while (cha > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (cha >= coins[i]) {
                    cha = cha - coins[i];
                    rsl[size] = coins[i];
                    size++;
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}