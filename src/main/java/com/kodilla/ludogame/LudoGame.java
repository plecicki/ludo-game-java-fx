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

        for (int i = 0; i <= 3; i++) {
            grid.add(redPawns[i], new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY(), 10, 10);
            redP[i].setActualPosition(new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY());
            redP[i].setActualPositionIndex(i);

            grid.add(greenPawns[i], new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY(), 10, 10);
            greenP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 4).getValueX(),
                    new Constants().constantPawnPositions().get(i + 4).getValueY());
            greenP[i].setActualPositionIndex(i + 4);

            grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY(), 10, 10);
            yellowP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 8).getValueX(),
                    new Constants().constantPawnPositions().get(i + 8).getValueY());
            yellowP[i].setActualPositionIndex(i + 8);

            grid.add(bluePawns[i], new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY(), 10, 10);
            blueP[i].setActualPosition(new Constants().constantPawnPositions().get(i + 12).getValueX(),
                    new Constants().constantPawnPositions().get(i + 12).getValueY());
            blueP[i].setActualPositionIndex(i + 12);
        }

        DiceButton diceButtonObject = new DiceButton();
        Button diceButton = diceButtonObject.throwDiceButton();

        DiceImage diceImage = new DiceImage();
        diceImage.startDiceImageMethod(1);

        ThrowDice throwDice = new ThrowDice();

        TurnLabels turnLabels = new TurnLabels();
        turnLabels.turnLabels(1);
        turnLabels.instructionLabels(1);

        OnClickPawn onClickPawn = new OnClickPawn();
        onClickPawn.setWhoseTurn(1);

        grid.add(diceImage.getActualImage(), 8, 124, 30, 30);
        grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);
        grid.add(diceButton, 35, 134, 100, 20);
        grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
        grid.add(new Labels().setAuthorLabel(), 8, 1, 80, 7);
        grid.add(new Labels().setGitHubLabel(), 85, 1, 80, 7);

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
        });

        Scene scene = new Scene(grid, 633, 750, Color.LIGHTGREEN);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Ludo Game");
        primaryStage.setScene(scene);
        primaryStage.show();


        redPawns[0].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 1 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && redP[0].getActualPositionIndex() == 0) ||
                            (redP[0].getActualPositionIndex() >= 72 && redP[0].getActualPositionIndex() < 77))) {
                grid.getChildren().remove(redPawns[0]);
                onClickPawn.start(throwDice.getDiceIndex(), redP[0].getActualPositionIndex(), 'R');
                grid.add(redPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                redP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (redP[0].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (redP[0].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (redP[0].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(2);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        redPawns[1].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 1 && diceButtonObject.isWasClicked() == true) &&
            !((throwDice.getDiceIndex() != 6 && redP[1].getActualPositionIndex() == 1) ||
                    (redP[1].getActualPositionIndex() >= 72 && redP[1].getActualPositionIndex() < 77))) {
                grid.getChildren().remove(redPawns[1]);
                onClickPawn.start(throwDice.getDiceIndex(), redP[1].getActualPositionIndex(), 'R');
                grid.add(redPawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                redP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (redP[1].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (redP[1].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (redP[1].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(2);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        redPawns[2].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 1 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && redP[2].getActualPositionIndex() == 2) ||
                            (redP[2].getActualPositionIndex() >= 72 && redP[2].getActualPositionIndex() < 77))) {
                grid.getChildren().remove(redPawns[2]);
                onClickPawn.start(throwDice.getDiceIndex(), redP[2].getActualPositionIndex(), 'R');
                grid.add(redPawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                redP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (redP[2].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (redP[2].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (redP[2].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(2);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        redPawns[3].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 1 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && redP[3].getActualPositionIndex() == 3) ||
                            (redP[3].getActualPositionIndex() >= 72 && redP[3].getActualPositionIndex() < 77))) {
                grid.getChildren().remove(redPawns[3]);
                onClickPawn.start(throwDice.getDiceIndex(), redP[3].getActualPositionIndex(), 'R');
                grid.add(redPawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                redP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (redP[3].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (redP[3].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (redP[3].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(2);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });

        greenPawns[0].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 2 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && greenP[0].getActualPositionIndex() == 4) ||
                            (greenP[0].getActualPositionIndex() >= 77 && greenP[0].getActualPositionIndex() < 82))) {
                grid.getChildren().remove(greenPawns[0]);
                onClickPawn.start(throwDice.getDiceIndex(), greenP[0].getActualPositionIndex(), 'G');
                grid.add(greenPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                greenP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (greenP[0].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (greenP[0].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (greenP[0].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(3);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        greenPawns[1].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 2 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && greenP[1].getActualPositionIndex() == 5) ||
                            (greenP[1].getActualPositionIndex() >= 77 && greenP[1].getActualPositionIndex() < 82))) {
                grid.getChildren().remove(greenPawns[1]);
                onClickPawn.start(throwDice.getDiceIndex(), greenP[1].getActualPositionIndex(), 'G');
                grid.add(greenPawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                greenP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (greenP[1].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (greenP[1].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (greenP[1].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(3);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        greenPawns[2].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 2 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && greenP[2].getActualPositionIndex() == 6) ||
                            (greenP[2].getActualPositionIndex() >= 77 && greenP[2].getActualPositionIndex() < 82))) {
                grid.getChildren().remove(greenPawns[2]);
                onClickPawn.start(throwDice.getDiceIndex(), greenP[2].getActualPositionIndex(), 'G');
                grid.add(greenPawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                greenP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (greenP[2].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (greenP[2].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (greenP[2].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(3);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        greenPawns[3].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 2 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && greenP[3].getActualPositionIndex() == 7) ||
                            (greenP[3].getActualPositionIndex() >= 77 && greenP[3].getActualPositionIndex() < 82))) {
                grid.getChildren().remove(greenPawns[3]);
                onClickPawn.start(throwDice.getDiceIndex(), greenP[3].getActualPositionIndex(), 'G');
                grid.add(greenPawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                greenP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (greenP[3].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (greenP[3].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (greenP[3].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(3);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });

        yellowPawns[0].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 3 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && yellowP[0].getActualPositionIndex() == 8) ||
                            (yellowP[0].getActualPositionIndex() >= 82 && yellowP[0].getActualPositionIndex() < 87))) {
                grid.getChildren().remove(yellowPawns[0]);
                onClickPawn.start(throwDice.getDiceIndex(), yellowP[0].getActualPositionIndex(), 'Y');
                grid.add(yellowPawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                yellowP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (yellowP[0].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (yellowP[0].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (yellowP[0].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(4);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        yellowPawns[1].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 3 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && yellowP[1].getActualPositionIndex() == 9) ||
                            (yellowP[1].getActualPositionIndex() >= 82 && yellowP[1].getActualPositionIndex() < 87))) {
                grid.getChildren().remove(yellowPawns[1]);
                onClickPawn.start(throwDice.getDiceIndex(), yellowP[1].getActualPositionIndex(), 'Y');
                grid.add(yellowPawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                yellowP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (yellowP[1].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (yellowP[1].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (yellowP[1].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(4);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        yellowPawns[2].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 3 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && yellowP[2].getActualPositionIndex() == 10) ||
                            (yellowP[2].getActualPositionIndex() >= 82 && yellowP[2].getActualPositionIndex() < 87))) {
                grid.getChildren().remove(yellowPawns[2]);
                onClickPawn.start(throwDice.getDiceIndex(), yellowP[2].getActualPositionIndex(), 'Y');
                grid.add(yellowPawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                yellowP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (yellowP[2].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (yellowP[2].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (yellowP[2].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(4);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        yellowPawns[3].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 3 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && yellowP[3].getActualPositionIndex() == 11) ||
                            (yellowP[3].getActualPositionIndex() >= 82 && yellowP[3].getActualPositionIndex() < 87))) {
                grid.getChildren().remove(yellowPawns[3]);
                onClickPawn.start(throwDice.getDiceIndex(), yellowP[3].getActualPositionIndex(), 'Y');
                grid.add(yellowPawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                yellowP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (yellowP[3].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (yellowP[3].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (yellowP[3].getActualPositionIndex() == blueP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(bluePawns[i]);
                        blueP[i].setActualPositionIndex(i+12);
                        grid.add(bluePawns[i], new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(blueP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(4);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });

        bluePawns[0].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 4 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && blueP[0].getActualPositionIndex() == 12) ||
                            (blueP[0].getActualPositionIndex() >= 87 && blueP[0].getActualPositionIndex() < 92))) {
                grid.getChildren().remove(bluePawns[0]);
                onClickPawn.start(throwDice.getDiceIndex(), blueP[0].getActualPositionIndex(), 'B');
                grid.add(bluePawns[0], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                blueP[0].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (blueP[0].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (blueP[0].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (blueP[0].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(1);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        bluePawns[1].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 4 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && blueP[1].getActualPositionIndex() == 13) ||
                            (blueP[1].getActualPositionIndex() >= 87 && blueP[1].getActualPositionIndex() < 92))) {
                grid.getChildren().remove(bluePawns[1]);
                onClickPawn.start(throwDice.getDiceIndex(), blueP[1].getActualPositionIndex(), 'B');
                grid.add(bluePawns[1], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                blueP[1].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (blueP[1].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (blueP[1].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (blueP[1].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(1);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        bluePawns[2].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 4 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && blueP[2].getActualPositionIndex() == 14) ||
                            (blueP[2].getActualPositionIndex() >= 87 && blueP[2].getActualPositionIndex() < 92))) {
                grid.getChildren().remove(bluePawns[2]);
                onClickPawn.start(throwDice.getDiceIndex(), blueP[2].getActualPositionIndex(), 'B');
                grid.add(bluePawns[2], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                blueP[2].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (blueP[2].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (blueP[2].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (blueP[2].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(1);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
        bluePawns[3].setOnMouseClicked((MouseEvent e) -> {
            if ((onClickPawn.getWhoseTurn() == 4 && diceButtonObject.isWasClicked() == true) &&
                    !((throwDice.getDiceIndex() != 6 && blueP[3].getActualPositionIndex() == 15) ||
                            (blueP[3].getActualPositionIndex() >= 87 && blueP[3].getActualPositionIndex() < 92))) {
                grid.getChildren().remove(bluePawns[3]);
                onClickPawn.start(throwDice.getDiceIndex(), blueP[3].getActualPositionIndex(), 'B');
                grid.add(bluePawns[3], new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueX(),
                        new Constants().constantPawnPositions().get(onClickPawn.getNextPositionIndex()).getValueY(), 10, 10);
                blueP[3].setActualPositionIndex(onClickPawn.getNextPositionIndex());

                for (int i=0; i <= 3; i++) {
                    if (blueP[3].getActualPositionIndex() == redP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(redPawns[i]);
                        redP[i].setActualPositionIndex(i);
                        grid.add(redPawns[i], new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(redP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (blueP[3].getActualPositionIndex() == greenP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(greenPawns[i]);
                        greenP[i].setActualPositionIndex(i+4);
                        grid.add(greenPawns[i], new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(greenP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    } else if (blueP[3].getActualPositionIndex() == yellowP[i].getActualPositionIndex()) {
                        grid.getChildren().remove(yellowPawns[i]);
                        yellowP[i].setActualPositionIndex(i+8);
                        grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueX(),
                                new Constants().constantPawnPositions().get(yellowP[i].getActualPositionIndex()).getValueY(), 10, 10);
                    }
                }

                if (throwDice.getDiceIndex() != 6) {
                    onClickPawn.setWhoseTurn(1);
                }

                //Turn Label
                grid.getChildren().remove(turnLabels.getTurnLabel());
                turnLabels.turnLabels(onClickPawn.getWhoseTurn());
                grid.add(turnLabels.getTurnLabel(), 35, 126, 80, 12);

                diceButton.setDisable(false);
                diceButtonObject.setWasClicked(false);

                grid.getChildren().remove(turnLabels.getInfoLabel());
                turnLabels.instructionLabels(1);
                grid.add(turnLabels.getInfoLabel(), 100, 110, 50, 50);
            }
        });
    }
}
