package com.kodilla.ludogame.controlPanel;

import com.kodilla.ludogame.pawns.BluePawn;
import com.kodilla.ludogame.pawns.GreenPawn;
import com.kodilla.ludogame.pawns.RedPawn;
import com.kodilla.ludogame.pawns.YellowPawn;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class DiceButton {
    private boolean available = false;
    private boolean wasClicked = false;

    public Button throwDiceButton() {
        Button button = new Button();
        button.setText("THROW THE DICE");
        button.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        button.setTextAlignment(TextAlignment.CENTER);
        button.setAlignment(Pos.CENTER);
        button.setWrapText(true);
        button.setMaxSize(290, 30);
        return button;
    }

    public void availableMove(int whoseTurn, int diceValue,
                              RedPawn[] redPawns, GreenPawn[] greenPawns,
                              YellowPawn[] yellowPawns, BluePawn[] bluePawns) {
        if (whoseTurn == 1) {
            if ((redPawns[0].getActualPositionIndex() == 0 ||
                    (redPawns[0].getActualPositionIndex() >= 72 && redPawns[0].getActualPositionIndex() < 77)) &&
                    (redPawns[1].getActualPositionIndex() == 1 ||
                            (redPawns[1].getActualPositionIndex() >= 72 && redPawns[1].getActualPositionIndex() < 77)) &&
                    (redPawns[2].getActualPositionIndex() == 2 ||
                            (redPawns[2].getActualPositionIndex() >= 72 && redPawns[2].getActualPositionIndex() < 77)) &&
                    (redPawns[3].getActualPositionIndex() == 3 ||
                            (redPawns[3].getActualPositionIndex() >= 72 && redPawns[3].getActualPositionIndex() < 77))) {
                if (diceValue == 6 &&
                        (redPawns[0].getActualPositionIndex() == 0 ||
                                redPawns[1].getActualPositionIndex() == 1 ||
                                redPawns[2].getActualPositionIndex() == 2 ||
                                redPawns[3].getActualPositionIndex() == 3)) {
                    available = true;
                } else {
                    available = false;
                }
            } else {
                available = true;
            }
        } else if (whoseTurn == 2) {
            if ((greenPawns[0].getActualPositionIndex() == 4 ||
                    (greenPawns[0].getActualPositionIndex() >= 77 && greenPawns[0].getActualPositionIndex() < 82)) &&
                    (greenPawns[1].getActualPositionIndex() == 5 ||
                            (greenPawns[1].getActualPositionIndex() >= 77 && greenPawns[1].getActualPositionIndex() < 82)) &&
                    (greenPawns[2].getActualPositionIndex() == 6 ||
                            (greenPawns[2].getActualPositionIndex() >= 77 && greenPawns[2].getActualPositionIndex() < 82)) &&
                    (greenPawns[3].getActualPositionIndex() == 7 ||
                            (greenPawns[3].getActualPositionIndex() >= 77 && greenPawns[3].getActualPositionIndex() < 82))) {
                if (diceValue == 6 &&
                        (greenPawns[0].getActualPositionIndex() == 4 ||
                                greenPawns[1].getActualPositionIndex() == 5 ||
                                greenPawns[2].getActualPositionIndex() == 6 ||
                                greenPawns[3].getActualPositionIndex() == 7)) {
                    available = true;
                } else {
                    available = false;
                }
            } else {
                available = true;
            }
        } else if (whoseTurn == 3) {
            if ((yellowPawns[0].getActualPositionIndex() == 8 ||
                    (yellowPawns[0].getActualPositionIndex() >= 82 && yellowPawns[0].getActualPositionIndex() < 87)) &&
                    (yellowPawns[1].getActualPositionIndex() == 9 ||
                            (yellowPawns[1].getActualPositionIndex() >= 82 && yellowPawns[1].getActualPositionIndex() < 87)) &&
                    (yellowPawns[2].getActualPositionIndex() == 10 ||
                            (yellowPawns[2].getActualPositionIndex() >= 82 && yellowPawns[2].getActualPositionIndex() < 87)) &&
                    (yellowPawns[3].getActualPositionIndex() == 11 ||
                            (yellowPawns[3].getActualPositionIndex() >= 82 && yellowPawns[3].getActualPositionIndex() < 87))) {
                if (diceValue == 6 &&
                        (yellowPawns[0].getActualPositionIndex() == 8 ||
                                yellowPawns[1].getActualPositionIndex() == 9 ||
                                yellowPawns[2].getActualPositionIndex() == 10 ||
                                yellowPawns[3].getActualPositionIndex() == 11)) {
                    available = true;
                } else {
                    available = false;
                }
            } else {
                available = true;
            }
        } else if (whoseTurn == 4) {
            if ((bluePawns[0].getActualPositionIndex() == 12 ||
                    (bluePawns[0].getActualPositionIndex() >= 87 && bluePawns[0].getActualPositionIndex() < 92)) &&
                    (bluePawns[1].getActualPositionIndex() == 13 ||
                            (bluePawns[1].getActualPositionIndex() >= 87 && bluePawns[1].getActualPositionIndex() < 92)) &&
                    (bluePawns[2].getActualPositionIndex() == 14 ||
                            (bluePawns[2].getActualPositionIndex() >= 87 && bluePawns[2].getActualPositionIndex() < 92)) &&
                    (bluePawns[3].getActualPositionIndex() == 15 ||
                            (bluePawns[3].getActualPositionIndex() >= 87 && bluePawns[3].getActualPositionIndex() < 92))) {
                if (diceValue == 6 &&
                        (bluePawns[0].getActualPositionIndex() == 12 ||
                                bluePawns[1].getActualPositionIndex() == 13 ||
                                bluePawns[2].getActualPositionIndex() == 14 ||
                                bluePawns[3].getActualPositionIndex() == 15)) {
                    available = true;
                } else {
                    available = false;
                }
            } else {
                available = true;
            }
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isWasClicked() {
        return wasClicked;
    }

    public void setWasClicked(boolean wasClicked) {
        this.wasClicked = wasClicked;
    }
}
