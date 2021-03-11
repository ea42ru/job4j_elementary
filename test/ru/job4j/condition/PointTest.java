package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then141() {
        double expected = 1.41;
        Point a = new Point(1, 1);
        Point b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1010to2020then1414() {
        double expected = 14.14;
        Point a = new Point(10, 10);
        Point b = new Point(20, 20);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when25to188then1627() {
        double expected = 16.27;
        int x1 = 2;
        int y1 = 5;
        int x2 = 18;
        int y2 = 8;
        Point a = new Point(2, 5);
        Point b = new Point(18, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

}