package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BankAccountT{

   double accountBalance = 300;
   double  amount = 100;
    @Test
   void deposit(){
        this.accountBalance += amount;
        System.out.println("My account dep" + amount + " balance : "+ this.accountBalance);

        assertEquals("My account dep 100.0 balance: 400.0", "My account dep " + amount + " balance: "+ this.accountBalance);
    }
}