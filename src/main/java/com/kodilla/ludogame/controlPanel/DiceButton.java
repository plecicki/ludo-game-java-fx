package com.kodilla.ludogame.controlPanel;

import com.kodilla.ludogame.pawns.Blue;
import com.kodilla.ludogame.pawns.Green;
import com.kodilla.ludogame.pawns.Red;
import com.kodilla.ludogame.pawns.Yellow;
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
                              Red[] reds, Green[] greens,
                              Yellow[] yellows, Blue[] blues) {
        if (whoseTurn == 1) {
            if ((reds[0].getActualPositionIndex() == 0 ||
                    (reds[0].getActualPositionIndex() >= 72 && reds[0].getActualPositionIndex() < 77)) &&
                    (reds[1].getActualPositionIndex() == 1 ||
                            (reds[1].getActualPositionIndex() >= 72 && reds[1].getActualPositionIndex() < 77)) &&
                    (reds[2].getActualPositionIndex() == 2 ||
                            (reds[2].getActualPositionIndex() >= 72 && reds[2].getActualPositionIndex() < 77)) &&
                    (reds[3].getActualPositionIndex() == 3 ||
                            (reds[3].getActualPositionIndex() >= 72 && reds[3].getActualPositionIndex() < 77))) {
                if (diceValue == 6 &&
                        (reds[0].getActualPositionIndex() == 0 ||
                                reds[1].getActualPositionIndex() == 1 ||
                                reds[2].getActualPositionIndex() == 2 ||
                                reds[3].getActualPositionIndex() == 3)) {
                    available = true;
                } else {
                    available = false;
                }
            } else {
                available = true;
            }
        } else if (whoseTurn == 2) {
            if ((greens[0].getActualPositionIndex() == 4 ||
                    (greens[0].getActualPositionIndex() >= 77 && greens[0].getActualPositionIndex() < 82)) &&
                    (greens[1].getActualPositionIndex() == 5 ||
                            (greens[1].getActualPositionIndex() >= 77 && greens[1].getActualPositionIndex() < 82)) &&
                    (greens[2].getActualPositionIndex() == 6 ||
                            (greens[2].getActualPositionIndex() >= 77 && greens[2].getActualPositionIndex() < 82)) &&
                    (greens[3].getActualPositionIndex() == 7 ||
                            (greens[3].getActualPositionIndex() >= 77 && greens[3].getActualPositionIndex() < 82))) {
                if (diceValue == 6 &&
                        (greens[0].getActualPositionIndex() == 4 ||
                                greens[1].getActualPositionIndex() == 5 ||
                                greens[2].getActualPositionIndex() == 6 ||
                                greens[3].getActualPositionIndex() == 7)) {
                    available = true;
                } else {
                    available = false;
                }
            } else {
                available = true;
            }
        } else if (whoseTurn == 3) {
            if ((yellows[0].getActualPositionIndex() == 8 ||
                    (yellows[0].getActualPositionIndex() >= 82 && yellows[0].getActualPositionIndex() < 87)) &&
                    (yellows[1].getActualPositionIndex() == 9 ||
                            (yellows[1].getActualPositionIndex() >= 82 && yellows[1].getActualPositionIndex() < 87)) &&
                    (yellows[2].getActualPositionIndex() == 10 ||
                            (yellows[2].getActualPositionIndex() >= 82 && yellows[2].getActualPositionIndex() < 87)) &&
                    (yellows[3].getActualPositionIndex() == 11 ||
                            (yellows[3].getActualPositionIndex() >= 82 && yellows[3].getActualPositionIndex() < 87))) {
                if (diceValue == 6 &&
                        (yellows[0].getActualPositionIndex() == 8 ||
                                yellows[1].getActualPositionIndex() == 9 ||
                                yellows[2].getActualPositionIndex() == 10 ||
                                yellows[3].getActualPositionIndex() == 11)) {
                    available = true;
                } else {
                    available = false;
                }
            } else {
                available = true;
            }
        } else if (whoseTurn == 4) {
            if ((blues[0].getActualPositionIndex() == 12 ||
                    (blues[0].getActualPositionIndex() >= 87 && blues[0].getActualPositionIndex() < 92)) &&
                    (blues[1].getActualPositionIndex() == 13 ||
                            (blues[1].getActualPositionIndex() >= 87 && blues[1].getActualPositionIndex() < 92)) &&
                    (blues[2].getActualPositionIndex() == 14 ||
                            (blues[2].getActualPositionIndex() >= 87 && blues[2].getActualPositionIndex() < 92)) &&
                    (blues[3].getActualPositionIndex() == 15 ||
                            (blues[3].getActualPositionIndex() >= 87 && blues[3].getActualPositionIndex() < 92))) {
                if (diceValue == 6 &&
                        (blues[0].getActualPositionIndex() == 12 ||
                                blues[1].getActualPositionIndex() == 13 ||
                                blues[2].getActualPositionIndex() == 14 ||
                                blues[3].getActualPositionIndex() == 15)) {
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
