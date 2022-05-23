package com.win.junit;
import java.util.Scanner;

class Words{
    public static void main(String[] args) {
        Scanner inputword= new Scanner(System.in);

        System.out.println("enter word : ");
        String word1 =(inputword.nextLine());

        System.out.println("enter word again : ");
        String word2 = (inputword.nextLine());

        if(word1.equals(word2)){
            System.out.println("words r same");
        }else{
            System.out.println("words r dif ");
        }

        inputword.close();
    }
}