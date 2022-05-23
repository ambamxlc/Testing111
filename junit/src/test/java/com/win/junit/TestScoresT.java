package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class TestScoresT{

    @Test
    public void TestScorest()  {
    System.out.println("pick numb from 0-100");
    int number = 92;
    int number2 =110;
    assertTrue(number < 100);
    assertFalse(number2 < 100);
    }
}