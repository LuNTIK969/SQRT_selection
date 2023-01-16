package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void testCalcIfFoundSqr() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcIfNotFoundSqr() {
        SQRService service = new SQRService();

        int actual = service.calc(20, 50);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcIfSameBorders() {
        SQRService service = new SQRService();

        int actual = service.calc(400, 400);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcIfOutsideBorders() {
        SQRService service = new SQRService();

        int actual = service.calc(80, 9_802);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcIfNegativeValue() {
        SQRService service = new SQRService();

        int actual = service.calc(-80, 100_000);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcIfFirstValueBigger() {
        SQRService service = new SQRService();

        int actual = service.calc(100_000, 80);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcIfBothNegativeValue() {
        SQRService service = new SQRService();

        int actual = service.calc(-80, -100_000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcIfMax() {
        SQRService service = new SQRService();

        int actual = service.calc(100_000, 500_000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCalcIfInsideBorder() {
        SQRService service = new SQRService();

        int actual = service.calc(101, 9_800);
        int expected = 88;

        Assertions.assertEquals(expected, actual);
    }


}