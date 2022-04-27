package com.kodilla.ludogame;

import com.kodilla.ludogame.constants.Constants;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LudoGame extends Application {

    private Image imageBackground = new Image("file:src/main/resources/ludo-game.png");
    private Image imageRedPawn = new Image("file:src/main/resources/red-pawn.png");
    private Image imageGreenPawn = new Image("file:src/main/resources/green-pawn.png");
    private Image imageBluePawn = new Image("file:src/main/resources/blue-pawn.png");
    private Image imageYellowPawn = new Image("file:src/main/resources/yellow-pawn.png");

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setBackground(background);
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setGridLinesVisible(true); //TO DELETE
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(0, 0, 0, 0));

        ImageView redPawn = new ImageView(imageRedPawn);
        redPawn.setFitHeight(40);
        redPawn.setFitWidth(40);
        grid.add(redPawn, 7, 69, 10, 10);
//        grid.getChildren().remove(redPawn); EXAMPLE TO CHANGE POSITION DURING GAME
//        grid.add(redPawn, 100, 100, 10, 10);

        ImageView greenPawn = new ImageView(imageGreenPawn);
        greenPawn.setFitHeight(40);
        greenPawn.setFitWidth(40);
        grid.add(greenPawn, 109, 29, 10, 10);

        ImageView yellowPawn = new ImageView(imageYellowPawn);
        yellowPawn.setFitHeight(40);
        yellowPawn.setFitWidth(40);
        grid.add(yellowPawn, 31, 106, 10, 10);

        ImageView bluePawn = new ImageView(imageBluePawn);
        bluePawn.setFitHeight(40);
        bluePawn.setFitWidth(40);
        grid.add(bluePawn, 109, 106, 10, 10);

        Scene scene = new Scene(grid, 633, 750, Color.LIGHTGREEN);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Ludo Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
