package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class incomeServiceTest {
    @Test

    public void testOne() {
        incomeService service = new incomeService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
        @Test

        public void testTwo() {
            incomeService service = new incomeService();

            int actual = service.calculate (100_000, 60_000, 150_000);
            int expected = 2;

            Assertions.assertEquals(expected, actual);

    }
}