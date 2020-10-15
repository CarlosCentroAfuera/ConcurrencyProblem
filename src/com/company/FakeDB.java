package com.company;

public class FakeDB {

    private static int cash = 100;

    public static int getCash(){
        return cash;
    }

    public static void decreaseCash(int cashToDecrease) {
        cash = cash - cashToDecrease;
    }

}
