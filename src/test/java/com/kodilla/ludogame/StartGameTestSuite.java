package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StartGameTestSuite {

    private Red[] redP;
    private Green[] greenP;
    private Yellow[] yellowP;
    private Blue[] blueP;

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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
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
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
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
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
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
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
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
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
    }

    @DisplayName("Pawns should be movable in correct order" +
            "and should be unmovable when other player/computer" +
            "moving")
    @Test
    void pawnsShouldBeUnmovableWhenIsOthersPlayerTurn() {
        //Given
        fillingTablesWithPawnsAtStartPositions();
        OnClickPawn onClickPawn = new OnClickPawn();
        DiceButton diceButton = new DiceButton();
        ThrowDice throwDice = new ThrowDice();

        //When
        diceButton.setWasClicked(true);
        throwDice.setDiceIndex(6);

        //Then
        for (int i=0; i<=3; i++) {
            onClickPawn.setWhoseTurn(1);
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, i+12));
            onClickPawn.setWhoseTurn(2);
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, i));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, i+12));
            onClickPawn.setWhoseTurn(3);
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, i+4));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, i+8));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, i+12));
            onClickPawn.setWhoseTurn(4);
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, i));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, i+4));
            Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, i+8));
            Assertions.assertTrue(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, i+12));
        }
    }

    @DisplayName("Pawns should be unmovable before clicking" +
            "dice button. Only after throwing the dice pawn" +
            "can be moved")
    @Test
    void pawnsShouldBeUnmovableBeforeClickingDiceButton() {
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
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 0));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 1));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 2));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, redP, 3));
        onClickPawn.setWhoseTurn(2);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 4));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 5));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 6));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, greenP, 7));
        onClickPawn.setWhoseTurn(3);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 8));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 9));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 10));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, yellowP, 11));
        onClickPawn.setWhoseTurn(4);
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 12));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 13));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 14));
        Assertions.assertFalse(onClickPawn.isThisPawnMovable(onClickPawn, diceButton, throwDice, blueP, 15));
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

        onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
        redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
        redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
        redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
        redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(redP[0].getActualPositionIndex(), 16);
        Assertions.assertEquals(redP[1].getActualPositionIndex(), 16);
        Assertions.assertEquals(redP[2].getActualPositionIndex(), 16);
        Assertions.assertEquals(redP[3].getActualPositionIndex(), 16);
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

        onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
        greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
        greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
        greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
        greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(greenP[0].getActualPositionIndex(), 30);
        Assertions.assertEquals(greenP[1].getActualPositionIndex(), 30);
        Assertions.assertEquals(greenP[2].getActualPositionIndex(), 30);
        Assertions.assertEquals(greenP[3].getActualPositionIndex(), 30);
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

        onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
        yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
        yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
        yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
        yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(yellowP[0].getActualPositionIndex(), 58);
        Assertions.assertEquals(yellowP[1].getActualPositionIndex(), 58);
        Assertions.assertEquals(yellowP[2].getActualPositionIndex(), 58);
        Assertions.assertEquals(yellowP[3].getActualPositionIndex(), 58);
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

        onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
        blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
        blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
        blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
        blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

        //Then
        Assertions.assertEquals(blueP[0].getActualPositionIndex(), 44);
        Assertions.assertEquals(blueP[1].getActualPositionIndex(), 44);
        Assertions.assertEquals(blueP[2].getActualPositionIndex(), 44);
        Assertions.assertEquals(blueP[3].getActualPositionIndex(), 44);
    }

    void fillingTablesWithPawnsAtStartPositions() {
        Red[] reds = {new Red(), new Red(), new Red(), new Red()};
        Green[] greens = {new Green(), new Green(), new Green(), new Green()};
        Yellow[] yellows = {new Yellow(), new Yellow(), new Yellow(), new Yellow()};
        Blue[] blues = {new Blue(), new Blue(), new Blue(), new Blue()};

        redP = reds;
        greenP = greens;
        yellowP = yellows;
        blueP = blues;

        for (int i = 0; i <= 3; i++) {
            redP[i].setActualPosition(new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY());
            redP[i].setActualPositionIndex(i);

            greenP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY());
            greenP[i].setActualPositionIndex(i + 4);

            yellowP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY());
            yellowP[i].setActualPositionIndex(i + 8);

            blueP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY());
            blueP[i].setActualPositionIndex(i + 12);
        }
    }
}
