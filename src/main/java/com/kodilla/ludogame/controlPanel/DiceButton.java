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
    private boolean available;

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

    public void availableMove(char color, int diceValue,
                              Red[] reds, Green[] greens,
                              Yellow[] yellows, Blue[] blues) {
        if (color == 'R') {
            if (reds[0].getActualPositionIndex() == 0 &&
                    reds[1].getActualPositionIndex() == 1 &&
                    reds[2].getActualPositionIndex() == 2 &&
                    reds[3].getActualPositionIndex() == 3) {
                if (diceValue < 6) {
                    available = false;
                } else {
                    available = true;
                }
            } else if (reds[0].getActualPositionIndex() >= 72 && reds[0].getActualPositionIndex() < 77 &&
                    reds[1].getActualPositionIndex() >= 72 && reds[1].getActualPositionIndex() < 77 &&
                    reds[2].getActualPositionIndex() >= 72 && reds[2].getActualPositionIndex() < 77 &&
                    reds[3].getActualPositionIndex() >= 72 && reds[3].getActualPositionIndex() < 77) {
                available = false;
            } else {
                available = true;
            }
        } else if (color == 'G') {
            if (greens[0].getActualPositionIndex() == 4 &&
                    greens[1].getActualPositionIndex() == 5 &&
                    greens[2].getActualPositionIndex() == 6 &&
                    greens[3].getActualPositionIndex() == 7) {
                if (diceValue < 6) {
                    available = false;
                } else {
                    available = true;
                }
            } else if (greens[0].getActualPositionIndex() >= 77 && greens[0].getActualPositionIndex() < 82 &&
                    greens[1].getActualPositionIndex() >= 77 && greens[1].getActualPositionIndex() < 82 &&
                    greens[2].getActualPositionIndex() >= 77 && greens[2].getActualPositionIndex() < 82 &&
                    greens[3].getActualPositionIndex() >= 77 && greens[3].getActualPositionIndex() < 82) {
                available = false;
            } else {
                available = true;
            }
        } else if (color == 'Y') {
            if (yellows[0].getActualPositionIndex() == 8 &&
                    yellows[1].getActualPositionIndex() == 9 &&
                    yellows[2].getActualPositionIndex() == 10 &&
                    yellows[3].getActualPositionIndex() == 11) {
                if (diceValue < 6) {
                    available = false;
                } else {
                    available = true;
                }
            } else if (yellows[0].getActualPositionIndex() >= 82 && yellows[0].getActualPositionIndex() < 87 &&
                    yellows[1].getActualPositionIndex() >= 82 && yellows[1].getActualPositionIndex() < 87 &&
                    yellows[2].getActualPositionIndex() >= 82 && yellows[2].getActualPositionIndex() < 87 &&
                    yellows[3].getActualPositionIndex() >= 82 && yellows[3].getActualPositionIndex() < 87) {
                available = false;
            } else {
                available = true;
            }
        } else if (color == 'B') {
            if (blues[0].getActualPositionIndex() == 12 &&
                    blues[1].getActualPositionIndex() == 13 &&
                    blues[2].getActualPositionIndex() == 14 &&
                    blues[3].getActualPositionIndex() == 15) {
                if (diceValue < 6) {
                    available = false;
                } else {
                    available = true;
                }
            } else if (blues[0].getActualPositionIndex() >= 87 && blues[0].getActualPositionIndex() < 92 &&
                    blues[1].getActualPositionIndex() >= 87 && blues[1].getActualPositionIndex() < 92 &&
                    blues[2].getActualPositionIndex() >= 87 && blues[2].getActualPositionIndex() < 92 &&
                    blues[3].getActualPositionIndex() >= 87 && blues[3].getActualPositionIndex() < 92) {
                available = false;
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
}
