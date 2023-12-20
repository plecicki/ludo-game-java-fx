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

    private RedPawn[] redPawn;
    private GreenPawn[] greenPawn;
    private YellowPawn[] yellowPawn;
    private BluePawn[] bluePawn;
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(72, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(73, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(74, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(75, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(76, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(75, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(77, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(78, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(79, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(80, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(81, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(80, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(82, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(83, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(84, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(85, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(86, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(85, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(87, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(88, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(89, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(90, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(91, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(90, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        try {
            for (int i=0; i<4; i++) {
                ranking.checkIfRedWon(redPawn, i, readAndWriteFile);
                ranking.checkIfGreenWon(greenPawn, i, readAndWriteFile);
                ranking.checkIfYellowWon(yellowPawn, i, readAndWriteFile);
                ranking.checkIfBlueWon(bluePawn, i, readAndWriteFile);
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
        RedPawn[] redPawns = {new RedPawn(), new RedPawn(), new RedPawn(), new RedPawn()};
        GreenPawn[] greenPawns = {new GreenPawn(), new GreenPawn(), new GreenPawn(), new GreenPawn()};
        YellowPawn[] yellowPawns = {new YellowPawn(), new YellowPawn(), new YellowPawn(), new YellowPawn()};
        BluePawn[] bluePawns = {new BluePawn(), new BluePawn(), new BluePawn(), new BluePawn()};

        redPawn = redPawns;
        greenPawn = greenPawns;
        yellowPawn = yellowPawns;
        bluePawn = bluePawns;

        redPawn[0].setActualPosition(new Constants().constantPawnPositions().get(71).getValueX(),
                new Constants().constantPawnPositions().get(71).getValueY());
        redPawn[0].setActualPositionIndex(71);
        redPawn[1].setActualPosition(new Constants().constantPawnPositions().get(72).getValueX(),
                new Constants().constantPawnPositions().get(52).getValueY());
        redPawn[1].setActualPositionIndex(72);
        redPawn[2].setActualPosition(new Constants().constantPawnPositions().get(73).getValueX(),
                new Constants().constantPawnPositions().get(73).getValueY());
        redPawn[2].setActualPositionIndex(73);
        redPawn[3].setActualPosition(new Constants().constantPawnPositions().get(74).getValueX(),
                new Constants().constantPawnPositions().get(74).getValueY());
        redPawn[3].setActualPositionIndex(74);

        greenPawn[0].setActualPosition(new Constants().constantPawnPositions().get(29).getValueX(),
                new Constants().constantPawnPositions().get(29).getValueY());
        greenPawn[0].setActualPositionIndex(29);
        greenPawn[1].setActualPosition(new Constants().constantPawnPositions().get(77).getValueX(),
                new Constants().constantPawnPositions().get(77).getValueY());
        greenPawn[1].setActualPositionIndex(77);
        greenPawn[2].setActualPosition(new Constants().constantPawnPositions().get(78).getValueX(),
                new Constants().constantPawnPositions().get(78).getValueY());
        greenPawn[2].setActualPositionIndex(78);
        greenPawn[3].setActualPosition(new Constants().constantPawnPositions().get(79).getValueX(),
                new Constants().constantPawnPositions().get(79).getValueY());
        greenPawn[3].setActualPositionIndex(79);

        yellowPawn[0].setActualPosition(new Constants().constantPawnPositions().get(57).getValueX(),
                new Constants().constantPawnPositions().get(57).getValueY());
        yellowPawn[0].setActualPositionIndex(57);
        yellowPawn[1].setActualPosition(new Constants().constantPawnPositions().get(82).getValueX(),
                new Constants().constantPawnPositions().get(82).getValueY());
        yellowPawn[1].setActualPositionIndex(82);
        yellowPawn[2].setActualPosition(new Constants().constantPawnPositions().get(83).getValueX(),
                new Constants().constantPawnPositions().get(83).getValueY());
        yellowPawn[2].setActualPositionIndex(83);
        yellowPawn[3].setActualPosition(new Constants().constantPawnPositions().get(84).getValueX(),
                new Constants().constantPawnPositions().get(84).getValueY());
        yellowPawn[3].setActualPositionIndex(84);

        bluePawn[0].setActualPosition(new Constants().constantPawnPositions().get(43).getValueX(),
                new Constants().constantPawnPositions().get(43).getValueY());
        bluePawn[0].setActualPositionIndex(43);
        bluePawn[1].setActualPosition(new Constants().constantPawnPositions().get(87).getValueX(),
                new Constants().constantPawnPositions().get(87).getValueY());
        bluePawn[1].setActualPositionIndex(87);
        bluePawn[2].setActualPosition(new Constants().constantPawnPositions().get(88).getValueX(),
                new Constants().constantPawnPositions().get(88).getValueY());
        bluePawn[2].setActualPositionIndex(88);
        bluePawn[3].setActualPosition(new Constants().constantPawnPositions().get(89).getValueX(),
                new Constants().constantPawnPositions().get(89).getValueY());
        bluePawn[3].setActualPositionIndex(89);
    }
}
