package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.lastpanel.Ranking;
import com.kodilla.ludogame.pawns.*;
import com.kodilla.ludogame.savingToFile.ReadAndWriteFile;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FinishGameTestSuite {

    private Red[] redP;
    private Green[] greenP;
    private Yellow[] yellowP;
    private Blue[] blueP;
    private static int testCount = 0;

    @AfterEach
    public void afterEach() {
        this.testCount++;
        System.out.println("Test nr. " + testCount + ": end");
    }

    @DisplayName("Red pawn should change position" +
            "from 71 to 72 when drawn number is 1")
    @Test
    void redPawnsShouldChangePositionAfterDrawingOne() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(72, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red pawn should change position" +
            "from 71 to 72 when drawn number is 3")
    @Test
    void redPawnsShouldChangePositionAfterDrawingTwo() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(73, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red pawn should change position" +
            "from 71 to 72 when drawn number is 3")
    @Test
    void redPawnsShouldChangePositionAfterDrawingThree() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(74, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red pawn should change position" +
            "from 71 to 72 when drawn number is 4")
    @Test
    void redPawnsShouldChangePositionAfterDrawingFore() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(75, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red pawn should change position" +
            "from 71 to 72 when drawn number is 5")
    @Test
    void redPawnsShouldChangePositionAfterDrawingFive() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(76, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red pawn should change position" +
            "from 71 to 75 when drawn number is 6")
    @Test
    void redPawnsShouldChangePositionAfterDrawingSix() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(75, redP[0].getActualPositionIndex());
    }

    @DisplayName("Green pawn should change position" +
            "from 29 to 77 when drawn number is 1")
    @Test
    void greenPawnsShouldChangePositionAfterDrawingOne() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(77, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green pawn should change position" +
            "from 29 to 78 when drawn number is 2")
    @Test
    void greenPawnsShouldChangePositionAfterDrawingTwo() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(78, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green pawn should change position" +
            "from 29 to 79 when drawn number is 3")
    @Test
    void greenPawnsShouldChangePositionAfterDrawingThree() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(79, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green pawn should change position" +
            "from 29 to 80 when drawn number is 4")
    @Test
    void greenPawnsShouldChangePositionAfterDrawingFore() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(80, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green pawn should change position" +
            "from 29 to 80 when drawn number is 5")
    @Test
    void greenPawnsShouldChangePositionAfterDrawingFive() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(81, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green pawn should change position" +
            "from 29 to 80 when drawn number is 6")
    @Test
    void greenPawnsShouldChangePositionAfterDrawingSix() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(80, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow pawn should change position" +
            "from 57 to 82 when drawn number is 1")
    @Test
    void yellowPawnsShouldChangePositionAfterDrawingOne() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(82, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow pawn should change position" +
                        "from 57 to 83 when drawn number is 2")
    @Test
    void yellowPawnsShouldChangePositionAfterDrawingTwo() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(83, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow pawn should change position" +
            "from 57 to 84 when drawn number is 3")
    @Test
    void yellowPawnsShouldChangePositionAfterDrawingThree() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(84, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow pawn should change position" +
            "from 57 to 85 when drawn number is 4")
    @Test
    void yellowPawnsShouldChangePositionAfterDrawingFore() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(85, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow pawn should change position" +
            "from 57 to 86 when drawn number is 5")
    @Test
    void yellowPawnsShouldChangePositionAfterDrawingFive() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(86, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow pawn should change position" +
            "from 57 to 85 when drawn number is 6")
    @Test
    void yellowPawnsShouldChangePositionAfterDrawingSix() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(85, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Blue pawn should change position" +
            "from 43 to 87 when drawn number is 1")
    @Test
    void bluePawnsShouldChangePositionAfterDrawingOne() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(87, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue pawn should change position" +
            "from 43 to 88 when drawn number is 2")
    @Test
    void bluePawnsShouldChangePositionAfterDrawingTwo() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(88, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue pawn should change position" +
            "from 43 to 89 when drawn number is 3")
    @Test
    void bluePawnsShouldChangePositionAfterDrawingThree() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(89, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue pawn should change position" +
            "from 43 to 90 when drawn number is 4")
    @Test
    void bluePawnsShouldChangePositionAfterDrawingFore() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(90, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue pawn should change position" +
            "from 43 to 91 when drawn number is 5")
    @Test
    void bluePawnsShouldChangePositionAfterDrawingFive() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(91, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue pawn should change position" +
            "from 43 to 90 when drawn number is 6")
    @Test
    void bluePawnsShouldChangePositionAfterDrawingSix() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(90, blueP[0].getActualPositionIndex());
    }

    @DisplayName("After finishing the game the ranking" +
            "should be ready to display")
    @Test
    void creatingFinishRanking() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();
        ArrayList<String> rank = new ArrayList<>();
        Stage stage = null;
        Ranking ranking = new Ranking(rank, stage);
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        //When
        throwDice.setDiceIndex(4);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        try {
            for (int i=0; i<4; i++) {
                ranking.checkIfRedWon(redP, i, readAndWriteFile);
                ranking.checkIfGreenWon(greenP, i, readAndWriteFile);
                ranking.checkIfYellowWon(yellowP, i, readAndWriteFile);
                ranking.checkIfBlueWon(blueP, i, readAndWriteFile);
            }
        } catch (ExceptionInInitializerError e) {
            System.out.println("In this moment new window with ranking is opened");
        }

        List<String> rankingPlayers = ranking.getPlayersRanking();

        //Then
        Assertions.assertEquals("RED", rankingPlayers.get(0));
        Assertions.assertEquals("GREEN", rankingPlayers.get(1));
        Assertions.assertEquals("YELLOW", rankingPlayers.get(2));
        Assertions.assertEquals("BLUE", rankingPlayers.get(3));
    }

    private void setPawnsAtPositions() {
        Red[] reds = {new Red(), new Red(), new Red(), new Red()};
        Green[] greens = {new Green(), new Green(), new Green(), new Green()};
        Yellow[] yellows = {new Yellow(), new Yellow(), new Yellow(), new Yellow()};
        Blue[] blues = {new Blue(), new Blue(), new Blue(), new Blue()};

        redP = reds;
        greenP = greens;
        yellowP = yellows;
        blueP = blues;

        redP[0].setActualPosition(new Constants().constantPawnPositions().get(71).getValueX(),
                new Constants().constantPawnPositions().get(71).getValueY());
        redP[0].setActualPositionIndex(71);
        redP[1].setActualPosition(new Constants().constantPawnPositions().get(72).getValueX(),
                new Constants().constantPawnPositions().get(52).getValueY());
        redP[1].setActualPositionIndex(72);
        redP[2].setActualPosition(new Constants().constantPawnPositions().get(73).getValueX(),
                new Constants().constantPawnPositions().get(73).getValueY());
        redP[2].setActualPositionIndex(73);
        redP[3].setActualPosition(new Constants().constantPawnPositions().get(74).getValueX(),
                new Constants().constantPawnPositions().get(74).getValueY());
        redP[3].setActualPositionIndex(74);

        greenP[0].setActualPosition(new Constants().constantPawnPositions().get(29).getValueX(),
                new Constants().constantPawnPositions().get(29).getValueY());
        greenP[0].setActualPositionIndex(29);
        greenP[1].setActualPosition(new Constants().constantPawnPositions().get(77).getValueX(),
                new Constants().constantPawnPositions().get(77).getValueY());
        greenP[1].setActualPositionIndex(77);
        greenP[2].setActualPosition(new Constants().constantPawnPositions().get(78).getValueX(),
                new Constants().constantPawnPositions().get(78).getValueY());
        greenP[2].setActualPositionIndex(78);
        greenP[3].setActualPosition(new Constants().constantPawnPositions().get(79).getValueX(),
                new Constants().constantPawnPositions().get(79).getValueY());
        greenP[3].setActualPositionIndex(79);

        yellowP[0].setActualPosition(new Constants().constantPawnPositions().get(57).getValueX(),
                new Constants().constantPawnPositions().get(57).getValueY());
        yellowP[0].setActualPositionIndex(57);
        yellowP[1].setActualPosition(new Constants().constantPawnPositions().get(82).getValueX(),
                new Constants().constantPawnPositions().get(82).getValueY());
        yellowP[1].setActualPositionIndex(82);
        yellowP[2].setActualPosition(new Constants().constantPawnPositions().get(83).getValueX(),
                new Constants().constantPawnPositions().get(83).getValueY());
        yellowP[2].setActualPositionIndex(83);
        yellowP[3].setActualPosition(new Constants().constantPawnPositions().get(84).getValueX(),
                new Constants().constantPawnPositions().get(84).getValueY());
        yellowP[3].setActualPositionIndex(84);

        blueP[0].setActualPosition(new Constants().constantPawnPositions().get(43).getValueX(),
                new Constants().constantPawnPositions().get(43).getValueY());
        blueP[0].setActualPositionIndex(43);
        blueP[1].setActualPosition(new Constants().constantPawnPositions().get(87).getValueX(),
                new Constants().constantPawnPositions().get(87).getValueY());
        blueP[1].setActualPositionIndex(87);
        blueP[2].setActualPosition(new Constants().constantPawnPositions().get(88).getValueX(),
                new Constants().constantPawnPositions().get(88).getValueY());
        blueP[2].setActualPositionIndex(88);
        blueP[3].setActualPosition(new Constants().constantPawnPositions().get(89).getValueX(),
                new Constants().constantPawnPositions().get(89).getValueY());
        blueP[3].setActualPositionIndex(89);
    }
}
