package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(10, 4, 2);
        assertThat(result, is(10));
    }

    @Test
    public void whenSecond40Max() {
        int result = MultiMax.max(1, 40, 2);
        assertThat(result, is(40));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenEqualMax() {
        int result = MultiMax.max(5, 5, 5);
        assertThat(result, is(5));
    }
}