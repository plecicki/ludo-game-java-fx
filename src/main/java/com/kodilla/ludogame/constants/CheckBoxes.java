package com.kodilla.ludogame.constants;

import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

public class CheckBoxes {

    public CheckBox setCheckBoxesInMenu(int colorIndex) {

        CheckBox checkBox = new CheckBox();
        if (colorIndex == 1) {
            checkBox.setText("Red pawns");
            checkBox.setFont(Font.font("Arial", FontWeight.BOLD, 20));
            checkBox.setTextAlignment(TextAlignment.CENTER);
            checkBox.setAlignment(Pos.TOP_LEFT);
            checkBox.setWrapText(true);
            checkBox.setMaxSize(200, 20);
        } else if (colorIndex == 2) {
            checkBox.setText("Green pawns");
            checkBox.setFont(Font.font("Arial", FontWeight.BOLD, 20));
            checkBox.setTextAlignment(TextAlignment.CENTER);
            checkBox.setAlignment(Pos.TOP_LEFT);
            checkBox.setWrapText(true);
            checkBox.setMaxSize(200, 20);
        } else if (colorIndex == 3) {
            checkBox.setText("Yellow pawns");
            checkBox.setFont(Font.font("Arial", FontWeight.BOLD, 20));
            checkBox.setTextAlignment(TextAlignment.CENTER);
            checkBox.setAlignment(Pos.TOP_LEFT);
            checkBox.setWrapText(true);
            checkBox.setMaxSize(200, 20);
        } else if (colorIndex == 4) {
            checkBox.setText("Blue pawns");
            checkBox.setFont(Font.font("Arial", FontWeight.BOLD, 20));
            checkBox.setTextAlignment(TextAlignment.CENTER);
            checkBox.setAlignment(Pos.TOP_LEFT);
            checkBox.setWrapText(true);
            checkBox.setMaxSize(200, 20);
        }
        return checkBox;
    }
}
