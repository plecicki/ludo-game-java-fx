package com.kodilla.ludogame.constants;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

import java.util.ArrayList;

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

    public Button continueButton(ArrayList<String> fileList) {
        Button button = new Button();
        button.setText("LOAD GAME");
        button.setFont(Font.font("Arial", FontWeight.BOLD, 25));
        button.setTextAlignment(TextAlignment.CENTER);
        button.setAlignment(Pos.CENTER);
        button.setWrapText(true);
        button.setMaxSize(250, 30);
        if (fileList.get(0).charAt(0) == '0') {
            button.setDisable(true);
        } else {
            button.setDisable(false);
        }

        return button;
    }
}
