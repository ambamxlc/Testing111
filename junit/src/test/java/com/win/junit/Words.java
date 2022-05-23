
package com.win.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class Words {

   @Test
    public  void SameOrNah() {
        
        System.out.println("enter wor ");
        String word1 ="Hello";

        System.out.println("eneter new word ");
        String word2 = "Hi";
        String word3 = "Hey";
        String word4 = "hell0";

        if(word1.equals(word2)){
            System.out.println("same words");
        }else{
            System.out.println("diff words.");
        }

    assertEquals(word1, word2);
    assertNotEquals(word3, word4);
    }
}