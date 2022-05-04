package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.PawnPosition;

public class OnClickPawn {

    private int diceStatus;
    private int actualPositionIndex;
    private int nextPositionIndex;
    private char pawnColor;

    public void start(int diceStatus, int actualPositionIndex, char pawnColor) {
        this.diceStatus = diceStatus;
        this.actualPositionIndex = actualPositionIndex;
        this.pawnColor = pawnColor;

        move();
    }

    private void move() {
        if (pawnColor == 'R') {
            if (actualPositionIndex >= 0 && actualPositionIndex < 4) {
                if (diceStatus == 6) {
                    this.nextPositionIndex = 16;
                }
            } else if (actualPositionIndex >= 16 && actualPositionIndex < 72) {
                if (actualPositionIndex + diceStatus <= 76) {
                    this.nextPositionIndex = actualPositionIndex + diceStatus;
                } else {
                    this.nextPositionIndex = 76 - ((actualPositionIndex + diceStatus) - 76);
                }
            } else {
                //PAWN FINISHED
            }
        } else if (pawnColor == 'G') {
            if (actualPositionIndex >= 4 && actualPositionIndex < 8) {
                if (diceStatus == 6) {
                    this.nextPositionIndex = 30;
                }
            }
        } else if (pawnColor == 'Y') {
            if (actualPositionIndex >= 8 && actualPositionIndex < 12) {
                if (diceStatus == 6) {
                    this.nextPositionIndex = 58;
                }
            }
        } else if (pawnColor == 'B') {
            if (actualPositionIndex >= 12 && actualPositionIndex < 16) {
                if (diceStatus == 6) {
                    this.nextPositionIndex = 44;
                }
            }
        }
    }

    public int getDiceStatus() {
        return diceStatus;
    }

    public void setDiceStatus(int diceStatus) {
        this.diceStatus = diceStatus;
    }

    public int getActualPositionIndex() {
        return actualPositionIndex;
    }

    public void setActualPositionIndex(int actualPositionIndex) {
        this.actualPositionIndex = actualPositionIndex;
    }

    public int getNextPositionIndex() {
        return nextPositionIndex;
    }

    public void setNextPositionIndex(int nextPositionIndex) {
        this.nextPositionIndex = nextPositionIndex;
    }

    public char getPawnColor() {
        return pawnColor;
    }

    public void setPawnColor(char pawnColor) {
        this.pawnColor = pawnColor;
    }
}
