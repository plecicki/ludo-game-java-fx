package com.kodilla.ludogame.savingToFile;

import com.kodilla.ludogame.constants.CheckBoxes;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import javafx.scene.control.CheckBox;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

    public void saveGame(Red[] redP, Green[] greenP, Yellow[] yellowP, Blue[] blueP,
                         ThrowDice throwDice, OnClickPawn onClickPawn,
                         DiceButton diceButtonObject, CheckBox checkBox1,
                         CheckBox checkBox2, CheckBox checkBox3, CheckBox checkBox4)
            throws IOException {
        String writeToFile = "1\n";
        writeToFile += redP[0].getActualPositionIndex() + "\n";
        writeToFile += redP[1].getActualPositionIndex() + "\n";
        writeToFile += redP[2].getActualPositionIndex() + "\n";
        writeToFile += redP[3].getActualPositionIndex() + "\n";
        writeToFile += greenP[0].getActualPositionIndex() + "\n";
        writeToFile += greenP[1].getActualPositionIndex() + "\n";
        writeToFile += greenP[2].getActualPositionIndex() + "\n";
        writeToFile += greenP[3].getActualPositionIndex() + "\n";
        writeToFile += yellowP[0].getActualPositionIndex() + "\n";
        writeToFile += yellowP[1].getActualPositionIndex() + "\n";
        writeToFile += yellowP[2].getActualPositionIndex() + "\n";
        writeToFile += yellowP[3].getActualPositionIndex() + "\n";
        writeToFile += blueP[0].getActualPositionIndex() + "\n";
        writeToFile += blueP[1].getActualPositionIndex() + "\n";
        writeToFile += blueP[2].getActualPositionIndex() + "\n";
        writeToFile += blueP[3].getActualPositionIndex() + "\n";
        writeToFile += throwDice.getDiceIndex() + "\n";
        writeToFile += onClickPawn.getWhoseTurn() + "\n";
        if (diceButtonObject.isAvailable()) {
            writeToFile += "2\n";
        } else {
            writeToFile += "1\n";
        }
        writeToFile += onClickPawn.getWhoseTurn() + "\n";
        if (checkBox1.isSelected()) {
            writeToFile += "1\n";
        } else {
            writeToFile += "0\n";
        }
        if (checkBox2.isSelected()) {
            writeToFile += "1\n";
        } else {
            writeToFile += "0\n";
        }
        if (checkBox3.isSelected()) {
            writeToFile += "1\n";
        } else {
            writeToFile += "0\n";
        }
        if (checkBox4.isSelected()) {
            writeToFile += "1";
        } else {
            writeToFile += "0";
        }
        //System.out.println(writeToFile);

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
