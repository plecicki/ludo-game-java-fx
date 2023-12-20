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

    public void saveGame(RedPawn[] redPawnArray, GreenPawn[] greenPawnArray,
                         YellowPawn[] yellowPawnArray, BluePawn[] bluePawnArray,
                         ThrowDice throwDice, OnClickPawn onClickPawn,
                         DiceButton diceButtonObject, CheckBox checkBox1,
                         CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4)
            throws IOException {
        StringBuilder writeToFile = new StringBuilder("1\n");
        for (RedPawn redPawn : redPawnArray) {
            writeToFile.append(redPawn.getActualPositionIndex()).append("\n"); //1-4
        }
        for (GreenPawn greenPawn : greenPawnArray) {
            writeToFile.append(greenPawn.getActualPositionIndex()).append("\n"); //5-8
        }
        for (YellowPawn yellowPawn : yellowPawnArray) {
            writeToFile.append(yellowPawn.getActualPositionIndex()).append("\n"); //9-12
        }
        for (BluePawn bluePawn : bluePawnArray) {
            writeToFile.append(bluePawn.getActualPositionIndex()).append("\n"); //13-16
        }
        writeToFile.append(throwDice.getDiceIndex()).append("\n"); //17
        writeToFile.append(onClickPawn.getWhoseTurn()).append("\n"); //18
        if (diceButtonObject.isAvailable()) {
            writeToFile.append("2\n"); //19
        } else {
            writeToFile.append("1\n"); //19
        }
        writeToFile.append(onClickPawn.getWhoseTurn()).append("\n"); //20
        if (checkBox1.isSelected()) {
            writeToFile.append("1\n"); //21
        } else {
            writeToFile.append("0\n"); //21
        }
        if (checkBox2.isSelected()) {
            writeToFile.append("1\n"); //22
        } else {
            writeToFile.append("0\n"); //22
        }
        if (checkBox3.isSelected()) {
            writeToFile.append("1\n"); //23
        } else {
            writeToFile.append("0\n"); //23
        }
        if (checkBox4.isSelected()) {
            writeToFile.append("1\n"); //24
        } else {
            writeToFile.append("0\n"); //24
        }
        if (diceButtonObject.isWasClicked()) {
            writeToFile.append("1\n"); //24
        } else {
            writeToFile.append("0\n"); //24
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
