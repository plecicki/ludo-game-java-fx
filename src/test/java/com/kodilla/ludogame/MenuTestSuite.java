package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Buttons;
import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import com.kodilla.ludogame.savingToFile.ReadAndWriteFile;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MenuTestSuite {

    private Red[] redP;
    private Green[] greenP;
    private Yellow[] yellowP;
    private Blue[] blueP;

    @DisplayName("Checking, if red pawns position are correctly read")
    @Test
    void redPawnsPositionsFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        redP[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueY());
        redP[0].setActualPositionIndex(Integer.parseInt(fileList.get(1)));
        redP[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueY());
        redP[1].setActualPositionIndex(Integer.parseInt(fileList.get(2)));
        redP[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueY());
        redP[2].setActualPositionIndex(Integer.parseInt(fileList.get(3)));
        redP[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueY());
        redP[3].setActualPositionIndex(Integer.parseInt(fileList.get(4)));

        //Then
        Assertions.assertEquals(0, redP[0].getActualPositionIndex());
        Assertions.assertEquals(1, redP[1].getActualPositionIndex());
        Assertions.assertEquals(2, redP[2].getActualPositionIndex());
        Assertions.assertEquals(20, redP[3].getActualPositionIndex());
    }

    @DisplayName("Checking, if green pawns position are correctly read")
    @Test
    void greenPawnsPositionsFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        greenP[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueY());
        greenP[0].setActualPositionIndex(Integer.parseInt(fileList.get(5)));
        greenP[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueY());
        greenP[1].setActualPositionIndex(Integer.parseInt(fileList.get(6)));
        greenP[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueY());
        greenP[2].setActualPositionIndex(Integer.parseInt(fileList.get(7)));
        greenP[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueY());
        greenP[3].setActualPositionIndex(Integer.parseInt(fileList.get(8)));

        //Then
        Assertions.assertEquals(80, greenP[0].getActualPositionIndex());
        Assertions.assertEquals(5, greenP[1].getActualPositionIndex());
        Assertions.assertEquals(6, greenP[2].getActualPositionIndex());
        Assertions.assertEquals(7, greenP[3].getActualPositionIndex());
    }

    @DisplayName("Checking, if yellow pawns position are correctly read")
    @Test
    void yellowPawnsPositionsFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        yellowP[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueY());
        yellowP[0].setActualPositionIndex(Integer.parseInt(fileList.get(9)));
        yellowP[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueY());
        yellowP[1].setActualPositionIndex(Integer.parseInt(fileList.get(10)));
        yellowP[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueY());
        yellowP[2].setActualPositionIndex(Integer.parseInt(fileList.get(11)));
        yellowP[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueY());
        yellowP[3].setActualPositionIndex(Integer.parseInt(fileList.get(12)));

        //Then
        Assertions.assertEquals(8, yellowP[0].getActualPositionIndex());
        Assertions.assertEquals(40, yellowP[1].getActualPositionIndex());
        Assertions.assertEquals(10, yellowP[2].getActualPositionIndex());
        Assertions.assertEquals(69, yellowP[3].getActualPositionIndex());
    }

    @DisplayName("Checking, if blue pawns position are correctly read")
    @Test
    void bluePawnsPositionsFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        blueP[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueY());
        blueP[0].setActualPositionIndex(Integer.parseInt(fileList.get(13)));
        blueP[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueY());
        blueP[1].setActualPositionIndex(Integer.parseInt(fileList.get(14)));
        blueP[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueY());
        blueP[2].setActualPositionIndex(Integer.parseInt(fileList.get(15)));
        blueP[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueY());
        blueP[3].setActualPositionIndex(Integer.parseInt(fileList.get(16)));

        //Then
        Assertions.assertEquals(60, blueP[0].getActualPositionIndex());
        Assertions.assertEquals(13, blueP[1].getActualPositionIndex());
        Assertions.assertEquals(14, blueP[2].getActualPositionIndex());
        Assertions.assertEquals(15, blueP[3].getActualPositionIndex());
    }

    @DisplayName("Checking, if dice status is correctly read")
    @Test
    void diceStatusFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        ThrowDice throwDice = new ThrowDice();
        throwDice.setDiceIndex(Integer.parseInt(fileList.get(17)));

        //Then
        Assertions.assertEquals(5, throwDice.getDiceIndex());
    }

    @DisplayName("Checking, if whose turn (turn label) is correctly read")
    @Test
    void whoseTurnLabelFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        OnClickPawn onClickPawn = new OnClickPawn();
        onClickPawn.setWhoseTurn(Integer.parseInt(fileList.get(18)));

        //Then
        Assertions.assertEquals(3, onClickPawn.getWhoseTurn());
    }

    @DisplayName("Checking, if dice button (information label) is correctly read")
    @Test
    void infoLabelFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        DiceButton diceButtonObject = new DiceButton();
        if (Integer.parseInt(fileList.get(19)) == 2) {
            diceButtonObject.setAvailable(true);
        } else if (Integer.parseInt(fileList.get(19)) == 1) {
            diceButtonObject.setAvailable(false);
        }

        //Then
        Assertions.assertFalse(diceButtonObject.isAvailable());
    }

    @DisplayName("Checking, if whose turn is correctly read")
    @Test
    void whoseTurnFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        OnClickPawn onClickPawn = new OnClickPawn();
        onClickPawn.setWhoseTurn(Integer.parseInt(fileList.get(20)));

        //Then
        Assertions.assertEquals(3, onClickPawn.getWhoseTurn());
    }

    @DisplayName("Checking, if 'dice button clicked' is correctly read")
    @Test
    void diceButtonClickedFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        DiceButton diceButtonObject = new DiceButton();
        if (fileList.get(25).charAt(0) == '1') {
            diceButtonObject.setWasClicked(true);
        }

        //Then
        Assertions.assertFalse(diceButtonObject.isWasClicked());
    }

    void writeSaveOfExamplePartOfGame() {
        String exampleSaveText = "1\n0\n1\n2\n20\n80\n5\n6\n7\n8\n40\n10\n" +
                "69\n60\n13\n14\n15\n5\n3\n1\n3\n1\n0\n1\n0\n0\n";
        try {
            PrintWriter printWriter = new PrintWriter("save.txt");
            printWriter.print(exampleSaveText);
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error with availability to file");
        }
    }

    void fillingTablesWithPawns() {
        Red[] reds = {new Red(), new Red(), new Red(), new Red()};
        Green[] greens = {new Green(), new Green(), new Green(), new Green()};
        Yellow[] yellows = {new Yellow(), new Yellow(), new Yellow(), new Yellow()};
        Blue[] blues = {new Blue(), new Blue(), new Blue(), new Blue()};

        redP = reds;
        greenP = greens;
        yellowP = yellows;
        blueP = blues;
    }
}
