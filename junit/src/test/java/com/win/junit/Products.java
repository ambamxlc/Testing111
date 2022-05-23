package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ProductTest {

    double productCost = 5;
    int productQuantity = 7;
    String productName = "housez";
    
    @Test
    public void printProduct( ){
        System.out.println(this.productName + " cost"  + this.productCost + "and " + this.productQuantity + " were purchased." );

        assertEquals("house cost 9.0 and 2 were purchased.", this.productName + "cost "  + this.productCost + " and" + this.productQuantity + " were purchase " );
    }
}
