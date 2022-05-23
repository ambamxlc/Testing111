package com.win.junit;
import java.util.Scanner;
class TestScores{
    public static void main(String[] args) {
    Scanner inputscore = new Scanner(System.in);

    System.out.println("pick numb 0-100");
    int number = Integer.valueOf(inputscore.nextLine());

    if(number >=90){
        System.out.println("grade a :)");
        } else if (number >= 80 && number <90){
            System.out.println("grade b :)");
        }else if (number >=70 && number <80){
            System.out.println("grade c");
        }else if (number >=60 && number < 70){
            System.out.println("grade d");
        } else{
            System.out.println("grade f");
        }
    inputscore.close();

    }
}