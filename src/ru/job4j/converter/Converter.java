package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int result = value / 70;
        return result;
    }

    public static int rubleToDollar(int value) {
        int result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        int input = 140;
        int expected = 2;
        int output = Converter.rubleToEuro(input);
        boolean passed = expected == output;
        System.out.println("140 rubles are 2. Test \"rubleToEuro\" result : " + passed);

        input = 180;
        expected = 3;
        output = Converter.rubleToDollar(input);
        passed = expected == output;
        System.out.println("180 rubles are 3. Test \"rubleToDollar\" result : " + passed);
    }
}