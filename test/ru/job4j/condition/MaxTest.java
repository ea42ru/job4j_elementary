package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax5To2Then5() {
        int result = Max.max(5, 2);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax10To20Then20() {
        int result = Max.max(10, 20);
        assertThat(result, is(20));
    }

    @Test
    public void whenMax15To15Then15() {
        int result = Max.max(15, 15);
        assertThat(result, is(15));
    }

    @Test
    public void whenMax15To15To45Then45() {
        int result = Max.max(15, 15, 45);
        assertThat(result, is(45));
    }

    @Test
    public void whenMax85To15To15Then85() {
        int result = Max.max(85, 15, 15);
        assertThat(result, is(85));
    }

    @Test
    public void whenMax15To15To45To60Then60() {
        int result = Max.max(15, 15, 45, 60);
        assertThat(result, is(60));
    }

    @Test
    public void whenMax85To15To99To15Then99() {
        int result = Max.max(85, 15, 99, 15);
        assertThat(result, is(99));
    }
}
