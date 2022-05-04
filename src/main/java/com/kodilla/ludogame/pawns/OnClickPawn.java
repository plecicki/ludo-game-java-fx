package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.PawnPosition;

public class OnClickPawn {

    private int diceStatus;
    private int actualPositionIndex;
    private int nextPositionIndex;
    private char pawnColor;
    private int whoseTurn;

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
                } else {
                    this.nextPositionIndex = actualPositionIndex;
                }
            } else if (actualPositionIndex >= 16 && actualPositionIndex < 72) {
                if (actualPositionIndex + diceStatus <= 76) {
                    this.nextPositionIndex = actualPositionIndex + diceStatus;
                } else {
                    this.nextPositionIndex = 76 - ((actualPositionIndex + diceStatus) - 76);
                }
            } else {
                //PAWN FINISHED
                this.nextPositionIndex = actualPositionIndex;
            }
        } else if (pawnColor == 'G') {
            if (actualPositionIndex >= 4 && actualPositionIndex < 8) {
                if (diceStatus == 6) {
                    this.nextPositionIndex = 30;
                } else {
                    this.nextPositionIndex = actualPositionIndex;
                }
            } else if (actualPositionIndex >= 16 && actualPositionIndex < 72) {
                if (actualPositionIndex >= 30 && actualPositionIndex < 72) {
                    if (actualPositionIndex + diceStatus > 71) {
                        this.nextPositionIndex = actualPositionIndex + diceStatus - 56;
                    } else {
                        this.nextPositionIndex = actualPositionIndex + diceStatus;
                    }
                } else if (actualPositionIndex >= 16 && actualPositionIndex<30) {
                    if (actualPositionIndex + diceStatus > 29) {
                        if (actualPositionIndex + diceStatus + 47 < 82) {
                            this.nextPositionIndex = actualPositionIndex + diceStatus + 47;
                        } else {
                            this.nextPositionIndex = 81 - ((actualPositionIndex + diceStatus + 47) - 81);
                        }
                    } else {
                        this.nextPositionIndex = actualPositionIndex + diceStatus;
                    }
                }
            } else {
                //PAWN FINISHED
                this.nextPositionIndex = actualPositionIndex;
            }
        } else if (pawnColor == 'Y') {
            if (actualPositionIndex >= 8 && actualPositionIndex < 12) {
                if (diceStatus == 6) {
                    this.nextPositionIndex = 58;
                } else {
                    this.nextPositionIndex = actualPositionIndex;
                }
            } else if (actualPositionIndex >= 16 && actualPositionIndex < 72) {
                if (actualPositionIndex >= 58 && actualPositionIndex < 72) {
                    if (actualPositionIndex + diceStatus > 71) {
                        this.nextPositionIndex = actualPositionIndex + diceStatus - 56;
                    } else {
                        this.nextPositionIndex = actualPositionIndex + diceStatus;
                    }
                } else if (actualPositionIndex >= 16 && actualPositionIndex < 58) {
                    if (actualPositionIndex + diceStatus > 57) {
                        if (actualPositionIndex + diceStatus + 24 < 87) {
                            this.nextPositionIndex = actualPositionIndex + diceStatus + 24;
                        } else {
                            this.nextPositionIndex = 86 - ((actualPositionIndex + diceStatus + 24) - 86);
                        }
                    } else {
                        this.nextPositionIndex = actualPositionIndex + diceStatus;
                    }
                }
            } else {
                //PAWN FINISHED
                this.nextPositionIndex = actualPositionIndex;
            }
        } else if (pawnColor == 'B') {
            if (actualPositionIndex >= 12 && actualPositionIndex < 16) {
                if (diceStatus == 6) {
                    this.nextPositionIndex = 44;
                } else {
                    this.nextPositionIndex = actualPositionIndex;
                }
            } else if (actualPositionIndex >= 16 && actualPositionIndex < 72) {
                if (actualPositionIndex >= 44 && actualPositionIndex < 72) {
                    if (actualPositionIndex + diceStatus > 71) {
                        this.nextPositionIndex = actualPositionIndex + diceStatus - 56;
                    } else {
                        this.nextPositionIndex = actualPositionIndex + diceStatus;
                    }
                } else if (actualPositionIndex >= 16 && actualPositionIndex < 44) {
                    if (actualPositionIndex + diceStatus > 43) {
                        if (actualPositionIndex + diceStatus + 43 < 92) {
                            this.nextPositionIndex = actualPositionIndex + diceStatus + 43;
                        } else {
                            this.nextPositionIndex = 91 - ((actualPositionIndex + diceStatus + 43) - 91);
                        }
                    } else {
                        this.nextPositionIndex = actualPositionIndex + diceStatus;
                    }
                }
            } else {
                //PAWN FINISHED
                this.nextPositionIndex = actualPositionIndex;
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

    public int getWhoseTurn() {
        return whoseTurn;
    }

    public void setWhoseTurn(int whoseTurn) {
        this.whoseTurn = whoseTurn;
    }
}
