package com.kodilla.ludogame.savingToFile;

import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import javafx.scene.control.CheckBox;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAndWriteFile {

    private int windowNavigation = 0;

    public ArrayList<String> getFileAsArrayList(String fileName)
    {
        ArrayList<String> savedLines = new ArrayList<String>();
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                savedLines.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {

        }
        return savedLines;
    }

    public void saveGame(RedPawn[] redPawn, GreenPawn[] greenPawn, YellowPawn[] yellowPawn, BluePawn[] bluePawn,
                         ThrowDice throwDice, OnClickPawn onClickPawn,
                         DiceButton diceButtonObject, CheckBox checkBox1,
                         CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4)
            throws IOException {
        String writeToFile = "1\n";
        writeToFile += redPawn[0].getActualPositionIndex() + "\n"; //1
        writeToFile += redPawn[1].getActualPositionIndex() + "\n"; //2
        writeToFile += redPawn[2].getActualPositionIndex() + "\n"; //3
        writeToFile += redPawn[3].getActualPositionIndex() + "\n"; //4
        writeToFile += greenPawn[0].getActualPositionIndex() + "\n"; //5
        writeToFile += greenPawn[1].getActualPositionIndex() + "\n"; //6
        writeToFile += greenPawn[2].getActualPositionIndex() + "\n"; //7
        writeToFile += greenPawn[3].getActualPositionIndex() + "\n"; //8
        writeToFile += yellowPawn[0].getActualPositionIndex() + "\n"; //9
        writeToFile += yellowPawn[1].getActualPositionIndex() + "\n"; //10
        writeToFile += yellowPawn[2].getActualPositionIndex() + "\n"; //11
        writeToFile += yellowPawn[3].getActualPositionIndex() + "\n"; //12
        writeToFile += bluePawn[0].getActualPositionIndex() + "\n"; //13
        writeToFile += bluePawn[1].getActualPositionIndex() + "\n"; //14
        writeToFile += bluePawn[2].getActualPositionIndex() + "\n"; //15
        writeToFile += bluePawn[3].getActualPositionIndex() + "\n"; //16
        writeToFile += throwDice.getDiceIndex() + "\n"; //17
        writeToFile += onClickPawn.getWhoseTurn() + "\n"; //18
        if (diceButtonObject.isAvailable()) {
            writeToFile += "2\n"; //19
        } else {
            writeToFile += "1\n"; //19
        }
        writeToFile += onClickPawn.getWhoseTurn() + "\n"; //20
        if (checkBox1.isSelected()) {
            writeToFile += "1\n"; //21
        } else {
            writeToFile += "0\n"; //21
        }
        if (checkBox2.isSelected()) {
            writeToFile += "1\n"; //22
        } else {
            writeToFile += "0\n"; //22
        }
        if (checkBox3.isSelected()) {
            writeToFile += "1\n"; //23
        } else {
            writeToFile += "0\n"; //23
        }
        if (checkBox4.isSelected()) {
            writeToFile += "1\n"; //24
        } else {
            writeToFile += "0\n"; //24
        }
        if (diceButtonObject.isWasClicked()) {
            writeToFile += "1\n"; //24
        } else {
            writeToFile += "0\n"; //24
        }

        PrintWriter printWriter = new PrintWriter("save.txt");
        printWriter.print(writeToFile);
        printWriter.close();
    }

    public void finishGame()
            throws IOException {
        String writeToFile = "0\n";

        PrintWriter printWriter = new PrintWriter("save.txt");
        printWriter.print(writeToFile);
        printWriter.close();
    }

    public int getWindowNavigation() {
        return windowNavigation;
    }

    public void setWindowNavigation(int windowNavigation) {
        this.windowNavigation = windowNavigation;
    }
}
