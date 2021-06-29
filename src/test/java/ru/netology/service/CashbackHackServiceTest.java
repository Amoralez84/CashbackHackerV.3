package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cashbackHackService = new CashbackHackService();

    @ Test
    public void shouldReturnSumIfAmountIsUnder1000() {

        int amount = 950;
        int actual = cashbackHackService.remain(amount);
        int expected = 50;

        assertEquals(actual, expected);
    }


    @Test
    public void shouldReturnSumIfAmountIsOver1000() {

        int amount = 1130;
        int actual = cashbackHackService.remain(amount);
        int expected = 870;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn0IfAmountIs1000() {

        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}