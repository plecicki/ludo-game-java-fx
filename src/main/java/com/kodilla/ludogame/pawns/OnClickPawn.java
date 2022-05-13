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
        } else if (((onClickPawn.getWhoseTurn() == 1 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[1].getActualPositionIndex() == 1) ||
                        (colorP[1].getActualPositionIndex() >= 72 && colorP[1].getActualPositionIndex() < 77))) &&
                pawnIndex == 1) {
            return true;
        } else if (((onClickPawn.getWhoseTurn() == 1 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[2].getActualPositionIndex() == 2) ||
                        (colorP[2].getActualPositionIndex() >= 72 && colorP[2].getActualPositionIndex() < 77))) &&
                pawnIndex == 2) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 1 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[3].getActualPositionIndex() == 3) ||
                        (colorP[3].getActualPositionIndex() >= 72 && colorP[3].getActualPositionIndex() < 77))) &&
                pawnIndex == 3) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 2 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[0].getActualPositionIndex() == 4) ||
                        (colorP[0].getActualPositionIndex() >= 77 && colorP[0].getActualPositionIndex() < 82))) &&
                pawnIndex == 4) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 2 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[1].getActualPositionIndex() == 5) ||
                        (colorP[1].getActualPositionIndex() >= 77 && colorP[1].getActualPositionIndex() < 82))) &&
                pawnIndex == 5) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 2 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[2].getActualPositionIndex() == 6) ||
                        (colorP[2].getActualPositionIndex() >= 77 && colorP[2].getActualPositionIndex() < 82))) &&
                pawnIndex == 6) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 2 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[3].getActualPositionIndex() == 7) ||
                        (colorP[3].getActualPositionIndex() >= 77 && colorP[3].getActualPositionIndex() < 82))) &&
                pawnIndex == 7) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 3 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[0].getActualPositionIndex() == 8) ||
                        (colorP[0].getActualPositionIndex() >= 82 && colorP[0].getActualPositionIndex() < 87))) &&
                pawnIndex == 8) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 3 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[1].getActualPositionIndex() == 9) ||
                        (colorP[1].getActualPositionIndex() >= 82 && colorP[1].getActualPositionIndex() < 87))) &&
                pawnIndex == 9) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 3 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[2].getActualPositionIndex() == 10) ||
                        (colorP[2].getActualPositionIndex() >= 82 && colorP[2].getActualPositionIndex() < 87))) &&
                pawnIndex == 10) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 3 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[3].getActualPositionIndex() == 11) ||
                        (colorP[3].getActualPositionIndex() >= 82 && colorP[3].getActualPositionIndex() < 87))) &&
                pawnIndex == 11) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 4 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[0].getActualPositionIndex() == 12) ||
                        (colorP[0].getActualPositionIndex() >= 87 && colorP[0].getActualPositionIndex() < 92))) &&
                pawnIndex == 12) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 4 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[1].getActualPositionIndex() == 13) ||
                        (colorP[1].getActualPositionIndex() >= 87 && colorP[1].getActualPositionIndex() < 92))) &&
                pawnIndex == 13) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 4 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[2].getActualPositionIndex() == 14) ||
                        (colorP[2].getActualPositionIndex() >= 87 && colorP[2].getActualPositionIndex() < 92))) &&
                pawnIndex == 14) {
            return  true;
        } else if (((onClickPawn.getWhoseTurn() == 4 && diceButtonObject.isWasClicked() == true) &&
                !((throwDice.getDiceIndex() != 6 && colorP[3].getActualPositionIndex() == 15) ||
                        (colorP[3].getActualPositionIndex() >= 87 && colorP[3].getActualPositionIndex() < 92))) &&
                pawnIndex == 15) {
            return  true;
        }
        return false;
    }

    public void capturingPawn(GridPane grid, Red[] redP, Green[] greenP,
                              Yellow[] yellowP, Blue[] blueP,
                              ImageView[] redPawns, ImageView[] greenPawns,
                              ImageView[] yellowPawns, ImageView[] bluePawns,
                              int clickedPawnIndex) {
        if (clickedPawnIndex == 0) {
            for (int i=0; i <= 3; i++) {
                if (redPositionIsTheSameAsGreen(redP, greenP[i], 0)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redPositionIsTheSameAsYellow(redP, yellowP[i], 0)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redPositionIsTheSameAsBlue(redP, blueP[i], 0)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 1) {
            for (int i=0; i <= 3; i++) {
                if (redPositionIsTheSameAsGreen(redP, greenP[i], 1)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redPositionIsTheSameAsYellow(redP, yellowP[i], 1)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redPositionIsTheSameAsBlue(redP, blueP[i], 1)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 2) {
            for (int i=0; i <= 3; i++) {
                if (redPositionIsTheSameAsGreen(redP, greenP[i], 2)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redPositionIsTheSameAsYellow(redP, yellowP[i], 2)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redPositionIsTheSameAsBlue(redP, blueP[i], 2)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 3) {
            for (int i=0; i <= 3; i++) {
                if (redPositionIsTheSameAsGreen(redP, greenP[i], 3)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redPositionIsTheSameAsYellow(redP, yellowP[i], 3)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (redPositionIsTheSameAsBlue(redP, blueP[i], 3)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 4) {
            for (int i=0; i <= 3; i++) {
                if (greenPositionIsTheSameAsRed(greenP, redP[i], 0)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (greenPositionIsTheSameAsYellow(greenP, yellowP[i], 0)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (greenPositionIsTheSameAsBlue(greenP, blueP[i], 0)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 5) {
            for (int i=0; i <= 3; i++) {
                if (greenPositionIsTheSameAsRed(greenP, redP[i], 1)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (greenPositionIsTheSameAsYellow(greenP, yellowP[i], 1)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (greenPositionIsTheSameAsBlue(greenP, blueP[i], 1)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 6) {
            for (int i=0; i <= 3; i++) {
                if (greenPositionIsTheSameAsRed(greenP, redP[i], 2)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (greenPositionIsTheSameAsYellow(greenP, yellowP[i], 2)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (greenPositionIsTheSameAsBlue(greenP, blueP[i], 2)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 7) {
            for (int i=0; i <= 3; i++) {
                if (greenPositionIsTheSameAsRed(greenP, redP[i], 3)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (greenPositionIsTheSameAsYellow(greenP, yellowP[i], 3)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (greenPositionIsTheSameAsBlue(greenP, blueP[i], 3)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 8) {
            for (int i=0; i <= 3; i++) {
                if (yellowPositionIsTheSameAsRed(yellowP, redP[i], 0)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (yellowPositionIsTheSameAsGreen(yellowP, greenP[i], 0)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (yellowPositionIsTheSameAsBlue(yellowP, blueP[i], 0)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 9) {
            for (int i=0; i <= 3; i++) {
                if (yellowPositionIsTheSameAsRed(yellowP, redP[i], 1)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (yellowPositionIsTheSameAsGreen(yellowP, greenP[i], 1)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (yellowPositionIsTheSameAsBlue(yellowP, blueP[i], 1)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 10) {
            for (int i=0; i <= 3; i++) {
                if (yellowPositionIsTheSameAsRed(yellowP, redP[i], 2)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (yellowPositionIsTheSameAsGreen(yellowP, greenP[i], 2)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (yellowPositionIsTheSameAsBlue(yellowP, blueP[i], 2)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 11) {
            for (int i=0; i <= 3; i++) {
                if (yellowPositionIsTheSameAsRed(yellowP, redP[i], 3)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (yellowPositionIsTheSameAsGreen(yellowP, greenP[i], 3)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (yellowPositionIsTheSameAsBlue(yellowP, blueP[i], 3)) {
                    grid.getChildren().remove(bluePawns[i]);
                    blueP[i].setActualPositionIndex(i+12);
                    grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 12) {
            for (int i=0; i <= 3; i++) {
                if (bluePositionIsTheSameAsRed(blueP, redP[i], 0)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (bluePositionIsTheSameAsGreen(blueP, greenP[i], 0)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (bluePositionIsTheSameAsYellow(blueP, yellowP[i], 0)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 13) {
            for (int i=0; i <= 3; i++) {
                if (bluePositionIsTheSameAsRed(blueP, redP[i], 1)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (bluePositionIsTheSameAsGreen(blueP, greenP[i], 1)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (bluePositionIsTheSameAsYellow(blueP, yellowP[i], 1)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 14) {
            for (int i=0; i <= 3; i++) {
                if (bluePositionIsTheSameAsRed(blueP, redP[i], 2)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (bluePositionIsTheSameAsGreen(blueP, greenP[i], 2)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (bluePositionIsTheSameAsYellow(blueP, yellowP[i], 2)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        } else if (clickedPawnIndex == 15) {
            for (int i=0; i <= 3; i++) {
                if (bluePositionIsTheSameAsRed(blueP, redP[i], 3)) {
                    grid.getChildren().remove(redPawns[i]);
                    redP[i].setActualPositionIndex(i);
                    grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (bluePositionIsTheSameAsGreen(blueP, greenP[i], 3)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenP[i].setActualPositionIndex(i+4);
                    grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                } else if (bluePositionIsTheSameAsYellow(blueP, yellowP[i], 3)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowP[i].setActualPositionIndex(i+8);
                    grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                            new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                }
            }
        }
    }

    private boolean bluePositionIsTheSameAsYellow(Blue[] blueP, Yellow yellowP, int bluePIndex) {
        return blueP[bluePIndex].getActualPositionIndex() == yellowP.getActualPositionIndex();
    }

    private boolean bluePositionIsTheSameAsGreen(Blue[] blueP, Green greenP, int bluePIndex) {
        return blueP[bluePIndex].getActualPositionIndex() == greenP.getActualPositionIndex();
    }

    private boolean bluePositionIsTheSameAsRed(Blue[] blueP, Red redP, int bluePIndex) {
        return blueP[bluePIndex].getActualPositionIndex() == redP.getActualPositionIndex();
    }

    private boolean yellowPositionIsTheSameAsBlue(Yellow[] yellowP, Blue blueP, int yellowPIndex) {
        return yellowP[yellowPIndex].getActualPositionIndex() == blueP.getActualPositionIndex();
    }

    private boolean yellowPositionIsTheSameAsGreen(Yellow[] yellowP, Green greenP, int yellowPIndex) {
        return yellowP[yellowPIndex].getActualPositionIndex() == greenP.getActualPositionIndex();
    }

    private boolean yellowPositionIsTheSameAsRed(Yellow[] yellowP, Red redP, int yellowPIndex) {
        return yellowP[yellowPIndex].getActualPositionIndex() == redP.getActualPositionIndex();
    }

    private boolean greenPositionIsTheSameAsBlue(Green[] greenP, Blue blueP, int greenPIndex) {
        return greenP[greenPIndex].getActualPositionIndex() == blueP.getActualPositionIndex();
    }

    private boolean greenPositionIsTheSameAsYellow(Green[] greenP, Yellow yellowP, int greenPIndex) {
        return greenP[greenPIndex].getActualPositionIndex() == yellowP.getActualPositionIndex();
    }

    private boolean greenPositionIsTheSameAsRed(Green[] greenP, Red redP, int greenPIndex) {
        return greenP[greenPIndex].getActualPositionIndex() == redP.getActualPositionIndex();
    }

    private boolean redPositionIsTheSameAsBlue(Red[] redP, Blue blueP, int redPIndex) {
        return redP[redPIndex].getActualPositionIndex() == blueP.getActualPositionIndex();
    }

    private boolean redPositionIsTheSameAsYellow(Red[] redP, Yellow yellowP, int redPIndex) {
        return redP[redPIndex].getActualPositionIndex() == yellowP.getActualPositionIndex();
    }

    private boolean redPositionIsTheSameAsGreen(Red[] redP, Green greenP, int redPIndex) {
        return redP[redPIndex].getActualPositionIndex() == greenP.getActualPositionIndex();
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
