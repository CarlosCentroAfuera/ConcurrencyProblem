package com.company;

public class Main {

    public static void main(String[] args) {
        ThreadWithdrawCash t1 = new ThreadWithdrawCash();
        t1.start();
        ThreadWithdrawCash t2 = new ThreadWithdrawCash();
        t2.start();
        ThreadWithdrawCash t3 = new ThreadWithdrawCash();
        t3.start();
    }
}
