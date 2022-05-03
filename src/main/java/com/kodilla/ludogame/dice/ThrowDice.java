package com.kodilla.ludogame.dice;

import java.util.Random;

public class ThrowDice {
    public int diceIndex = 1;
    public int playerIndexTurn = 1;

    public void diceRandom() {
        Random randDice = new Random();
        int randDiceIndex = randDice.nextInt(6) + 1;
        diceIndex = randDiceIndex;
    }

    public void changeTurn(boolean availableMove) {
        if (!availableMove) {
            if (playerIndexTurn < 4) {
                playerIndexTurn++;
            } else {
                playerIndexTurn=1;
            }
        } else {
            //TO DO
        }
    }

    public int getDiceIndex() {
        return diceIndex;
    }

    public int getPlayerIndexTurn() {
        return playerIndexTurn;
    }
}
