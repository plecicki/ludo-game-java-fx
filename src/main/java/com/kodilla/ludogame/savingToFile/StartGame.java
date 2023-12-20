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

    public void setStartParameters(GridPane grid, RedPawn[] redPawn, GreenPawn[] greenPawn, YellowPawn[] yellowPawn, BluePawn[] bluePawn,
                                   ImageView[] redPawns, ImageView[] greenPawns,
                                   ImageView[] yellowPawns, ImageView[] bluePawns,
                                   DiceImage diceImage, TurnLabels turnLabels,
                                   OnClickPawn onClickPawn) {
        for (int i = 0; i <= 3; i++) {
            grid.add(redPawns[i], new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY(), 10, 10);
            redPawn[i].setActualPosition(new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY());
            redPawn[i].setActualPositionIndex(i);

            grid.add(greenPawns[i], new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY(), 10, 10);
            greenPawn[i].setActualPosition(new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY());
            greenPawn[i].setActualPositionIndex(i + 4);

            grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY(), 10, 10);
            yellowPawn[i].setActualPosition(new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY());
            yellowPawn[i].setActualPositionIndex(i + 8);

            grid.add(bluePawns[i], new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY(), 10, 10);
            bluePawn[i].setActualPosition(new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY());
            bluePawn[i].setActualPositionIndex(i + 12);
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

    public void setContinueParameters(GridPane grid, RedPawn[] redPawn, GreenPawn[] greenPawn, YellowPawn[] yellowPawn, BluePawn[] bluePawn,
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
        redPawn[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueY());
        redPawn[0].setActualPositionIndex(Integer.parseInt(fileList.get(1)));

        grid.add(redPawns[1],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueY(),
                10, 10);
        redPawn[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueY());
        redPawn[1].setActualPositionIndex(Integer.parseInt(fileList.get(2)));

        grid.add(redPawns[2],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueY(),
                10, 10);
        redPawn[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueY());
        redPawn[2].setActualPositionIndex(Integer.parseInt(fileList.get(3)));

        grid.add(redPawns[3],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueY(),
                10, 10);
        redPawn[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueY());
        redPawn[3].setActualPositionIndex(Integer.parseInt(fileList.get(4)));

        grid.add(greenPawns[0],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueY(),
                10, 10);
        greenPawn[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueY());
        greenPawn[0].setActualPositionIndex(Integer.parseInt(fileList.get(5)));

        grid.add(greenPawns[1],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueY(),
                10, 10);
        greenPawn[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueY());
        greenPawn[1].setActualPositionIndex(Integer.parseInt(fileList.get(6)));

        grid.add(greenPawns[2],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueY(),
                10, 10);
        greenPawn[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueY());
        greenPawn[2].setActualPositionIndex(Integer.parseInt(fileList.get(7)));

        grid.add(greenPawns[3],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueY(),
                10, 10);
        greenPawn[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueY());
        greenPawn[3].setActualPositionIndex(Integer.parseInt(fileList.get(8)));

        grid.add(yellowPawns[0],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueY(),
                10, 10);
        yellowPawn[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueY());
        yellowPawn[0].setActualPositionIndex(Integer.parseInt(fileList.get(9)));

        grid.add(yellowPawns[1],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueY(),
                10, 10);
        yellowPawn[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueY());
        yellowPawn[1].setActualPositionIndex(Integer.parseInt(fileList.get(10)));

        grid.add(yellowPawns[2],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueY(),
                10, 10);
        yellowPawn[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueY());
        yellowPawn[2].setActualPositionIndex(Integer.parseInt(fileList.get(11)));

        grid.add(yellowPawns[3],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueY(),
                10, 10);
        yellowPawn[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueY());
        yellowPawn[3].setActualPositionIndex(Integer.parseInt(fileList.get(12)));

        grid.add(bluePawns[0],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueY(),
                10, 10);
        bluePawn[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueY());
        bluePawn[0].setActualPositionIndex(Integer.parseInt(fileList.get(13)));

        grid.add(bluePawns[1],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueY(),
                10, 10);
        bluePawn[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueY());
        bluePawn[1].setActualPositionIndex(Integer.parseInt(fileList.get(14)));

        grid.add(bluePawns[2],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueY(),
                10, 10);
        bluePawn[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueY());
        bluePawn[2].setActualPositionIndex(Integer.parseInt(fileList.get(15)));

        grid.add(bluePawns[3],
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueY(),
                10, 10);
        bluePawn[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueY());
        bluePawn[3].setActualPositionIndex(Integer.parseInt(fileList.get(16)));

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
