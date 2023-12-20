package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import com.kodilla.ludogame.savingToFile.ReadAndWriteFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MenuTestSuite {

    private RedPawn[] redPawn;
    private GreenPawn[] greenPawn;
    private YellowPawn[] yellowPawn;
    private BluePawn[] bluePawn;

    @DisplayName("Checking, if red pawns position are correctly read")
    @Test
    void redPawnsPositionsFromFileTest() {
        //Given
        writeSaveOfExamplePartOfGame();
        fillingTablesWithPawns();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> fileList = readAndWriteFile.getFileAsArrayList("save.txt");

        //When
        redPawn[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(1))).getValueY());
        redPawn[0].setActualPositionIndex(Integer.parseInt(fileList.get(1)));
        redPawn[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(2))).getValueY());
        redPawn[1].setActualPositionIndex(Integer.parseInt(fileList.get(2)));
        redPawn[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(3))).getValueY());
        redPawn[2].setActualPositionIndex(Integer.parseInt(fileList.get(3)));
        redPawn[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(4))).getValueY());
        redPawn[3].setActualPositionIndex(Integer.parseInt(fileList.get(4)));

        //Then
        Assertions.assertEquals(0, redPawn[0].getActualPositionIndex());
        Assertions.assertEquals(1, redPawn[1].getActualPositionIndex());
        Assertions.assertEquals(2, redPawn[2].getActualPositionIndex());
        Assertions.assertEquals(20, redPawn[3].getActualPositionIndex());
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
        greenPawn[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(5))).getValueY());
        greenPawn[0].setActualPositionIndex(Integer.parseInt(fileList.get(5)));
        greenPawn[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(6))).getValueY());
        greenPawn[1].setActualPositionIndex(Integer.parseInt(fileList.get(6)));
        greenPawn[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(7))).getValueY());
        greenPawn[2].setActualPositionIndex(Integer.parseInt(fileList.get(7)));
        greenPawn[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(8))).getValueY());
        greenPawn[3].setActualPositionIndex(Integer.parseInt(fileList.get(8)));

        //Then
        Assertions.assertEquals(80, greenPawn[0].getActualPositionIndex());
        Assertions.assertEquals(5, greenPawn[1].getActualPositionIndex());
        Assertions.assertEquals(6, greenPawn[2].getActualPositionIndex());
        Assertions.assertEquals(7, greenPawn[3].getActualPositionIndex());
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
        yellowPawn[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(9))).getValueY());
        yellowPawn[0].setActualPositionIndex(Integer.parseInt(fileList.get(9)));
        yellowPawn[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(10))).getValueY());
        yellowPawn[1].setActualPositionIndex(Integer.parseInt(fileList.get(10)));
        yellowPawn[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(11))).getValueY());
        yellowPawn[2].setActualPositionIndex(Integer.parseInt(fileList.get(11)));
        yellowPawn[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(12))).getValueY());
        yellowPawn[3].setActualPositionIndex(Integer.parseInt(fileList.get(12)));

        //Then
        Assertions.assertEquals(8, yellowPawn[0].getActualPositionIndex());
        Assertions.assertEquals(40, yellowPawn[1].getActualPositionIndex());
        Assertions.assertEquals(10, yellowPawn[2].getActualPositionIndex());
        Assertions.assertEquals(69, yellowPawn[3].getActualPositionIndex());
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
        bluePawn[0].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(13))).getValueY());
        bluePawn[0].setActualPositionIndex(Integer.parseInt(fileList.get(13)));
        bluePawn[1].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(14))).getValueY());
        bluePawn[1].setActualPositionIndex(Integer.parseInt(fileList.get(14)));
        bluePawn[2].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(15))).getValueY());
        bluePawn[2].setActualPositionIndex(Integer.parseInt(fileList.get(15)));
        bluePawn[3].setActualPosition(
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueX(),
                new Constants().constantPawnPositions().get(Integer.parseInt(fileList.get(16))).getValueY());
        bluePawn[3].setActualPositionIndex(Integer.parseInt(fileList.get(16)));

        //Then
        Assertions.assertEquals(60, bluePawn[0].getActualPositionIndex());
        Assertions.assertEquals(13, bluePawn[1].getActualPositionIndex());
        Assertions.assertEquals(14, bluePawn[2].getActualPositionIndex());
        Assertions.assertEquals(15, bluePawn[3].getActualPositionIndex());
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
        RedPawn[] redPawns = {new RedPawn(), new RedPawn(), new RedPawn(), new RedPawn()};
        GreenPawn[] greenPawns = {new GreenPawn(), new GreenPawn(), new GreenPawn(), new GreenPawn()};
        YellowPawn[] yellowPawns = {new YellowPawn(), new YellowPawn(), new YellowPawn(), new YellowPawn()};
        BluePawn[] bluePawns = {new BluePawn(), new BluePawn(), new BluePawn(), new BluePawn()};

        redPawn = redPawns;
        greenPawn = greenPawns;
        yellowPawn = yellowPawns;
        bluePawn = bluePawns;
    }
}
