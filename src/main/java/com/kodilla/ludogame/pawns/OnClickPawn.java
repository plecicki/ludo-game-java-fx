package com.kodilla.ludogame.pawns;

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
                                     Pawn[] colorP, int pawnIndex) {
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

    public void capturingPawn(GridPane grid, RedPawn[] redPawn, GreenPawn[] greenPawn,
                              YellowPawn[] yellowPawn, BluePawn[] bluePawn,
                              ImageView[] redPawns, ImageView[] greenPawns,
                              ImageView[] yellowPawns, ImageView[] bluePawns,
                              int clickedPawnIndex) {
        if (clickedPawnIndex == 0) {
            for (int i=0; i <= 3; i++) {
                if (redPositionIsTheSameAsGreen(redPawn, greenPawn[i], 0)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (redPositionIsTheSameAsYellow(redPawn, yellowPawn[i], 0)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                } else if (redPositionIsTheSameAsBlue(redPawn, bluePawn[i], 0)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 1) {
            for (int i=0; i <= 3; i++) {
                if (redPositionIsTheSameAsGreen(redPawn, greenPawn[i], 1)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (redPositionIsTheSameAsYellow(redPawn, yellowPawn[i], 1)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                } else if (redPositionIsTheSameAsBlue(redPawn, bluePawn[i], 1)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 2) {
            for (int i=0; i <= 3; i++) {
                if (redPositionIsTheSameAsGreen(redPawn, greenPawn[i], 2)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (redPositionIsTheSameAsYellow(redPawn, yellowPawn[i], 2)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                } else if (redPositionIsTheSameAsBlue(redPawn, bluePawn[i], 2)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 3) {
            for (int i=0; i <= 3; i++) {
                if (redPositionIsTheSameAsGreen(redPawn, greenPawn[i], 3)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (redPositionIsTheSameAsYellow(redPawn, yellowPawn[i], 3)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                } else if (redPositionIsTheSameAsBlue(redPawn, bluePawn[i], 3)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 4) {
            for (int i=0; i <= 3; i++) {
                if (greenPositionIsTheSameAsRed(greenPawn, redPawn[i], 0)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (greenPositionIsTheSameAsYellow(greenPawn, yellowPawn[i], 0)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                } else if (greenPositionIsTheSameAsBlue(greenPawn, bluePawn[i], 0)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 5) {
            for (int i=0; i <= 3; i++) {
                if (greenPositionIsTheSameAsRed(greenPawn, redPawn[i], 1)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (greenPositionIsTheSameAsYellow(greenPawn, yellowPawn[i], 1)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                } else if (greenPositionIsTheSameAsBlue(greenPawn, bluePawn[i], 1)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 6) {
            for (int i=0; i <= 3; i++) {
                if (greenPositionIsTheSameAsRed(greenPawn, redPawn[i], 2)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (greenPositionIsTheSameAsYellow(greenPawn, yellowPawn[i], 2)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                } else if (greenPositionIsTheSameAsBlue(greenPawn, bluePawn[i], 2)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 7) {
            for (int i=0; i <= 3; i++) {
                if (greenPositionIsTheSameAsRed(greenPawn, redPawn[i], 3)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (greenPositionIsTheSameAsYellow(greenPawn, yellowPawn[i], 3)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                } else if (greenPositionIsTheSameAsBlue(greenPawn, bluePawn[i], 3)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 8) {
            for (int i=0; i <= 3; i++) {
                if (yellowPositionIsTheSameAsRed(yellowPawn, redPawn[i], 0)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (yellowPositionIsTheSameAsGreen(yellowPawn, greenPawn[i], 0)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (yellowPositionIsTheSameAsBlue(yellowPawn, bluePawn[i], 0)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 9) {
            for (int i=0; i <= 3; i++) {
                if (yellowPositionIsTheSameAsRed(yellowPawn, redPawn[i], 1)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (yellowPositionIsTheSameAsGreen(yellowPawn, greenPawn[i], 1)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (yellowPositionIsTheSameAsBlue(yellowPawn, bluePawn[i], 1)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 10) {
            for (int i=0; i <= 3; i++) {
                if (yellowPositionIsTheSameAsRed(yellowPawn, redPawn[i], 2)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (yellowPositionIsTheSameAsGreen(yellowPawn, greenPawn[i], 2)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (yellowPositionIsTheSameAsBlue(yellowPawn, bluePawn[i], 2)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 11) {
            for (int i=0; i <= 3; i++) {
                if (yellowPositionIsTheSameAsRed(yellowPawn, redPawn[i], 3)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (yellowPositionIsTheSameAsGreen(yellowPawn, greenPawn[i], 3)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (yellowPositionIsTheSameAsBlue(yellowPawn, bluePawn[i], 3)) {
                    grid.getChildren().remove(bluePawns[i]);
                    bluePawn[i].gotCaptured(i);
                    grid.add(bluePawns[i], bluePawn[i].getValueX(), bluePawn[i].getValueY(), bluePawn[i].getColspan(), bluePawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 12) {
            for (int i=0; i <= 3; i++) {
                if (bluePositionIsTheSameAsRed(bluePawn, redPawn[i], 0)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (bluePositionIsTheSameAsGreen(bluePawn, greenPawn[i], 0)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (bluePositionIsTheSameAsYellow(bluePawn, yellowPawn[i], 0)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 13) {
            for (int i=0; i <= 3; i++) {
                if (bluePositionIsTheSameAsRed(bluePawn, redPawn[i], 1)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (bluePositionIsTheSameAsGreen(bluePawn, greenPawn[i], 1)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (bluePositionIsTheSameAsYellow(bluePawn, yellowPawn[i], 1)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 14) {
            for (int i=0; i <= 3; i++) {
                if (bluePositionIsTheSameAsRed(bluePawn, redPawn[i], 2)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (bluePositionIsTheSameAsGreen(bluePawn, greenPawn[i], 2)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (bluePositionIsTheSameAsYellow(bluePawn, yellowPawn[i], 2)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                }
            }
        } else if (clickedPawnIndex == 15) {
            for (int i=0; i <= 3; i++) {
                if (bluePositionIsTheSameAsRed(bluePawn, redPawn[i], 3)) {
                    grid.getChildren().remove(redPawns[i]);
                    redPawn[i].gotCaptured(i);
                    grid.add(redPawns[i], redPawn[i].getValueX(), redPawn[i].getValueY(), redPawn[i].getColspan(), redPawn[i].getRowspan());
                } else if (bluePositionIsTheSameAsGreen(bluePawn, greenPawn[i], 3)) {
                    grid.getChildren().remove(greenPawns[i]);
                    greenPawn[i].gotCaptured(i);
                    grid.add(greenPawns[i], greenPawn[i].getValueX(), greenPawn[i].getValueY(), greenPawn[i].getColspan(), greenPawn[i].getRowspan());
                } else if (bluePositionIsTheSameAsYellow(bluePawn, yellowPawn[i], 3)) {
                    grid.getChildren().remove(yellowPawns[i]);
                    yellowPawn[i].gotCaptured(i);
                    grid.add(yellowPawns[i], yellowPawn[i].getValueX(), yellowPawn[i].getValueY(), yellowPawn[i].getColspan(), yellowPawn[i].getRowspan());
                }
            }
        }
    }

    private boolean bluePositionIsTheSameAsYellow(BluePawn[] bluePawn, YellowPawn yellowPawn, int bluePIndex) {
        return bluePawn[bluePIndex].getActualPositionIndex() == yellowPawn.getActualPositionIndex();
    }

    private boolean bluePositionIsTheSameAsGreen(BluePawn[] bluePawn, GreenPawn greenPawn, int bluePIndex) {
        return bluePawn[bluePIndex].getActualPositionIndex() == greenPawn.getActualPositionIndex();
    }

    private boolean bluePositionIsTheSameAsRed(BluePawn[] bluePawn, RedPawn redPawn, int bluePIndex) {
        return bluePawn[bluePIndex].getActualPositionIndex() == redPawn.getActualPositionIndex();
    }

    private boolean yellowPositionIsTheSameAsBlue(YellowPawn[] yellowPawn, BluePawn bluePawn, int yellowPIndex) {
        return yellowPawn[yellowPIndex].getActualPositionIndex() == bluePawn.getActualPositionIndex();
    }

    private boolean yellowPositionIsTheSameAsGreen(YellowPawn[] yellowPawn, GreenPawn greenPawn, int yellowPIndex) {
        return yellowPawn[yellowPIndex].getActualPositionIndex() == greenPawn.getActualPositionIndex();
    }

    private boolean yellowPositionIsTheSameAsRed(YellowPawn[] yellowPawn, RedPawn redPawn, int yellowPIndex) {
        return yellowPawn[yellowPIndex].getActualPositionIndex() == redPawn.getActualPositionIndex();
    }

    private boolean greenPositionIsTheSameAsBlue(GreenPawn[] greenPawn, BluePawn bluePawn, int greenPIndex) {
        return greenPawn[greenPIndex].getActualPositionIndex() == bluePawn.getActualPositionIndex();
    }

    private boolean greenPositionIsTheSameAsYellow(GreenPawn[] greenPawn, YellowPawn yellowPawn, int greenPIndex) {
        return greenPawn[greenPIndex].getActualPositionIndex() == yellowPawn.getActualPositionIndex();
    }

    private boolean greenPositionIsTheSameAsRed(GreenPawn[] greenPawn, RedPawn redPawn, int greenPIndex) {
        return greenPawn[greenPIndex].getActualPositionIndex() == redPawn.getActualPositionIndex();
    }

    private boolean redPositionIsTheSameAsBlue(RedPawn[] redPawn, BluePawn bluePawn, int redPIndex) {
        return redPawn[redPIndex].getActualPositionIndex() == bluePawn.getActualPositionIndex();
    }

    private boolean redPositionIsTheSameAsYellow(RedPawn[] redPawn, YellowPawn yellowPawn, int redPIndex) {
        return redPawn[redPIndex].getActualPositionIndex() == yellowPawn.getActualPositionIndex();
    }

    private boolean redPositionIsTheSameAsGreen(RedPawn[] redPawn, GreenPawn greenPawn, int redPIndex) {
        return redPawn[redPIndex].getActualPositionIndex() == greenPawn.getActualPositionIndex();
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
