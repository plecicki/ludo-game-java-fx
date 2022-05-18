package com.kodilla.ludogame.constants;

import com.kodilla.ludogame.computer.ComputerPlaying;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;

import java.util.ArrayList;

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

    public void chosenColorsAtNewGame(CheckBox checkBox1, CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4,
                                      ComputerPlaying computerPlaying) {
        if (!checkBox1.isSelected()) {
            computerPlaying.setRedPlayer(false);
        }
        if (!checkBox2.isSelected()) {
            computerPlaying.setGreenPlayer(false);
        }
        if (!checkBox3.isSelected()) {
            computerPlaying.setYellowPlayer(false);
        }
        if (!checkBox4.isSelected()) {
            computerPlaying.setBluePlayer(false);
        }
    }

    public void chosenColorsAtContinueGame(ArrayList<String> savedLines, ComputerPlaying computerPlaying) {
        if (!(savedLines.get(21).charAt(0) == '1')) {
            computerPlaying.setRedPlayer(false);
        }
        if (!(savedLines.get(22).charAt(0) == '1')) {
            computerPlaying.setGreenPlayer(false);
        }
        if (!(savedLines.get(23).charAt(0) == '1')) {
            computerPlaying.setYellowPlayer(false);
        }
        if (!(savedLines.get(24).charAt(0) == '1')) {
            computerPlaying.setBluePlayer(false);
        }
    }
}
