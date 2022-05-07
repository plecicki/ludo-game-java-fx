package com.kodilla.ludogame.controlPanel;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

public class TurnLabels {

    private Label turnLabel;
    private Label infoLabel;

    public void turnLabels(int playerIndex) {
        Label turnLabel = new Label();
        turnLabel.setFont(new Font("Oswald",30));
        if (playerIndex == 1) {
            turnLabel.setText("Red player's turn");
            turnLabel.setStyle("-fx-font-weight: bold; -fx-background-color: pink; -fx-text-fill: red");
        } else if (playerIndex == 2) {
            turnLabel.setText("Green player's turn");
            turnLabel.setStyle("-fx-font-weight: bold; -fx-background-color: lightgreen; -fx-text-fill: green");
        } else if (playerIndex == 3) {
            turnLabel.setText("Yellow player's turn");
            turnLabel.setStyle("-fx-font-weight: bold; -fx-background-color: orange; -fx-text-fill: yellow");
        } else if (playerIndex == 4) {
            turnLabel.setText("Blue player's turn");
            turnLabel.setStyle("-fx-font-weight: bold; -fx-background-color: lightblue; -fx-text-fill: blue");
        }
        this.turnLabel = turnLabel;
    }

    public void instructionLabels(int infoIndex) {
        Label infoLabel = new Label();
        infoLabel.setFont(new Font("Arial", 25));
        infoLabel.setStyle("-fx-font-weight: bold; -fx-background-color: #c9c9fa; -fx-text-fill: #585183");
        infoLabel.setTextAlignment(TextAlignment.CENTER);
        infoLabel.setAlignment(Pos.CENTER);
        if (infoIndex == 1) {
            infoLabel.setText("Throw\nthe dice");
        } else if (infoIndex == 2) {
            infoLabel.setText("Choose\nthe pawn\nand click");
        }
        this.infoLabel = infoLabel;
    }

    public Label getTurnLabel() {
        return turnLabel;
    }

    public Label getInfoLabel() {
        return infoLabel;
    }
}
