package com.kodilla.ludogame;

import com.kodilla.ludogame.background.SettingBackground;
import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.constants.Labels;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.controlPanel.TurnLabels;
import com.kodilla.ludogame.dice.DiceImage;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.pawns.*;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LudoGame extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        grid.setBackground(new SettingBackground().setBackground());
        grid.setAlignment(Pos.TOP_LEFT);
        //grid.setGridLinesVisible(true); //TO DELETE
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(0, 0, 0, 0));

        Red[] redP = {new Red(), new Red(), new Red(), new Red()};
        Green[] greenP = {new Green(), new Green(), new Green(), new Green()};
        Yellow[] yellowP = {new Yellow(), new Yellow(), new Yellow(), new Yellow()};
        Blue[] blueP = {new Blue(), new Blue(), new Blue(), new Blue()};

        ImageView[] redPawns = {redP[0].setImage(), redP[1].setImage(), redP[2].setImage(), redP[3].setImage()};
        ImageView[] greenPawns = {greenP[0].setImage(), greenP[1].setImage(), greenP[2].setImage(), greenP[3].setImage()};
        ImageView[] yellowPawns = {yellowP[0].setImage(), yellowP[1].setImage(), yellowP[2].setImage(), yellowP[3].setImage()};
        ImageView[] bluePawns = {blueP[0].setImage(), blueP[1].setImage(), blueP[2].setImage(), blueP[3].setImage()};
//        grid.add(redPawns[0], 77, 61, 10, 10);
//        grid.getChildren().remove(redPawns[0]); //EXAMPLE TO CHANGE POSITION DURING GAME
//        grid.add(redPawns[0], 100, 100, 10, 10);

        for(int i=0; i<=3; i++) {
            grid.add(redPawns[i], new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY(), 10, 10);
            redP[i].setActualPosition(new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY());
            redP[i].setActualPositionIndex(i);

            grid.add(greenPawns[i], new Constants().constantPawnPositions().get(i+4).getValueX(),
                    new Constants().constantPawnPositions().get(i+4).getValueY(), 10, 10);
            greenP[i].setActualPosition(new Constants().constantPawnPositions().get(i+4).getValueX(),
                    new Constants().constantPawnPositions().get(i+4).getValueY());
            greenP[i].setActualPositionIndex(i+4);

            grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(i+8).getValueX(),
                    new Constants().constantPawnPositions().get(i+8).getValueY(), 10, 10);
            yellowP[i].setActualPosition(new Constants().constantPawnPositions().get(i+8).getValueX(),
                    new Constants().constantPawnPositions().get(i+8).getValueY());
            yellowP[i].setActualPositionIndex(i+8);

            grid.add(bluePawns[i], new Constants().constantPawnPositions().get(i+12).getValueX(),
                    new Constants().constantPawnPositions().get(i+12).getValueY(), 10, 10);
            blueP[i].setActualPosition(new Constants().constantPawnPositions().get(i+12).getValueX(),
                    new Constants().constantPawnPositions().get(i+12).getValueY());
            blueP[i].setActualPositionIndex(i+12);
        }

        Button diceButton = new DiceButton().throwDiceButton();

        DiceImage diceImage = new DiceImage();
        diceImage.startDiceImageMethod(1);

        ThrowDice throwDice = new ThrowDice();

        TurnLabels turnLabels = new TurnLabels();
        turnLabels.turnLabels(1);
        turnLabels.instructionLabels(1);

        grid.add(diceImage.getActualImage(), 8, 124, 30, 30);
        grid.add(turnLabels.getTurnLabel(),35,126,80,12);
        grid.add(diceButton,35,134, 100, 20);
        grid.add(turnLabels.getInfoLabel(), 100, 108, 50, 50);
        grid.add(new Labels().setAuthorLabel(), 8, 1, 80, 7);
        grid.add(new Labels().setGitHubLabel(), 85, 1, 80, 7);

        diceButton.setOnAction(value ->  {
            //Dice Image
            grid.getChildren().remove(diceImage.getActualImage());
            throwDice.diceRandom();
            ImageView diceImageView = diceImage.startDiceImageMethod(throwDice.getDiceIndex());
            grid.add(diceImageView, 8, 124, 30, 30);

            //Turn Label
            grid.getChildren().remove(turnLabels.getTurnLabel());
            throwDice.changeTurn(false /*TO DO*/);
            turnLabels.turnLabels(throwDice.getPlayerIndexTurn());
            grid.add(turnLabels.getTurnLabel(),35,126,80,12);
        });

        Scene scene = new Scene(grid, 633, 750, Color.LIGHTGREEN);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Ludo Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        OnClickPawn onClickPawn = new OnClickPawn();

        redPawns[0].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(redPawns[0]);
            onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
            grid.add(redPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        });
        redPawns[1].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(redPawns[1]);
            onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
            grid.add(redPawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
            System.out.println("1");
        });
        redPawns[2].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(redPawns[2]);
            onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
            grid.add(redPawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        });
        redPawns[3].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(redPawns[3]);
            onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
            grid.add(redPawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        });

        greenPawns[0].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(greenPawns[0]);
            onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
            grid.add(greenPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        });
        greenPawns[1].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(greenPawns[1]);
            onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
            grid.add(greenPawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        });
        greenPawns[2].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(greenPawns[2]);
            onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
            grid.add(greenPawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        });
        greenPawns[3].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(greenPawns[3]);
            onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
            grid.add(greenPawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        });

        yellowPawns[0].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(yellowPawns[0]);
            onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
            grid.add(yellowPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                    new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
            yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());
        });
        yellowPawns[1].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(yellowPawns[1]);
        });
        yellowPawns[2].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(yellowPawns[2]);
        });
        yellowPawns[3].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(yellowPawns[3]);
        });

        bluePawns[0].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(bluePawns[0]);
        });
        bluePawns[1].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(bluePawns[1]);
        });
        bluePawns[2].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(bluePawns[2]);
        });
        bluePawns[3].setOnMouseClicked((MouseEvent e) -> {
            grid.getChildren().remove(bluePawns[3]);
        });

    }
}
