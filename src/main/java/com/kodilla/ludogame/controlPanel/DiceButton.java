package com.kodilla.ludogame.controlPanel;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class DiceButton {
    public Button throwDiceButton() {
        Button button = new Button();
        button.setText("THROW THE DICE");
        button.setFont(Font.font("Arial", FontWeight.BOLD, 28));
        button.setTextAlignment(TextAlignment.CENTER);
        button.setAlignment(Pos.CENTER);
        button.setWrapText(true);
        button.setMaxSize(290, 30);

        button.setOnAction(value ->  {

        });

        return button;
    }
}
