package com.kodilla.ludogame.savingToFile;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.constants.Labels;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.controlPanel.TurnLabels;
import com.kodilla.ludogame.dice.DiceImage;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class StartGame {

    public void setStartParameters(GridPane grid, Red[] redP, Green[] greenP, Yellow[] yellowP, Blue[] blueP,
                                   ImageView[] redPawns, ImageView[] greenPawns,
                                   ImageView[] yellowPawns, ImageView[] bluePawns,
                                   DiceImage diceImage, TurnLabels turnLabels,
                                   OnClickPawn onClickPawn) {
        for (int i = 0; i <= 3; i++) {
            grid.add(redPawns[i], new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY(), 10, 10);
            redP[i].setActualPosition(new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY());
            redP[i].setActualPositionIndex(i);

            grid.add(greenPawns[i], new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY(), 10, 10);
            greenP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY());
            greenP[i].setActualPositionIndex(i + 4);

            grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY(), 10, 10);
            yellowP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY());
            yellowP[i].setActualPositionIndex(i + 8);

            grid.add(bluePawns[i], new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY(), 10, 10);
            blueP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY());
            blueP[i].setActualPositionIndex(i + 12);
        }

        diceImage.startDiceImageMethod(1);
        turnLabels.turnLabels(1);
        turnLabels.instructionLabels(1);
        onClickPawn.setWhoseTurn(1);

        grid.add(diceImage.getActualImage(), 8, 124, 30, 30);
        grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);
        grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
        grid.add(new Labels().setAuthorLabel(), 8, 1, 80, 7);
        grid.add(new Labels().setGitHubLabel(), 85, 1, 80, 7);
    }

    public void setContinueParameters(GridPane grid, Red[] redP, Green[] greenP, Yellow[] yellowP, Blue[] blueP,
                                      ImageView[] redPawns, ImageView[] greenPawns,
                                      ImageView[] yellowPawns, ImageView[] bluePawns,
                                      DiceImage diceImage, TurnLabels turnLabels,
                                      OnClickPawn onClickPawn, ArrayList<String> fileList,
                                      CheckBox checkBox1, CheckBox checkBox2,
                                      CheckBox checkBox3, CheckBox checkBox4,
                                      DiceButton diceButtonObject, Button diceButton,
                                      ThrowDice throwDice) {

        grid.add(redPawns[0],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueY(),
                10, 10);
        redP[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueY());
        redP[0].setActualPositionIndex(Integer.parseInt(fileList.get(1)));

        grid.add(redPawns[1],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueY(),
                10, 10);
        redP[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueY());
        redP[1].setActualPositionIndex(Integer.parseInt(fileList.get(2)));

        grid.add(redPawns[2],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueY(),
                10, 10);
        redP[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueY());
        redP[2].setActualPositionIndex(Integer.parseInt(fileList.get(3)));

        grid.add(redPawns[3],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueY(),
                10, 10);
        redP[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueY());
        redP[3].setActualPositionIndex(Integer.parseInt(fileList.get(4)));

        grid.add(greenPawns[0],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueY(),
                10, 10);
        greenP[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueY());
        greenP[0].setActualPositionIndex(Integer.parseInt(fileList.get(5)));

        grid.add(greenPawns[1],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueY(),
                10, 10);
        greenP[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueY());
        greenP[1].setActualPositionIndex(Integer.parseInt(fileList.get(6)));

        grid.add(greenPawns[2],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueY(),
                10, 10);
        greenP[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueY());
        greenP[2].setActualPositionIndex(Integer.parseInt(fileList.get(7)));

        grid.add(greenPawns[3],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueY(),
                10, 10);
        greenP[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueY());
        greenP[3].setActualPositionIndex(Integer.parseInt(fileList.get(8)));

        grid.add(yellowPawns[0],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueY(),
                10, 10);
        yellowP[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueY());
        yellowP[0].setActualPositionIndex(Integer.parseInt(fileList.get(9)));

        grid.add(yellowPawns[1],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueY(),
                10, 10);
        yellowP[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueY());
        yellowP[1].setActualPositionIndex(Integer.parseInt(fileList.get(10)));

        grid.add(yellowPawns[2],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueY(),
                10, 10);
        yellowP[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueY());
        yellowP[2].setActualPositionIndex(Integer.parseInt(fileList.get(11)));

        grid.add(yellowPawns[3],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueY(),
                10, 10);
        yellowP[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueY());
        yellowP[3].setActualPositionIndex(Integer.parseInt(fileList.get(12)));

        grid.add(bluePawns[0],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueY(),
                10, 10);
        blueP[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueY());
        blueP[0].setActualPositionIndex(Integer.parseInt(fileList.get(13)));

        grid.add(bluePawns[1],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueY(),
                10, 10);
        blueP[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueY());
        blueP[1].setActualPositionIndex(Integer.parseInt(fileList.get(14)));

        grid.add(bluePawns[2],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueY(),
                10, 10);
        blueP[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueY());
        blueP[2].setActualPositionIndex(Integer.parseInt(fileList.get(15)));

        grid.add(bluePawns[3],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueY(),
                10, 10);
        blueP[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueY());
        blueP[3].setActualPositionIndex(Integer.parseInt(fileList.get(16)));

        diceImage.startDiceImageMethod(Integer.parseInt(fileList.get(17)));
        throwDice.setDiceIndex(Integer.parseInt(fileList.get(17)));
        turnLabels.turnLabels(Integer.parseInt(fileList.get(18)));
        turnLabels.instructionLabels(Integer.parseInt(fileList.get(19)));
        onClickPawn.setWhoseTurn(Integer.parseInt(fileList.get(20)));
        if (fileList.get(21).charAt(0) == '1') {
            checkBox1.setSelected(true);
        }
        if (fileList.get(22).charAt(0) == '1') {
            checkBox2.setSelected(true);
        }
        if (fileList.get(23).charAt(0) == '1') {
            checkBox3.setSelected(true);
        }
        if (fileList.get(24).charAt(0) == '1') {
            checkBox4.setSelected(true);
        }
        if (fileList.get(25).charAt(0) == '1') {
            diceButtonObject.setWasClicked(true);
            diceButton.setDisable(true);
        }

        grid.add(diceImage.getActualImage(), 8, 124, 30, 30);
        grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);
        grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
        grid.add(new Labels().setAuthorLabel(), 8, 1, 80, 7);
        grid.add(new Labels().setGitHubLabel(), 85, 1, 80, 7);
    }
}
