package com.win.TestScore.java;
public class BankAccount {

    private String name;
    private Double accBalance;


    public BankAccount( String name, double accBalance){
        this.name = name;
        this.accBalance= accBalance;
    }

        public void deposit(double amount){
            this.accBalance += amount;
            System.out.println("My account deposit " + amount + " balance: "+ this.accBalance);
        }

        public void withdrawal(double amount){
            this.accBalance -= amount;
            System.out.println("My account after " + amount + " withdrawal balance: "+ this.accBalance);
        }

        public void accountInfo(String accountName, double deposit){
            this.name = name;
            this.accBalance = accBalance;
            System.out.println(this.name + "'s" + " account balance: " + this.accBalance);
        }

        }