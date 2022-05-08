package com.kodilla.ludogame.computer;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class ComputerPlaying {

    ImageView[] redIV;
    ImageView[] greenIV;
    ImageView[] yellowIV;
    ImageView[] blueIV;
    Button buttonDice;

    //Player play = true
    //Computer play = false
    boolean redPlayer = true;
    boolean greenPlayer = false;
    boolean yellowPlayer = false;
    boolean bluePlayer = false;

    public ComputerPlaying(ImageView[] redIV, ImageView[] greenIV, ImageView[] yellowIV, ImageView[] blueIV, Button buttonDice) {
        this.redIV = redIV;
        this.greenIV = greenIV;
        this.yellowIV = yellowIV;
        this.blueIV = blueIV;
        this.buttonDice = buttonDice;
    }

    public void play(int whoseTurn, boolean buttonWasClicked) {
        if (redPlayer == false && whoseTurn == 1) {
            if (buttonWasClicked == false) {
                buttonDice.fire();
            } else {
                for (int i=0; i<4; i++) {
                    redIV[i].fireEvent(new MouseEvent(MouseEvent.MOUSE_CLICKED, 0, 0, 0, 0,
                            MouseButton.PRIMARY, 1, true, true, true, true,
                            true, true, true, true,
                            true, true, null));
                }
            }
        } else if (greenPlayer == false && whoseTurn == 2) {
            if (buttonWasClicked == false) {
                buttonDice.fire();
            } else {
                for (int i=0; i<4; i++) {
                    greenIV[i].fireEvent(new MouseEvent(MouseEvent.MOUSE_CLICKED, 0, 0, 0, 0,
                            MouseButton.PRIMARY, 1, true, true, true, true,
                            true, true, true, true,
                            true, true, null));
                }
            }
        } else if (yellowPlayer == false && whoseTurn == 3) {
            if (buttonWasClicked == false) {
                buttonDice.fire();
            } else {
                for (int i=0; i<4; i++) {
                    yellowIV[i].fireEvent(new MouseEvent(MouseEvent.MOUSE_CLICKED, 0, 0, 0, 0,
                            MouseButton.PRIMARY, 1, true, true, true, true,
                            true, true, true, true,
                            true, true, null));
                }
            }
        } else if (bluePlayer == false && whoseTurn == 4) {
            if (buttonWasClicked == false) {
                buttonDice.fire();
            } else {
                for (int i=0; i<4; i++) {
                    blueIV[i].fireEvent(new MouseEvent(MouseEvent.MOUSE_CLICKED, 0, 0, 0, 0,
                            MouseButton.PRIMARY, 1, true, true, true, true,
                            true, true, true, true,
                            true, true, null));
                }
            }
        }
    }
}
