package com.win.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;




public class CalculationsT {
    @Test
    void Calculations() {
        int num1 = 10;
        int num2 = 5;

        int addedNums = num1 + num2;
        int subNums = num1 - num2;
        int multiplyNum = num1 * num2;
        double divNums = (float)num1/num2;
        int modulsNums = num1 % num2;

        assertEquals(15, addedNums);
        assertEquals(5, subNums);
        assertEquals(50, multiplyNum);
        assertEquals(2, divNums);
        assertEquals(0, modulsNums);
    }
}