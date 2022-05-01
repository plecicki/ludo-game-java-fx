package com.kodilla.ludogame.controlPanel;

import com.sun.prism.paint.Color;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.text.Font;

public class TurnLabel {

    public Label turnLabels(int playerIndex) {
        Label label = new Label();
        label.setFont(new Font("Oswald",30));
        if (playerIndex == 1) {
            label.setText("Red player's turn");
            label.setStyle("-fx-font-weight: bold; -fx-background-color: pink; -fx-text-fill: red");
        } else if (playerIndex == 2) {
            label.setText("Green player's turn");
            label.setStyle("-fx-font-weight: bold; -fx-background-color: lightgreen; -fx-text-fill: green");
        } else if (playerIndex == 3) {
            label.setText("Yellow player's turn");
            label.setStyle("-fx-font-weight: bold; -fx-background-color: orange; -fx-text-fill: yellow");
        } else if (playerIndex == 4) {
            label.setText("Blue player's turn");
            label.setStyle("-fx-font-weight: bold; -fx-background-color: lightblue; -fx-text-fill: blue");
        }
        return label;
    }
}
