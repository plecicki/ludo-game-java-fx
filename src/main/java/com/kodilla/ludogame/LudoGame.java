package com.kodilla.ludogame;

import com.kodilla.ludogame.background.SettingBackground;
import com.kodilla.ludogame.computer.ComputerPlaying;
import com.kodilla.ludogame.constants.*;
import com.kodilla.ludogame.controlPanel.DiceButton;
import com.kodilla.ludogame.controlPanel.TurnLabels;
import com.kodilla.ludogame.dice.DiceImage;
import com.kodilla.ludogame.dice.ThrowDice;
import com.kodilla.ludogame.lastpanel.Ranking;
import com.kodilla.ludogame.pawns.*;
import com.kodilla.ludogame.savingToFile.ReadAndWriteFile;
import com.kodilla.ludogame.savingToFile.StartGame;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.io.IOException;
import java.util.ArrayList;

public class LudoGame extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane grid = new GridPane();
        grid.setBackground(new SettingBackground().setBackground());
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(0, 0, 0, 0));

        StartGame startGame = new StartGame();
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        ArrayList<String> savedLines = new ArrayList<>();
        try {
            savedLines = readAndWriteFile.getFileAsArrayList("save.txt");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e);
        }
        System.out.println(savedLines.get(0));
        System.out.println(savedLines.get(1));
        System.out.println(savedLines.get(2));
        System.out.println(savedLines.get(3));

        Image imageRedPawn = new Image("file:src/main/resources/pawns/red-pawn.png");
        Image imageGreenPawn = new Image("file:src/main/resources/pawns/green-pawn.png");
        Image imageYellowPawn = new Image("file:src/main/resources/pawns/yellow-pawn.png");
        Image imageBluePawn = new Image("file:src/main/resources/pawns/blue-pawn.png");

        Red[] redP = {new Red(), new Red(), new Red(), new Red()};
        Green[] greenP = {new Green(), new Green(), new Green(), new Green()};
        Yellow[] yellowP = {new Yellow(), new Yellow(), new Yellow(), new Yellow()};
        Blue[] blueP = {new Blue(), new Blue(), new Blue(), new Blue()};

        ImageView[] redPawns = {redP[0].setImage(imageRedPawn), redP[1].setImage(imageRedPawn),
                redP[2].setImage(imageRedPawn), redP[3].setImage(imageRedPawn)};
        ImageView[] greenPawns = {greenP[0].setImage(imageGreenPawn), greenP[1].setImage(imageGreenPawn),
                greenP[2].setImage(imageGreenPawn), greenP[3].setImage(imageGreenPawn)};
        ImageView[] yellowPawns = {yellowP[0].setImage(imageYellowPawn), yellowP[1].setImage(imageYellowPawn),
                yellowP[2].setImage(imageYellowPawn), yellowP[3].setImage(imageYellowPawn)};
        ImageView[] bluePawns = {blueP[0].setImage(imageBluePawn), blueP[1].setImage(imageBluePawn),
                blueP[2].setImage(imageBluePawn), blueP[3].setImage(imageBluePawn)};

        ArrayList<String> rank = new ArrayList<>();
        Ranking ranking = new Ranking(rank, primaryStage);

        DiceButton diceButtonObject = new DiceButton();
        Button diceButton = diceButtonObject.throwDiceButton();

        Buttons buttons = new Buttons();

        ComputerPlaying computerPlaying = new ComputerPlaying(redPawns, greenPawns, yellowPawns, bluePawns, diceButton);

        DiceImage diceImage = new DiceImage();


        ThrowDice throwDice = new ThrowDice();

        TurnLabels turnLabels = new TurnLabels();


        OnClickPawn onClickPawn = new OnClickPawn();


        grid.add(diceButton, 35, 134, 100, 20);

        Scene scene = new Scene(grid, 633, 750, Color.LIGHTGREEN);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Ludo Game");

        Button startButton = buttons.startButton();
        Button continueButton = buttons.continueButton();

        CheckBox checkBox1 = new CheckBoxes().setCheckBoxesInMenu(1);
        CheckBox checkBox2 = new CheckBoxes().setCheckBoxesInMenu(2);
        CheckBox checkBox3 = new CheckBoxes().setCheckBoxesInMenu(3);
        CheckBox checkBox4 = new CheckBoxes().setCheckBoxesInMenu(4);

        GridPane gridMenu = new GridPane();
        gridMenu.setBackground(new Background(new BackgroundFill(Color.rgb(228, 247, 174), new CornerRadii(0), new Insets(0))));
        gridMenu.setAlignment(Pos.TOP_LEFT);
        gridMenu.setHgap(5);
        gridMenu.setVgap(5);
        gridMenu.setPadding(new Insets(0, 0, 0, 0));

        gridMenu.add(startButton, 8, 134, 100, 20);
        gridMenu.add(continueButton, 72, 134, 100, 20);
        gridMenu.add(new Labels().setGameTitle(), 10, 1, 200, 40);
        gridMenu.add(new GameLogo().setGameLogoParameters(), 33, 12, 100, 100);
        gridMenu.add(new Labels().setAboveCheckBoxesText(), 8, 90, 100, 20);
        gridMenu.add(checkBox1, 8, 100, 100, 20);
        gridMenu.add(checkBox2, 8, 108, 100, 20);
        gridMenu.add(checkBox3, 8, 116, 100, 20);
        gridMenu.add(checkBox4, 8, 124, 100, 20);

        Scene sceneMenu = new Scene(gridMenu, 633, 750, Color.LIGHTGREEN);
        primaryStage.setScene(sceneMenu);
        primaryStage.show();

        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                try {
                    if (readAndWriteFile.getWindowNavigation() == 1) {
                        readAndWriteFile.saveGame(redP,greenP,yellowP,blueP,throwDice,onClickPawn,diceButtonObject,
                            checkBox1, checkBox2, checkBox3, checkBox4);
                    }
                } catch (IOException e) {
                    System.out.println("Error during saving: " + e);
                }
            }
        });

        startButton.setOnAction(value -> {
            if (checkBox1.isSelected() ||
                    checkBox2.isSelected() ||
                    checkBox3.isSelected() ||
                    checkBox4.isSelected()) {
                if (!checkBox1.isSelected()) {
                    computerPlaying.setRedPlayer(false);
                }
                if (!checkBox2.isSelected()) {
                    computerPlaying.setGreenPlayer(false);
                }
                if (!checkBox3.isSelected()) {
                    computerPlaying.setYellowPlayer(false);
                }
                if (!checkBox4.isSelected()) {
                    computerPlaying.setBluePlayer(false);
                }
                startGame.setStartParameters(grid, redP, greenP, yellowP, blueP, redPawns,
                        greenPawns, yellowPawns, bluePawns, diceImage, turnLabels, onClickPawn);
                readAndWriteFile.setWindowNavigation(1);
                primaryStage.setScene(scene);
                primaryStage.show();
                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            } else {
                gridMenu.add(new Labels().setExceptionText(), 8, 142, 100, 20);
            }
        });
        continueButton.setOnAction(value -> {

        });
        diceButton.setOnAction(value -> {
            //Dice Image
            grid.getChildren().remove(diceImage.getActualImage());
            throwDice.diceRandom();
            ImageView diceImageView = diceImage.startDiceImageMethod(throwDice.getDiceIndex());
            grid.add(diceImageView, 8, 124, 30, 30);

            diceButtonObject.availableMove(onClickPawn.getWhoseTurn(), throwDice.getDiceIndex(),
                    redP, greenP, yellowP, blueP);

            if (diceButtonObject.isAvailable()) {
                diceButton.setDisable(true);
                diceButtonObject.setWasClicked(true);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(2);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            } else {
                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);
                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());

                if (onClickPawn.getWhoseTurn()<4) {
                    onClickPawn.setWhoseTurn(onClickPawn.getWhoseTurn() + 1);
                } else if (onClickPawn.getWhoseTurn() == 4) {
                    onClickPawn.setWhoseTurn(1);
                }

                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);
            }

            computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
        });

        redPawns[0].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, redP, 0)) {
                grid.getChildren().remove(redPawns[0]);
                onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
                grid.add(redPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 0);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 0);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfRedWon(redP, 0);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        redPawns[1].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, redP, 1)) {
                grid.getChildren().remove(redPawns[1]);
                onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
                grid.add(redPawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 1);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 1);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfRedWon(redP, 1);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        redPawns[2].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, redP, 2)) {
                grid.getChildren().remove(redPawns[2]);
                onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
                grid.add(redPawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 2);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 2);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfRedWon(redP, 2);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        redPawns[3].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, redP, 3)) {
                grid.getChildren().remove(redPawns[3]);
                onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
                grid.add(redPawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 3);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 3);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfRedWon(redP, 3);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });

        greenPawns[0].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, greenP, 4)) {
                grid.getChildren().remove(greenPawns[0]);
                onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
                grid.add(greenPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 4);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 4);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfGreenWon(greenP, 0);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        greenPawns[1].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, greenP, 5)) {
                grid.getChildren().remove(greenPawns[1]);
                onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
                grid.add(greenPawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 5);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 5);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfGreenWon(greenP, 1);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        greenPawns[2].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, greenP, 6)) {
                grid.getChildren().remove(greenPawns[2]);
                onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
                grid.add(greenPawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 6);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 6);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfGreenWon(greenP, 2);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        greenPawns[3].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, greenP, 7)) {
                grid.getChildren().remove(greenPawns[3]);
                onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
                grid.add(greenPawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 7);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 7);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfGreenWon(greenP, 3);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });

        yellowPawns[0].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, yellowP, 8)) {
                grid.getChildren().remove(yellowPawns[0]);
                onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
                grid.add(yellowPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 8);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 8);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfYellowWon(yellowP, 0);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        yellowPawns[1].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, yellowP, 9)) {
                grid.getChildren().remove(yellowPawns[1]);
                onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
                grid.add(yellowPawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 9);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 9);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfYellowWon(yellowP, 1);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        yellowPawns[2].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, yellowP, 10)) {
                grid.getChildren().remove(yellowPawns[2]);
                onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
                grid.add(yellowPawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 10);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 10);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfYellowWon(yellowP, 2);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        yellowPawns[3].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, yellowP, 11)) {
                grid.getChildren().remove(yellowPawns[3]);
                onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
                grid.add(yellowPawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 11);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 11);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfYellowWon(yellowP, 3);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });

        bluePawns[0].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, blueP, 12)) {
                grid.getChildren().remove(bluePawns[0]);
                onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
                grid.add(bluePawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 12);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 12);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfBlueWon(blueP, 0);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        bluePawns[1].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, blueP, 13)) {
                grid.getChildren().remove(bluePawns[1]);
                onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
                grid.add(bluePawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 13);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 13);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfBlueWon(blueP, 1);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        bluePawns[2].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, blueP, 14)) {
                grid.getChildren().remove(bluePawns[2]);
                onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
                grid.add(bluePawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 14);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 14);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfBlueWon(blueP, 2);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });
        bluePawns[3].setOnMouseClicked((MouseEvent e) -> {
            if (onClickPawn.isThisPawnMovable(onClickPawn, diceButtonObject, throwDice, blueP, 15)) {
                grid.getChildren().remove(bluePawns[3]);
                onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
                grid.add(bluePawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                onClickPawn.capturingPawn(grid, redP, greenP, yellowP, blueP, redPawns, greenPawns, yellowPawns, bluePawns, 15);

                onClickPawn.setWhoIsNext(throwDice, onClickPawn, 15);

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);

                ranking.checkIfBlueWon(blueP, 3);

                computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
            }
        });

        computerPlaying.play(onClickPawn.getWhoseTurn(), diceButtonObject.isWasClicked());
    }
}
