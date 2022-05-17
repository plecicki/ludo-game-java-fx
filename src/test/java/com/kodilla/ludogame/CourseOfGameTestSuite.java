package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseOfGameTestSuite {

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

    @DisplayName("Max value of drawn numbers should be less than or equal to 6 and"+
    " min value should be more than or equal to 1")
    @Test
    void drawnNumbersShouldTotalBetweenOneAndSix() {
        //Given
        ThrowDice throwDice = new ThrowDice();
        ArrayList<Integer> drawnNumbers = new ArrayList();
        int max = 0;
        int min = 0;
        //When
        for (int i=0; i<=99; i++) {
            throwDice.diceRandom();
            drawnNumbers.add(throwDice.getDiceIndex());
        }
        max = Collections.max(drawnNumbers);
        min = Collections.min(drawnNumbers);
        //Then
        Assertions.assertTrue(max <= 6);
        Assertions.assertTrue(min >= 1);
    }

    @DisplayName("Red [0] pawn's position should be changed"+
    " from 70 to 71 after throwing 1")
    @Test
    void red0ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(71, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red [0] pawn's position should be changed"+
            " from 70 to 72 after throwing 2")
    @Test
    void red0ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(72, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red [0] pawn's position should be changed"+
            " from 70 to 73 after throwing 3")
    @Test
    void red0ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(73, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red [0] pawn's position should be changed"+
            " from 70 to 74 after throwing 4")
    @Test
    void red0ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(74, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red [0] pawn's position should be changed"+
            " from 70 to 75 after throwing 5")
    @Test
    void red0ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(75, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red [0] pawn's position should be changed"+
            " from 70 to 76 after throwing 6")
    @Test
    void red0ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(76, redP[0].getActualPositionIndex());
    }

    @DisplayName("Red [1] pawn's position should be changed"+
            " from 52 to 53 after throwing 1")
    @Test
    void red1ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
        redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(53, redP[1].getActualPositionIndex());
    }

    @DisplayName("Red [1] pawn's position should be changed"+
            " from 52 to 54 after throwing 2")
    @Test
    void red1ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
        redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(54, redP[1].getActualPositionIndex());
    }

    @DisplayName("Red [1] pawn's position should be changed"+
            " from 52 to 55 after throwing 3")
    @Test
    void red1ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
        redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(55, redP[1].getActualPositionIndex());
    }

    @DisplayName("Red [1] pawn's position should be changed"+
            " from 52 to 56 after throwing 4")
    @Test
    void red1ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
        redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(56, redP[1].getActualPositionIndex());
    }

    @DisplayName("Red [1] pawn's position should be changed"+
            " from 52 to 57 after throwing 5")
    @Test
    void red1ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
        redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(57, redP[1].getActualPositionIndex());
    }

    @DisplayName("Red [1] pawn's position should be changed"+
            " from 52 to 58 after throwing 6")
    @Test
    void red1ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
        redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(58, redP[1].getActualPositionIndex());
    }

    @DisplayName("Red [2] pawn's position should be changed"+
            " from 33 to 34 after throwing 1")
    @Test
    void red2ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
        redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(34, redP[2].getActualPositionIndex());
    }

    @DisplayName("Red [2] pawn's position should be changed"+
            " from 33 to 35 after throwing 2")
    @Test
    void red2ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
        redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(35, redP[2].getActualPositionIndex());
    }

    @DisplayName("Red [2] pawn's position should be changed"+
            " from 33 to 36 after throwing 3")
    @Test
    void red2ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
        redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(36, redP[2].getActualPositionIndex());
    }

    @DisplayName("Red [2] pawn's position should be changed"+
            " from 33 to 37 after throwing 4")
    @Test
    void red2ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
        redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(37, redP[2].getActualPositionIndex());
    }

    @DisplayName("Red [2] pawn's position should be changed"+
            " from 33 to 38 after throwing 5")
    @Test
    void red2ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
        redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(38, redP[2].getActualPositionIndex());
    }

    @DisplayName("Red [2] pawn's position should be changed"+
            " from 33 to 38 after throwing 6")
    @Test
    void red2ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
        redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(39, redP[2].getActualPositionIndex());
    }

    @DisplayName("Red [3] pawn's position should be changed"+
            " from 22 to 23 after throwing 1")
    @Test
    void red3ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
        redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(23, redP[3].getActualPositionIndex());
    }

    @DisplayName("Red [3] pawn's position should be changed"+
            " from 22 to 24 after throwing 2")
    @Test
    void red3ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
        redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(24, redP[3].getActualPositionIndex());
    }

    @DisplayName("Red [3] pawn's position should be changed"+
            " from 22 to 25 after throwing 3")
    @Test
    void red3ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
        redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(25, redP[3].getActualPositionIndex());
    }

    @DisplayName("Red [3] pawn's position should be changed"+
            " from 22 to 26 after throwing 4")
    @Test
    void red3ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
        redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(26, redP[3].getActualPositionIndex());
    }

    @DisplayName("Red [3] pawn's position should be changed"+
            " from 22 to 27 after throwing 5")
    @Test
    void red3ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
        redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(27, redP[3].getActualPositionIndex());
    }

    @DisplayName("Red [3] pawn's position should be changed"+
            " from 22 to 28 after throwing 6")
    @Test
    void red3ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
        redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(28, redP[3].getActualPositionIndex());
    }

    @DisplayName("Green [0] pawn's position should be changed"+
            " from 28 to 29 after throwing 1")
    @Test
    void green0ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(29, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green [0] pawn's position should be changed"+
            " from 28 to 77 after throwing 2")
    @Test
    void green0ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(77, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green [0] pawn's position should be changed"+
            " from 28 to 78 after throwing 3")
    @Test
    void green0ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(78, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green [0] pawn's position should be changed"+
            " from 28 to 79 after throwing 4")
    @Test
    void green0ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(79, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green [0] pawn's position should be changed"+
            " from 28 to 80 after throwing 5")
    @Test
    void green0ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(80, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green [0] pawn's position should be changed"+
            " from 28 to 81 after throwing 6")
    @Test
    void green0ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(81, greenP[0].getActualPositionIndex());
    }

    @DisplayName("Green [1] pawn's position should be changed"+
            " from 66 to 67 after throwing 1")
    @Test
    void green1ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
        greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(67, greenP[1].getActualPositionIndex());
    }

    @DisplayName("Green [1] pawn's position should be changed"+
            " from 66 to 68 after throwing 2")
    @Test
    void green1ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
        greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(68, greenP[1].getActualPositionIndex());
    }

    @DisplayName("Green [1] pawn's position should be changed"+
            " from 66 to 69 after throwing 3")
    @Test
    void green1ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
        greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(69, greenP[1].getActualPositionIndex());
    }

    @DisplayName("Green [1] pawn's position should be changed"+
            " from 66 to 70 after throwing 4")
    @Test
    void green1ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
        greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(70, greenP[1].getActualPositionIndex());
    }

    @DisplayName("Green [1] pawn's position should be changed"+
            " from 66 to 71 after throwing 5")
    @Test
    void green1ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
        greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(71, greenP[1].getActualPositionIndex());
    }

    @DisplayName("Green [1] pawn's position should be changed"+
            " from 66 to 16 after throwing 6")
    @Test
    void green1ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
        greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(16, greenP[1].getActualPositionIndex());
    }

    @DisplayName("Green [2] pawn's position should be changed"+
            " from 47 to 48 after throwing 1")
    @Test
    void green2ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
        greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(48, greenP[2].getActualPositionIndex());
    }

    @DisplayName("Green [2] pawn's position should be changed"+
            " from 47 to 49 after throwing 2")
    @Test
    void green2ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
        greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(49, greenP[2].getActualPositionIndex());
    }

    @DisplayName("Green [2] pawn's position should be changed"+
            " from 47 to 50 after throwing 3")
    @Test
    void green2ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
        greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(50, greenP[2].getActualPositionIndex());
    }

    @DisplayName("Green [2] pawn's position should be changed"+
            " from 47 to 51 after throwing 4")
    @Test
    void green2ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
        greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(51, greenP[2].getActualPositionIndex());
    }

    @DisplayName("Green [2] pawn's position should be changed"+
            " from 47 to 52 after throwing 5")
    @Test
    void green2ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
        greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(52, greenP[2].getActualPositionIndex());
    }

    @DisplayName("Green [2] pawn's position should be changed"+
            " from 47 to 52 after throwing 6")
    @Test
    void green2ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
        greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(53, greenP[2].getActualPositionIndex());
    }

    @DisplayName("Green [3] pawn's position should be changed"+
            " from 36 to 37 after throwing 1")
    @Test
    void green3ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
        greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(37, greenP[3].getActualPositionIndex());
    }

    @DisplayName("Green [3] pawn's position should be changed"+
            " from 36 to 38 after throwing 2")
    @Test
    void green3ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
        greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(38, greenP[3].getActualPositionIndex());
    }

    @DisplayName("Green [3] pawn's position should be changed"+
            " from 36 to 39 after throwing 3")
    @Test
    void green3ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
        greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(39, greenP[3].getActualPositionIndex());
    }

    @DisplayName("Green [3] pawn's position should be changed"+
            " from 36 to 40 after throwing 4")
    @Test
    void green3ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
        greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(40, greenP[3].getActualPositionIndex());
    }

    @DisplayName("Green [3] pawn's position should be changed"+
            " from 36 to 41 after throwing 5")
    @Test
    void green3ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
        greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(41, greenP[3].getActualPositionIndex());
    }

    @DisplayName("Green [3] pawn's position should be changed"+
            " from 36 to 42 after throwing 6")
    @Test
    void green3ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
        greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(42, greenP[3].getActualPositionIndex());
    }

    @DisplayName("Yellow [0] pawn's position should be changed"+
            " from 56 to 57 after throwing 1")
    @Test
    void yellow0ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(57, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow [0] pawn's position should be changed"+
            " from 56 to 82 after throwing 2")
    @Test
    void yellow0ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(82, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow [0] pawn's position should be changed"+
            " from 56 to 83 after throwing 3")
    @Test
    void yellow0ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(83, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow [0] pawn's position should be changed"+
            " from 56 to 84 after throwing 4")
    @Test
    void yellow0ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(84, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow [0] pawn's position should be changed"+
            " from 56 to 85 after throwing 5")
    @Test
    void yellow0ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(85, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow [0] pawn's position should be changed"+
            " from 56 to 86 after throwing 6")
    @Test
    void yellow0ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(86, yellowP[0].getActualPositionIndex());
    }

    @DisplayName("Yellow [1] pawn's position should be changed"+
            " from 24 to 25 after throwing 1")
    @Test
    void yellow1ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
        yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(25, yellowP[1].getActualPositionIndex());
    }

    @DisplayName("Yellow [1] pawn's position should be changed"+
            " from 24 to 26 after throwing 2")
    @Test
    void yellow1ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
        yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(26, yellowP[1].getActualPositionIndex());
    }

    @DisplayName("Yellow [1] pawn's position should be changed"+
            " from 24 to 27 after throwing 3")
    @Test
    void yellow1ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
        yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(27, yellowP[1].getActualPositionIndex());
    }

    @DisplayName("Yellow [1] pawn's position should be changed"+
            " from 24 to 28 after throwing 4")
    @Test
    void yellow1ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
        yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(28, yellowP[1].getActualPositionIndex());
    }

    @DisplayName("Yellow [1] pawn's position should be changed"+
            " from 24 to 29 after throwing 5")
    @Test
    void yellow1ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
        yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(29, yellowP[1].getActualPositionIndex());
    }

    @DisplayName("Yellow [1] pawn's position should be changed"+
            " from 24 to 29 after throwing 6")
    @Test
    void yellow1ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
        yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(30, yellowP[1].getActualPositionIndex());
    }

    @DisplayName("Yellow [2] pawn's position should be changed"+
            " from 61 to 62 after throwing 1")
    @Test
    void yellow2ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
        yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(62, yellowP[2].getActualPositionIndex());
    }

    @DisplayName("Yellow [2] pawn's position should be changed"+
            " from 61 to 63 after throwing 2")
    @Test
    void yellow2ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
        yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(63, yellowP[2].getActualPositionIndex());
    }

    @DisplayName("Yellow [2] pawn's position should be changed"+
            " from 61 to 64 after throwing 3")
    @Test
    void yellow2ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
        yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(64, yellowP[2].getActualPositionIndex());
    }

    @DisplayName("Yellow [2] pawn's position should be changed"+
            " from 61 to 65 after throwing 4")
    @Test
    void yellow2ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
        yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(65, yellowP[2].getActualPositionIndex());
    }

    @DisplayName("Yellow [2] pawn's position should be changed"+
            " from 61 to 66 after throwing 5")
    @Test
    void yellow2ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
        yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(66, yellowP[2].getActualPositionIndex());
    }

    @DisplayName("Yellow [2] pawn's position should be changed"+
            " from 61 to 67 after throwing 6")
    @Test
    void yellow2ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
        yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(67, yellowP[2].getActualPositionIndex());
    }

    @DisplayName("Yellow [3] pawn's position should be changed"+
            " from 50 to 51 after throwing 1")
    @Test
    void yellow3ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
        yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(51, yellowP[3].getActualPositionIndex());
    }

    @DisplayName("Yellow [3] pawn's position should be changed"+
            " from 50 to 52 after throwing 2")
    @Test
    void yellow3ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
        yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(52, yellowP[3].getActualPositionIndex());
    }

    @DisplayName("Yellow [3] pawn's position should be changed"+
            " from 50 to 53 after throwing 3")
    @Test
    void yellow3ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
        yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(53, yellowP[3].getActualPositionIndex());
    }

    @DisplayName("Yellow [3] pawn's position should be changed"+
            " from 50 to 54 after throwing 4")
    @Test
    void yellow3ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
        yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(54, yellowP[3].getActualPositionIndex());
    }

    @DisplayName("Yellow [3] pawn's position should be changed"+
            " from 50 to 55 after throwing 5")
    @Test
    void yellow3ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
        yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(55, yellowP[3].getActualPositionIndex());
    }

    @DisplayName("Yellow [3] pawn's position should be changed"+
            " from 50 to 55 after throwing 6")
    @Test
    void yellow3ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
        yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(56, yellowP[3].getActualPositionIndex());
    }

    @DisplayName("Blue [0] pawn's position should be changed"+
            " from 42 to 43 after throwing 1")
    @Test
    void blue0ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(43, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue [0] pawn's position should be changed"+
            " from 42 to 87 after throwing 2")
    @Test
    void blue0ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(87, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue [0] pawn's position should be changed"+
            " from 42 to 88 after throwing 3")
    @Test
    void blue0ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(88, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue [0] pawn's position should be changed"+
            " from 42 to 89 after throwing 4")
    @Test
    void blue0ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(89, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue [0] pawn's position should be changed"+
            " from 42 to 90 after throwing 5")
    @Test
    void blue0ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(90, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue [0] pawn's position should be changed"+
            " from 42 to 91 after throwing 6")
    @Test
    void blue0ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(91, blueP[0].getActualPositionIndex());
    }

    @DisplayName("Blue [1] pawn's position should be changed"+
            " from 38 to 39 after throwing 1")
    @Test
    void blue1ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
        blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(39, blueP[1].getActualPositionIndex());
    }

    @DisplayName("Blue [1] pawn's position should be changed"+
            " from 38 to 40 after throwing 2")
    @Test
    void blue1ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
        blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(40, blueP[1].getActualPositionIndex());
    }

    @DisplayName("Blue [1] pawn's position should be changed"+
            " from 38 to 41 after throwing 3")
    @Test
    void blue1ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
        blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(41, blueP[1].getActualPositionIndex());
    }

    @DisplayName("Blue [1] pawn's position should be changed"+
            " from 38 to 42 after throwing 4")
    @Test
    void blue1ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
        blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(42, blueP[1].getActualPositionIndex());
    }

    @DisplayName("Blue [1] pawn's position should be changed"+
            " from 38 to 43 after throwing 5")
    @Test
    void blue1ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
        blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(43, blueP[1].getActualPositionIndex());
    }

    @DisplayName("Blue [1] pawn's position should be changed"+
            " from 38 to 87 after throwing 6")
    @Test
    void blue1ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
        blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(87, blueP[1].getActualPositionIndex());
    }

    @DisplayName("Blue [2] pawn's position should be changed"+
            " from 19 to 20 after throwing 1")
    @Test
    void blue2ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
        blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(20, blueP[2].getActualPositionIndex());
    }

    @DisplayName("Blue [2] pawn's position should be changed"+
            " from 19 to 21 after throwing 2")
    @Test
    void blue2ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
        blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(21, blueP[2].getActualPositionIndex());
    }

    @DisplayName("Blue [2] pawn's position should be changed"+
            " from 19 to 22 after throwing 3")
    @Test
    void blue2ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
        blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(22, blueP[2].getActualPositionIndex());
    }

    @DisplayName("Blue [2] pawn's position should be changed"+
            " from 19 to 23 after throwing 4")
    @Test
    void blue2ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
        blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(23, blueP[2].getActualPositionIndex());
    }

    @DisplayName("Blue [2] pawn's position should be changed"+
            " from 19 to 24 after throwing 5")
    @Test
    void blue2ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
        blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(24, blueP[2].getActualPositionIndex());
    }

    @DisplayName("Blue [2] pawn's position should be changed"+
            " from 19 to 25 after throwing 6")
    @Test
    void blue2ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
        blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(25, blueP[2].getActualPositionIndex());
    }

    @DisplayName("Blue [3] pawn's position should be changed"+
            " from 64 to 65 after throwing 1")
    @Test
    void blue3ChangingPositionAfterThrowing1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(1);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
        blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(65, blueP[3].getActualPositionIndex());
    }

    @DisplayName("Blue [3] pawn's position should be changed"+
            " from 64 to 66 after throwing 2")
    @Test
    void blue3ChangingPositionAfterThrowing2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
        blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(66, blueP[3].getActualPositionIndex());
    }

    @DisplayName("Blue [3] pawn's position should be changed"+
            " from 64 to 67 after throwing 3")
    @Test
    void blue3ChangingPositionAfterThrowing3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
        blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(67, blueP[3].getActualPositionIndex());
    }

    @DisplayName("Blue [3] pawn's position should be changed"+
            " from 64 to 68 after throwing 4")
    @Test
    void blue3ChangingPositionAfterThrowing4() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
        blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(68, blueP[3].getActualPositionIndex());
    }

    @DisplayName("Blue [3] pawn's position should be changed"+
            " from 64 to 69 after throwing 5")
    @Test
    void blue3ChangingPositionAfterThrowing5() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
        blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(69, blueP[3].getActualPositionIndex());
    }

    @DisplayName("Blue [3] pawn's position should be changed"+
            " from 64 to 70 after throwing 6")
    @Test
    void blue3ChangingPositionAfterThrowing6() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
        blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(70, blueP[3].getActualPositionIndex());
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

        redP[0].setActualPosition(new Constants().constantPawnPositions().get(70).getValueX(),
                new Constants().constantPawnPositions().get(70).getValueY());
        redP[0].setActualPositionIndex(70);
        redP[1].setActualPosition(new Constants().constantPawnPositions().get(52).getValueX(),
                new Constants().constantPawnPositions().get(52).getValueY());
        redP[1].setActualPositionIndex(52);
        redP[2].setActualPosition(new Constants().constantPawnPositions().get(33).getValueX(),
                new Constants().constantPawnPositions().get(33).getValueY());
        redP[2].setActualPositionIndex(33);
        redP[3].setActualPosition(new Constants().constantPawnPositions().get(22).getValueX(),
                new Constants().constantPawnPositions().get(22).getValueY());
        redP[3].setActualPositionIndex(22);

        greenP[0].setActualPosition(new Constants().constantPawnPositions().get(28).getValueX(),
                new Constants().constantPawnPositions().get(28).getValueY());
        greenP[0].setActualPositionIndex(28);
        greenP[1].setActualPosition(new Constants().constantPawnPositions().get(66).getValueX(),
                new Constants().constantPawnPositions().get(66).getValueY());
        greenP[1].setActualPositionIndex(66);
        greenP[2].setActualPosition(new Constants().constantPawnPositions().get(47).getValueX(),
                new Constants().constantPawnPositions().get(47).getValueY());
        greenP[2].setActualPositionIndex(47);
        greenP[3].setActualPosition(new Constants().constantPawnPositions().get(36).getValueX(),
                new Constants().constantPawnPositions().get(36).getValueY());
        greenP[3].setActualPositionIndex(36);

        yellowP[0].setActualPosition(new Constants().constantPawnPositions().get(56).getValueX(),
                new Constants().constantPawnPositions().get(56).getValueY());
        yellowP[0].setActualPositionIndex(56);
        yellowP[1].setActualPosition(new Constants().constantPawnPositions().get(24).getValueX(),
                new Constants().constantPawnPositions().get(24).getValueY());
        yellowP[1].setActualPositionIndex(24);
        yellowP[2].setActualPosition(new Constants().constantPawnPositions().get(61).getValueX(),
                new Constants().constantPawnPositions().get(61).getValueY());
        yellowP[2].setActualPositionIndex(61);
        yellowP[3].setActualPosition(new Constants().constantPawnPositions().get(50).getValueX(),
                new Constants().constantPawnPositions().get(50).getValueY());
        yellowP[3].setActualPositionIndex(50);

        blueP[0].setActualPosition(new Constants().constantPawnPositions().get(42).getValueX(),
                new Constants().constantPawnPositions().get(42).getValueY());
        blueP[0].setActualPositionIndex(42);
        blueP[1].setActualPosition(new Constants().constantPawnPositions().get(38).getValueX(),
                new Constants().constantPawnPositions().get(38).getValueY());
        blueP[1].setActualPositionIndex(38);
        blueP[2].setActualPosition(new Constants().constantPawnPositions().get(19).getValueX(),
                new Constants().constantPawnPositions().get(19).getValueY());
        blueP[2].setActualPositionIndex(19);
        blueP[3].setActualPosition(new Constants().constantPawnPositions().get(64).getValueX(),
                new Constants().constantPawnPositions().get(64).getValueY());
        blueP[3].setActualPositionIndex(64);
    }
}
