package com.kodilla.ludogame.dice;

import java.util.Random;

public class ThrowDice {
    private int diceIndex = 1;

    public void diceRandom() {
        Random randDice = new Random();
        int randDiceIndex = randDice.nextInt(6) + 1;
        diceIndex = randDiceIndex;
    }

    public int getDiceIndex() {
        return diceIndex;
    }
}
