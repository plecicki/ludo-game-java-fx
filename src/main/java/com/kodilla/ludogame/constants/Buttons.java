package com.kodilla.ludogame.constants;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class Buttons {

    public Button startButton() {
        Button button = new Button();
        button.setText("NEW GAME");
        button.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        button.setTextAlignment(TextAlignment.CENTER);
        button.setAlignment(Pos.CENTER);
        button.setWrapText(true);
        button.setMaxSize(250, 30);
        return button;
    }

    public Button continueButton() {
        Button button = new Button();
        button.setText("LOAD GAME");
        button.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        button.setTextAlignment(TextAlignment.CENTER);
        button.setAlignment(Pos.CENTER);
        button.setWrapText(true);
        button.setMaxSize(250, 30);
        button.setDisable(true);
        return button;
    }
}
