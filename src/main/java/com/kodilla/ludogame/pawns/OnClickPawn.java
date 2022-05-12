package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class OnClickPawn {

    private int diceStatus;
    private int actualPositionIndex;
    private int nextPositionIndex;
    private char pawnColor = 'R';
    private int whoseTurn = 1;

    public void start(int diceStatus, int actualPositionIndex, char pawnColor) {
        this.diceStatus = diceStatus;
        this.actualPositionIndex = actualPositionIndex;
        this.pawnColor = pawnColor;

        move();
    }

    private void move() {
        //Ctrl + Alt + M
        if (isRedPawn()) {
            setRedPawnPosition();
        } else if (isGreenPawn()) {
            setGreenPawnPosition();
        } else if (isYellowPawn()) {
            setYellowPawnPosition();
        } else if (isBluePawn()) {
            setBluePawnPosition();
        }
    }

    public boolean isThisPawnMovable(OnClickPawn onClickPawn, DiceButton diceButtonObject, ThrowDice throwDice,
                                       AllPawnsColors[] colorP, int pawnIndex) {
        if (((onClickPawn.getWhoseTurn() == 1 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[0].getActualPositionIndex() == 0) ||
                        (colorP[0].getActualPositionIndex() >= 72 && colorP[0].getActualPositionIndex() < 77))) &&
        pawnIndex == 0) {
            return true;
        }
        //TO DO: rest of "On clicks" (rest of ifs) at pawns (pawnIndex 1-15)
        return false;
    }

    public void capturingPawn(GridPane grid, Red[] redP, Green[] greenP,
                              Yellow[] yellowP, Blue[] blueP,
                              ImageView[] redPawns, ImageView[] greenPawns,
                              ImageView[] yellowPawns, ImageView[] bluePawns,
                              int clickedPawnIndex) {
        if (clickedPawnIndex == 0) {
            for (int i=0; i <= 3; i++) {
                if (redP[0].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redP[0].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redP[0].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        }
        //TO DO: Next pawns "On clicks"
    }

    public void setWhoIsNext(ThrowDice throwDice, OnClickPawn onClickPawn, int clickedPawnIndex) {
        if (throwDice.getDiceIndex() != 6) {
            if (clickedPawnIndex >= 0 && clickedPawnIndex < 4) {
                onClickPawn.setWhoseTurn(2);
            } else if (clickedPawnIndex >= 4 && clickedPawnIndex < 8) {
                onClickPawn.setWhoseTurn(3);
            } else if (clickedPawnIndex >= 8 && clickedPawnIndex < 12) {
                onClickPawn.setWhoseTurn(4);
            } else if (clickedPawnIndex >= 12 && clickedPawnIndex < 16) {
                onClickPawn.setWhoseTurn(1);
            }
        }
    }

    private void setBluePawnPosition() {
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

    private boolean isBluePawn() {
        return pawnColor == 'B';
    }

    private void setYellowPawnPosition() {
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
    }

    private boolean isYellowPawn() {
        return pawnColor == 'Y';
    }

    private void setGreenPawnPosition() {
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
    }

    private boolean isGreenPawn() {
        return pawnColor == 'G';
    }

    private void setRedPawnPosition() {
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
    }

    private boolean isRedPawn() {
        return pawnColor == 'R';
    }

    public int getNextPositionIndex() {
        return nextPositionIndex;
    }

    public int getWhoseTurn() {
        return whoseTurn;
    }

    public void setWhoseTurn(int whoseTurn) {
        this.whoseTurn = whoseTurn;
    }
}
