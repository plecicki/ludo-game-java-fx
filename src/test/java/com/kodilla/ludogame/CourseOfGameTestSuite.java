package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

public class CourseOfGameTestSuite {

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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(71, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(72, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(73, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(74, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(75, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(76, redPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[1].getActualPositionIndex(), 'R');
        redPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(53, redPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[1].getActualPositionIndex(), 'R');
        redPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(54, redPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[1].getActualPositionIndex(), 'R');
        redPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(55, redPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[1].getActualPositionIndex(), 'R');
        redPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(56, redPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[1].getActualPositionIndex(), 'R');
        redPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(57, redPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[1].getActualPositionIndex(), 'R');
        redPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(58, redPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(34, redPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(35, redPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(36, redPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(37, redPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(38, redPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(39, redPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(23, redPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(24, redPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(25, redPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(26, redPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(27, redPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(28, redPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(29, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(77, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(78, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(79, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(80, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(81, greenPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[1].getActualPositionIndex(), 'G');
        greenPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(67, greenPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[1].getActualPositionIndex(), 'G');
        greenPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(68, greenPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[1].getActualPositionIndex(), 'G');
        greenPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(69, greenPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[1].getActualPositionIndex(), 'G');
        greenPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(70, greenPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[1].getActualPositionIndex(), 'G');
        greenPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(71, greenPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[1].getActualPositionIndex(), 'G');
        greenPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(16, greenPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(48, greenPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(49, greenPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(50, greenPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(51, greenPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(52, greenPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(53, greenPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(37, greenPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(38, greenPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(39, greenPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(40, greenPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(41, greenPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(42, greenPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(57, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(82, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(83, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(84, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(85, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(86, yellowPawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[1].getActualPositionIndex(), 'Y');
        yellowPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(25, yellowPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[1].getActualPositionIndex(), 'Y');
        yellowPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(26, yellowPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[1].getActualPositionIndex(), 'Y');
        yellowPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(27, yellowPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[1].getActualPositionIndex(), 'Y');
        yellowPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(28, yellowPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[1].getActualPositionIndex(), 'Y');
        yellowPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(29, yellowPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[1].getActualPositionIndex(), 'Y');
        yellowPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(30, yellowPawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(62, yellowPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(63, yellowPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(64, yellowPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(65, yellowPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(66, yellowPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(67, yellowPawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[3].getActualPositionIndex(), 'Y');
        yellowPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(51, yellowPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[3].getActualPositionIndex(), 'Y');
        yellowPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(52, yellowPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[3].getActualPositionIndex(), 'Y');
        yellowPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(53, yellowPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[3].getActualPositionIndex(), 'Y');
        yellowPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(54, yellowPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[3].getActualPositionIndex(), 'Y');
        yellowPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(55, yellowPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[3].getActualPositionIndex(), 'Y');
        yellowPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(56, yellowPawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(43, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(87, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(88, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(89, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(90, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(91, bluePawn[0].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[1].getActualPositionIndex(), 'B');
        bluePawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(39, bluePawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[1].getActualPositionIndex(), 'B');
        bluePawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(40, bluePawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[1].getActualPositionIndex(), 'B');
        bluePawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(41, bluePawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[1].getActualPositionIndex(), 'B');
        bluePawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(42, bluePawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[1].getActualPositionIndex(), 'B');
        bluePawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(43, bluePawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[1].getActualPositionIndex(), 'B');
        bluePawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(87, bluePawn[1].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(20, bluePawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(21, bluePawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(22, bluePawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(23, bluePawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(24, bluePawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(25, bluePawn[2].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(65, bluePawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(66, bluePawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(67, bluePawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(68, bluePawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(69, bluePawn[3].getActualPositionIndex());
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

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(70, bluePawn[3].getActualPositionIndex());
    }

    @DisplayName("Blue [2] pawn's position should be changed"+
            " from 19 to 22 and Red [3] should be captured" +
            " from 22 to 2")
    @Test
    void capturingRed3ByBlue2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        redPawn[3].gotCaptured(3);

        //Then
        Assertions.assertEquals(22, bluePawn[2].getActualPositionIndex());
        Assertions.assertEquals(3, redPawn[3].getActualPositionIndex());
    }

    @DisplayName("Blue [2] pawn's position should be changed"+
            " from 19 to 24 and Yellow [1] should be captured" +
            " from 24 to 9")
    @Test
    void capturingYellow1ByBlue2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        yellowPawn[1].gotCaptured(1);

        //Then
        Assertions.assertEquals(24, bluePawn[2].getActualPositionIndex());
        Assertions.assertEquals(9, yellowPawn[1].getActualPositionIndex());
    }

    @DisplayName("Red [3] pawn's position should be changed"+
            " from 22 to 24 and Yellow [1] should be captured" +
            " from 24 to 10")
    @Test
    void capturingYellow1ByRed3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        yellowPawn[1].gotCaptured(1);

        //Then
        Assertions.assertEquals(24, redPawn[3].getActualPositionIndex());
        Assertions.assertEquals(9, yellowPawn[1].getActualPositionIndex());
    }

    @DisplayName("Red [3] pawn's position should be changed"+
            " from 22 to 28 and Green [0] should be captured" +
            " from 28 to 4")
    @Test
    void capturingGreen0ByRed3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        greenPawn[0].gotCaptured(0);

        //Then
        Assertions.assertEquals(28, redPawn[3].getActualPositionIndex());
        Assertions.assertEquals(4, greenPawn[0].getActualPositionIndex());
    }

    @DisplayName("Yellow [1] pawn's position should be changed"+
            " from 24 to 28 and Green [0] should be captured" +
            " from 28 to 4")
    @Test
    void capturingGreen0ByYellow1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[1].getActualPositionIndex(), 'Y');
        yellowPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        greenPawn[0].gotCaptured(0);

        //Then
        Assertions.assertEquals(28, yellowPawn[1].getActualPositionIndex());
        Assertions.assertEquals(4, greenPawn[0].getActualPositionIndex());
    }

    @DisplayName("Red [2] pawn's position should be changed"+
            " from 33 to 36 and Green [3] should be captured" +
            " from 36 to 6")
    @Test
    void capturingGreen3ByRed2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        greenPawn[3].gotCaptured(3);

        //Then
        Assertions.assertEquals(36, redPawn[2].getActualPositionIndex());
        Assertions.assertEquals(7, greenPawn[3].getActualPositionIndex());
    }

    @DisplayName("Red [2] pawn's position should be changed"+
            " from 33 to 38 and Blue [1] should be captured" +
            " from 38 to 13")
    @Test
    void capturingBlue1ByRed2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        bluePawn[1].gotCaptured(1);

        //Then
        Assertions.assertEquals(38, redPawn[2].getActualPositionIndex());
        Assertions.assertEquals(13, bluePawn[1].getActualPositionIndex());
    }

    @DisplayName("Green [3] pawn's position should be changed"+
            " from 36 to 38 and Blue [1] should be captured" +
            " from 38 to 13")
    @Test
    void capturingBlue1ByGreen3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        bluePawn[1].gotCaptured(1);

        //Then
        Assertions.assertEquals(38, greenPawn[3].getActualPositionIndex());
        Assertions.assertEquals(13, bluePawn[1].getActualPositionIndex());
    }

    @DisplayName("Green [3] pawn's position should be changed"+
            " from 36 to 42 and Blue [0] should be captured" +
            " from 42 to 12")
    @Test
    void capturingBlue0ByGreen3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        bluePawn[0].gotCaptured(0);

        //Then
        Assertions.assertEquals(42, greenPawn[3].getActualPositionIndex());
        Assertions.assertEquals(12, bluePawn[0].getActualPositionIndex());
    }

    @DisplayName("Green [2] pawn's position should be changed"+
            " from 47 to 50 and Yellow [3] should be captured" +
            " from 50 to 11")
    @Test
    void capturingYellow3ByGreen2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        yellowPawn[3].gotCaptured(3);

        //Then
        Assertions.assertEquals(50, greenPawn[2].getActualPositionIndex());
        Assertions.assertEquals(11, yellowPawn[3].getActualPositionIndex());
    }

    @DisplayName("Green [2] pawn's position should be changed"+
            " from 47 to 52 and Red [1] should be captured" +
            " from 52 to 1")
    @Test
    void capturingRed1ByGreen2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(2);

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        redPawn[1].gotCaptured(1);

        //Then
        Assertions.assertEquals(52, greenPawn[2].getActualPositionIndex());
        Assertions.assertEquals(1, redPawn[1].getActualPositionIndex());
    }

    @DisplayName("Yellow [3] pawn's position should be changed"+
            " from 50 to 52 and Red [1] should be captured" +
            " from 52 to 1")
    @Test
    void capturingRed1ByYellow3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[3].getActualPositionIndex(), 'Y');
        yellowPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        redPawn[1].gotCaptured(1);

        //Then
        Assertions.assertEquals(52, yellowPawn[3].getActualPositionIndex());
        Assertions.assertEquals(1, redPawn[1].getActualPositionIndex());
    }

    @DisplayName("Red [1] pawn's position should be changed"+
            " from 52 to 56 and Yellow [0] should be captured" +
            " from 56 to 8")
    @Test
    void capturingYellow0ByRed1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(1);

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[1].getActualPositionIndex(), 'R');
        redPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        yellowPawn[0].gotCaptured(0);

        //Then
        Assertions.assertEquals(56, redPawn[1].getActualPositionIndex());
        Assertions.assertEquals(8, yellowPawn[0].getActualPositionIndex());
    }

    @DisplayName("Yellow [2] pawn's position should be changed"+
            " from 61 to 64 and Blue [3] should be captured" +
            " from 64 to 15")
    @Test
    void capturingBlue3ByYellow2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(3);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        bluePawn[3].gotCaptured(3);

        //Then
        Assertions.assertEquals(64, yellowPawn[2].getActualPositionIndex());
        Assertions.assertEquals(15, bluePawn[3].getActualPositionIndex());
    }

    @DisplayName("Yellow [2] pawn's position should be changed"+
            " from 61 to 66 and Green [1] should be captured" +
            " from 66 to 5")
    @Test
    void capturingGreen1ByYellow2() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(5);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        greenPawn[1].gotCaptured(1);

        //Then
        Assertions.assertEquals(66, yellowPawn[2].getActualPositionIndex());
        Assertions.assertEquals(5, greenPawn[1].getActualPositionIndex());
    }

    @DisplayName("Blue [3] pawn's position should be changed"+
            " from 64 to 66 and Green [1] should be captured" +
            " from 66 to 5")
    @Test
    void capturingGreen1ByBlue3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(2);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        greenPawn[1].gotCaptured(1);

        //Then
        Assertions.assertEquals(66, bluePawn[3].getActualPositionIndex());
        Assertions.assertEquals(5, greenPawn[1].getActualPositionIndex());
    }

    @DisplayName("Blue [3] pawn's position should be changed"+
            " from 64 to 70 and Red [0] should be captured" +
            " from 70 to 0")
    @Test
    void capturingRed0ByBlue3() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(4);

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        redPawn[0].gotCaptured(0);

        //Then
        Assertions.assertEquals(70, bluePawn[3].getActualPositionIndex());
        Assertions.assertEquals(0, redPawn[0].getActualPositionIndex());
    }

    @DisplayName("Green [1] pawn's position should be changed"+
            " from 66 to 70 and Red [0] should be captured" +
            " from 70 to 0")
    @Test
    void capturingRed0ByGreen1() {
        //Given
        setPawnsAtPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(4);
        onClickPawn.setWhoseTurn(3);

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[1].getActualPositionIndex(), 'G');
        greenPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        redPawn[0].gotCaptured(0);

        //Then
        Assertions.assertEquals(70, greenPawn[1].getActualPositionIndex());
        Assertions.assertEquals(0, redPawn[0].getActualPositionIndex());
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

        redPawn[0].setActualPosition(new Constants().constantPawnPositions().get(70).getValueX(),
                new Constants().constantPawnPositions().get(70).getValueY());
        redPawn[0].setActualPositionIndex(70);
        redPawn[1].setActualPosition(new Constants().constantPawnPositions().get(52).getValueX(),
                new Constants().constantPawnPositions().get(52).getValueY());
        redPawn[1].setActualPositionIndex(52);
        redPawn[2].setActualPosition(new Constants().constantPawnPositions().get(33).getValueX(),
                new Constants().constantPawnPositions().get(33).getValueY());
        redPawn[2].setActualPositionIndex(33);
        redPawn[3].setActualPosition(new Constants().constantPawnPositions().get(22).getValueX(),
                new Constants().constantPawnPositions().get(22).getValueY());
        redPawn[3].setActualPositionIndex(22);

        greenPawn[0].setActualPosition(new Constants().constantPawnPositions().get(28).getValueX(),
                new Constants().constantPawnPositions().get(28).getValueY());
        greenPawn[0].setActualPositionIndex(28);
        greenPawn[1].setActualPosition(new Constants().constantPawnPositions().get(66).getValueX(),
                new Constants().constantPawnPositions().get(66).getValueY());
        greenPawn[1].setActualPositionIndex(66);
        greenPawn[2].setActualPosition(new Constants().constantPawnPositions().get(47).getValueX(),
                new Constants().constantPawnPositions().get(47).getValueY());
        greenPawn[2].setActualPositionIndex(47);
        greenPawn[3].setActualPosition(new Constants().constantPawnPositions().get(36).getValueX(),
                new Constants().constantPawnPositions().get(36).getValueY());
        greenPawn[3].setActualPositionIndex(36);

        yellowPawn[0].setActualPosition(new Constants().constantPawnPositions().get(56).getValueX(),
                new Constants().constantPawnPositions().get(56).getValueY());
        yellowPawn[0].setActualPositionIndex(56);
        yellowPawn[1].setActualPosition(new Constants().constantPawnPositions().get(24).getValueX(),
                new Constants().constantPawnPositions().get(24).getValueY());
        yellowPawn[1].setActualPositionIndex(24);
        yellowPawn[2].setActualPosition(new Constants().constantPawnPositions().get(61).getValueX(),
                new Constants().constantPawnPositions().get(61).getValueY());
        yellowPawn[2].setActualPositionIndex(61);
        yellowPawn[3].setActualPosition(new Constants().constantPawnPositions().get(50).getValueX(),
                new Constants().constantPawnPositions().get(50).getValueY());
        yellowPawn[3].setActualPositionIndex(50);

        bluePawn[0].setActualPosition(new Constants().constantPawnPositions().get(42).getValueX(),
                new Constants().constantPawnPositions().get(42).getValueY());
        bluePawn[0].setActualPositionIndex(42);
        bluePawn[1].setActualPosition(new Constants().constantPawnPositions().get(38).getValueX(),
                new Constants().constantPawnPositions().get(38).getValueY());
        bluePawn[1].setActualPositionIndex(38);
        bluePawn[2].setActualPosition(new Constants().constantPawnPositions().get(19).getValueX(),
                new Constants().constantPawnPositions().get(19).getValueY());
        bluePawn[2].setActualPositionIndex(19);
        bluePawn[3].setActualPosition(new Constants().constantPawnPositions().get(64).getValueX(),
                new Constants().constantPawnPositions().get(64).getValueY());
        bluePawn[3].setActualPositionIndex(64);
    }
}
