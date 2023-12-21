package com.kodilla.ludogame.savingToFile;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.constants.Labels;
import com.kodilla.ludogame.constants.PawnPosition;
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

import static java.lang.Integer.*;

public class StartGame {

    private final ArrayList<PawnPosition> PAWN_POSITIONS = Constants.PAWN_POSITIONS;

    private void setPawnStartPositionParameters(GridPane grid, Pawn pawn, ImageView imageViewPawn,
        int positionValueX, int positionValueY, int positionIndex) {
        grid.add(imageViewPawn, positionValueX, positionValueY, 10, 10);
        pawn.setActualPosition(positionValueX, positionValueY);
        pawn.setActualPositionIndex(positionIndex);
    }

    public void setStartParameters(GridPane grid, RedPawn[] redPawn, GreenPawn[] greenPawn, YellowPawn[] yellowPawn, BluePawn[] bluePawn,
                                   ImageView[] redPawns, ImageView[] greenPawns,
                                   ImageView[] yellowPawns, ImageView[] bluePawns,
                                   DiceImage diceImage, TurnLabels turnLabels,
                                   OnClickPawn onClickPawn) {
        for (int i = 0; i <= 3; i++) {
            setPawnsStartPositionParameters(grid, redPawn, greenPawn, yellowPawn, bluePawn, redPawns, greenPawns, yellowPawns, bluePawns, i);
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

    private void setPawnsStartPositionParameters(GridPane grid, RedPawn[] redPawn, GreenPawn[] greenPawn, YellowPawn[] yellowPawn, BluePawn[] bluePawn, ImageView[] redPawns, ImageView[] greenPawns, ImageView[] yellowPawns, ImageView[] bluePawns, int i) {
        setPawnStartPositionParameters(grid, redPawn[i], redPawns[i],
                PAWN_POSITIONS.get(i).getValueX(),
                PAWN_POSITIONS.get(i).getValueY(), i);
        setPawnStartPositionParameters(grid, greenPawn[i], greenPawns[i],
                PAWN_POSITIONS.get(i +4).getValueX(),
                PAWN_POSITIONS.get(i +4).getValueY(), i +4);
        setPawnStartPositionParameters(grid, yellowPawn[i], yellowPawns[i],
                PAWN_POSITIONS.get(i +8).getValueX(),
                PAWN_POSITIONS.get(i +8).getValueY(), i +8);
        setPawnStartPositionParameters(grid, bluePawn[i], bluePawns[i],
                PAWN_POSITIONS.get(i +12).getValueX(),
                PAWN_POSITIONS.get(i +12).getValueY(), i +12);
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
                PAWN_POSITIONS.get(parseInt(fileList.get(1))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(1))).getValueY(),
                10, 10);
        redPawn[0].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(1))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(1))).getValueY());
        redPawn[0].setActualPositionIndex(parseInt(fileList.get(1)));

        grid.add(redPawns[1],
                PAWN_POSITIONS.get(parseInt(fileList.get(2))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(2))).getValueY(),
                10, 10);
        redPawn[1].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(2))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(2))).getValueY());
        redPawn[1].setActualPositionIndex(parseInt(fileList.get(2)));

        grid.add(redPawns[2],
                PAWN_POSITIONS.get(parseInt(fileList.get(3))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(3))).getValueY(),
                10, 10);
        redPawn[2].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(3))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(3))).getValueY());
        redPawn[2].setActualPositionIndex(parseInt(fileList.get(3)));

        grid.add(redPawns[3],
                PAWN_POSITIONS.get(parseInt(fileList.get(4))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(4))).getValueY(),
                10, 10);
        redPawn[3].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(4))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(4))).getValueY());
        redPawn[3].setActualPositionIndex(parseInt(fileList.get(4)));

        grid.add(greenPawns[0],
                PAWN_POSITIONS.get(parseInt(fileList.get(5))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(5))).getValueY(),
                10, 10);
        greenPawn[0].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(5))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(5))).getValueY());
        greenPawn[0].setActualPositionIndex(parseInt(fileList.get(5)));

        grid.add(greenPawns[1],
                PAWN_POSITIONS.get(parseInt(fileList.get(6))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(6))).getValueY(),
                10, 10);
        greenPawn[1].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(6))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(6))).getValueY());
        greenPawn[1].setActualPositionIndex(parseInt(fileList.get(6)));

        grid.add(greenPawns[2],
                PAWN_POSITIONS.get(parseInt(fileList.get(7))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(7))).getValueY(),
                10, 10);
        greenPawn[2].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(7))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(7))).getValueY());
        greenPawn[2].setActualPositionIndex(parseInt(fileList.get(7)));

        grid.add(greenPawns[3],
                PAWN_POSITIONS.get(parseInt(fileList.get(8))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(8))).getValueY(),
                10, 10);
        greenPawn[3].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(8))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(8))).getValueY());
        greenPawn[3].setActualPositionIndex(parseInt(fileList.get(8)));

        grid.add(yellowPawns[0],
                PAWN_POSITIONS.get(parseInt(fileList.get(9))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(9))).getValueY(),
                10, 10);
        yellowPawn[0].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(9))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(9))).getValueY());
        yellowPawn[0].setActualPositionIndex(parseInt(fileList.get(9)));

        grid.add(yellowPawns[1],
                PAWN_POSITIONS.get(parseInt(fileList.get(10))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(10))).getValueY(),
                10, 10);
        yellowPawn[1].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(10))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(10))).getValueY());
        yellowPawn[1].setActualPositionIndex(parseInt(fileList.get(10)));

        grid.add(yellowPawns[2],
                PAWN_POSITIONS.get(parseInt(fileList.get(11))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(11))).getValueY(),
                10, 10);
        yellowPawn[2].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(11))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(11))).getValueY());
        yellowPawn[2].setActualPositionIndex(parseInt(fileList.get(11)));

        grid.add(yellowPawns[3],
                PAWN_POSITIONS.get(parseInt(fileList.get(12))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(12))).getValueY(),
                10, 10);
        yellowPawn[3].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(12))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(12))).getValueY());
        yellowPawn[3].setActualPositionIndex(parseInt(fileList.get(12)));

        grid.add(bluePawns[0],
                PAWN_POSITIONS.get(parseInt(fileList.get(13))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(13))).getValueY(),
                10, 10);
        bluePawn[0].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(13))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(13))).getValueY());
        bluePawn[0].setActualPositionIndex(parseInt(fileList.get(13)));

        grid.add(bluePawns[1],
                PAWN_POSITIONS.get(parseInt(fileList.get(14))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(14))).getValueY(),
                10, 10);
        bluePawn[1].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(14))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(14))).getValueY());
        bluePawn[1].setActualPositionIndex(parseInt(fileList.get(14)));

        grid.add(bluePawns[2],
                PAWN_POSITIONS.get(parseInt(fileList.get(15))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(15))).getValueY(),
                10, 10);
        bluePawn[2].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(15))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(15))).getValueY());
        bluePawn[2].setActualPositionIndex(parseInt(fileList.get(15)));

        grid.add(bluePawns[3],
                PAWN_POSITIONS.get(parseInt(fileList.get(16))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(16))).getValueY(),
                10, 10);
        bluePawn[3].setActualPosition(
                PAWN_POSITIONS.get(parseInt(fileList.get(16))).getValueX(),
                PAWN_POSITIONS.get(parseInt(fileList.get(16))).getValueY());
        bluePawn[3].setActualPositionIndex(parseInt(fileList.get(16)));

        diceImage.startDiceImageMethod(parseInt(fileList.get(17)));
        throwDice.setDiceIndex(parseInt(fileList.get(17)));
        turnLabels.turnLabels(parseInt(fileList.get(18)));
        turnLabels.instructionLabels(parseInt(fileList.get(19)));
        onClickPawn.setWhoseTurn(parseInt(fileList.get(20)));
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
