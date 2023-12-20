package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import org.junit.jupiter.api.*;

public class StartGameTestSuite {

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

    @DisplayName("When red pawns are at start's positions" +
    " then they should be unmovable when dice status equal one")
    @Test
    void redPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualOne() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(1);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 3));
    }

    @DisplayName("When red pawns are at start's positions" +
            " then they should be unmovable when dice status equal two")
    @Test
    void redPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualTwo() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(1);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(2);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 3));
    }

    @DisplayName("When red pawns are at start's positions" +
            " then they should be unmovable when dice status equal three")
    @Test
    void redPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualThree() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(1);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(3);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 3));
    }

    @DisplayName("When red pawns are at start's positions" +
            " then they should be unmovable when dice status equal fore")
    @Test
    void redPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualFore() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(1);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 3));
    }

    @DisplayName("When red pawns are at start's positions" +
            " then they should be unmovable when dice status equal five")
    @Test
    void redPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualFive() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(1);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(5);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 3));
    }

    @DisplayName("When red pawns are at start's positions" +
            " then they should be movable when dice status equal six")
    @Test
    void redPawnsShouldBeMovableAtStartPositionsWhenDiceStatusEqualSix() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(1);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);

        //Then
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 0));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 1));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 2));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 3));
    }

    @DisplayName("When green pawns are at start's positions" +
            " then they should be unmovable when dice status equal one")
    @Test
    void greenPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualOne() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(2);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 7));
    }

    @DisplayName("When green pawns are at start's positions" +
            " then they should be unmovable when dice status equal two")
    @Test
    void greenPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualTwo() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(2);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(2);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 7));
    }

    @DisplayName("When green pawns are at start's positions" +
            " then they should be unmovable when dice status equal three")
    @Test
    void greenPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualThree() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(2);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(3);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 7));
    }

    @DisplayName("When green pawns are at start's positions" +
            " then they should be unmovable when dice status equal fore")
    @Test
    void greenPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualFore() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(2);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 7));
    }

    @DisplayName("When green pawns are at start's positions" +
            " then they should be unmovable when dice status equal five")
    @Test
    void greenPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualFive() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(2);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(5);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 7));
    }

    @DisplayName("When green pawns are at start's positions" +
            " then they should be movable when dice status equal six")
    @Test
    void greenPawnsShouldBeMovableAtStartPositionsWhenDiceStatusEqualSix() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(2);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);

        //Then
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 4));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 5));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 6));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 7));
    }

    @DisplayName("When yellow pawns are at start's positions" +
            " then they should be unmovable when dice status equal one")
    @Test
    void yellowPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualOne() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(3);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 11));
    }

    @DisplayName("When yellow pawns are at start's positions" +
            " then they should be unmovable when dice status equal two")
    @Test
    void yellowPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualTwo() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(3);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(2);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 11));
    }

    @DisplayName("When yellow pawns are at start's positions" +
            " then they should be unmovable when dice status equal three")
    @Test
    void yellowPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualThree() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(3);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(3);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 11));
    }

    @DisplayName("When yellow pawns are at start's positions" +
            " then they should be unmovable when dice status equal fore")
    @Test
    void yellowPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualFore() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(3);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 11));
    }

    @DisplayName("When yellow pawns are at start's positions" +
            " then they should be unmovable when dice status equal five")
    @Test
    void yellowPawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualFive() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(3);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(5);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 11));
    }

    @DisplayName("When yellow pawns are at start's positions" +
            " then they should be movable when dice status equal six")
    @Test
    void yellowPawnsShouldBeMovableAtStartPositionsWhenDiceStatusEqualSix() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(3);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);

        //Then
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 8));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 9));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 10));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 11));
    }

    @DisplayName("When blue pawns are at start's positions" +
            " then they should be unmovable when dice status equal one")
    @Test
    void bluePawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualOne() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(4);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 15));
    }

    @DisplayName("When blue pawns are at start's positions" +
            " then they should be unmovable when dice status equal two")
    @Test
    void bluePawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualTwo() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(4);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(2);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 15));
    }

    @DisplayName("When blue pawns are at start's positions" +
            " then they should be unmovable when dice status equal three")
    @Test
    void bluePawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualThree() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(4);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(3);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 15));
    }

    @DisplayName("When blue pawns are at start's positions" +
            " then they should be unmovable when dice status equal fore")
    @Test
    void bluePawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualFore() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(4);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 15));
    }

    @DisplayName("When blue pawns are at start's positions" +
            " then they should be unmovable when dice status equal five")
    @Test
    void bluePawnsShouldBeUnmovableAtStartPositionsWhenDiceStatusEqualFive() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(5);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(5);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 15));
    }

    @DisplayName("When blue pawns are at start's positions" +
            " then they should be movable when dice status equal six")
    @Test
    void bluePawnsShouldBeMovableAtStartPositionsWhenDiceStatusEqualSix() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        onClickPawn.setWhoseTurn(4);
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);

        //Then
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 12));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 13));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 14));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 15));
    }

    @DisplayName("When is red's turn, then after throwing a dice" +
    " rest of pawns in others colors should be blocked")
    @Test
    void onlyRedPawnsShouldBeAbleToMove() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(1);

        //Then
        for (int i=0; i<=3; i++) {
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, i+12));
        }
    }

    @DisplayName("When is green's turn, then after throwing a dice" +
            " rest of pawns in others colors should be blocked")
    @Test
    void onlyGreenPawnsShouldBeAbleToMove() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(2);

        //Then
        for (int i=0; i<=3; i++) {
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, i));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, i+12));
        }
    }

    @DisplayName("When is yellow's turn, then after throwing a dice" +
            " rest of pawns in others colors should be blocked")
    @Test
    void onlyYellowPawnsShouldBeAbleToMove() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(3);

        //Then
        for (int i=0; i<=3; i++) {
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, i+4));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, i+12));
        }
    }

    @DisplayName("When is blue's turn, then after throwing a dice" +
            " rest of pawns in others colors should be blocked")
    @Test
    void onlyBluePawnsShouldBeAbleToMove() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(4);

        //Then
        for (int i=0; i<=3; i++) {
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, i+8));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, i+12));
        }
    }

    @DisplayName("Red pawns should be unmovable before clicking" +
            "dice button. Only after throwing the dice pawn" +
            "can be moved")
    @Test
    void redPawnsShouldBeUnmovableBeforeClickingDiceButton() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(false);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(1);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redPawn, 3));
    }

    @DisplayName("Green pawns should be unmovable before clicking" +
            "dice button. Only after throwing the dice pawn" +
            "can be moved")
    @Test
    void greenPawnsShouldBeUnmovableBeforeClickingDiceButton() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(false);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(2);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenPawn, 7));
    }

    @DisplayName("Yellow pawns should be unmovable before clicking" +
            "dice button. Only after throwing the dice pawn" +
            "can be moved")
    @Test
    void yellowPawnsShouldBeUnmovableBeforeClickingDiceButton() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(false);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(3);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowPawn, 11));
    }

    @DisplayName("Blue pawns should be unmovable before clicking" +
            "dice button. Only after throwing the dice pawn" +
            "can be moved")
    @Test
    void bluePawnsShouldBeUnmovableBeforeClickingDiceButton() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(false);
        throwDice.setDiceIndex(6);
        onClickPawn.setWhoseTurn(4);

        //Then
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, bluePawn, 15));
    }

    @DisplayName("Red pawns should be moved after clicking" +
            "at first position of their journey")
    @Test
    void redPawnsShouldBeMovedFromStartPosition() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);

        onClickPawn.start(throwDice.getDiceIndex(), redPawn[0].getActualPositionIndex(), 'R');
        redPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), redPawn[1].getActualPositionIndex(), 'R');
        redPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), redPawn[2].getActualPositionIndex(), 'R');
        redPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), redPawn[3].getActualPositionIndex(), 'R');
        redPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(redPawn[0].getActualPositionIndex(), 16);
        Assertions.assertEquals(redPawn[1].getActualPositionIndex(), 16);
        Assertions.assertEquals(redPawn[2].getActualPositionIndex(), 16);
        Assertions.assertEquals(redPawn[3].getActualPositionIndex(), 16);
    }

    @DisplayName("Green pawns should be moved after clicking" +
            "at first position of their journey")
    @Test
    void greenPawnsShouldBeMovedFromStartPosition() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);

        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[0].getActualPositionIndex(), 'G');
        greenPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[1].getActualPositionIndex(), 'G');
        greenPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[2].getActualPositionIndex(), 'G');
        greenPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), greenPawn[3].getActualPositionIndex(), 'G');
        greenPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(greenPawn[0].getActualPositionIndex(), 30);
        Assertions.assertEquals(greenPawn[1].getActualPositionIndex(), 30);
        Assertions.assertEquals(greenPawn[2].getActualPositionIndex(), 30);
        Assertions.assertEquals(greenPawn[3].getActualPositionIndex(), 30);
    }

    @DisplayName("Yellow pawns should be moved after clicking" +
            "at first position of their journey")
    @Test
    void yellowPawnsShouldBeMovedFromStartPosition() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);

        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[0].getActualPositionIndex(), 'Y');
        yellowPawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[1].getActualPositionIndex(), 'Y');
        yellowPawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[2].getActualPositionIndex(), 'Y');
        yellowPawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), yellowPawn[3].getActualPositionIndex(), 'Y');
        yellowPawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(yellowPawn[0].getActualPositionIndex(), 58);
        Assertions.assertEquals(yellowPawn[1].getActualPositionIndex(), 58);
        Assertions.assertEquals(yellowPawn[2].getActualPositionIndex(), 58);
        Assertions.assertEquals(yellowPawn[3].getActualPositionIndex(), 58);
    }

    @DisplayName("Blue pawns should be moved after clicking" +
            "at first position of their journey")
    @Test
    void bluePawnsShouldBeMovedFromStartPosition() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        ThrowDice throwDice = new ThrowDice();

        //When
        throwDice.setDiceIndex(6);

        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[0].getActualPositionIndex(), 'B');
        bluePawn[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[1].getActualPositionIndex(), 'B');
        bluePawn[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[2].getActualPositionIndex(), 'B');
        bluePawn[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), bluePawn[3].getActualPositionIndex(), 'B');
        bluePawn[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(bluePawn[0].getActualPositionIndex(), 44);
        Assertions.assertEquals(bluePawn[1].getActualPositionIndex(), 44);
        Assertions.assertEquals(bluePawn[2].getActualPositionIndex(), 44);
        Assertions.assertEquals(bluePawn[3].getActualPositionIndex(), 44);
    }

    void fillingTablesWithPawnsAtStartPositions() {
        RedPawn[] redPawns = {new RedPawn(), new RedPawn(), new RedPawn(), new RedPawn()};
        GreenPawn[] greenPawns = {new GreenPawn(), new GreenPawn(), new GreenPawn(), new GreenPawn()};
        YellowPawn[] yellowPawns = {new YellowPawn(), new YellowPawn(), new YellowPawn(), new YellowPawn()};
        BluePawn[] bluePawns = {new BluePawn(), new BluePawn(), new BluePawn(), new BluePawn()};

        redPawn = redPawns;
        greenPawn = greenPawns;
        yellowPawn = yellowPawns;
        bluePawn = bluePawns;

        for (int i = 0; i <= 3; i++) {
            redPawn[i].setActualPosition(new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY());
            redPawn[i].setActualPositionIndex(i);

            greenPawn[i].setActualPosition(new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY());
            greenPawn[i].setActualPositionIndex(i + 4);

            yellowPawn[i].setActualPosition(new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY());
            yellowPawn[i].setActualPositionIndex(i + 8);

            bluePawn[i].setActualPosition(new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY());
            bluePawn[i].setActualPositionIndex(i + 12);
        }
    }
}
