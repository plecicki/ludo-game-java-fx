package com.kodilla.ludogame;

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
    private Image imageGreenPawn = new Image("file:src/main/resources/green-pawn.png");

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
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        ImageView greenPawn = new ImageView(imageGreenPawn);
        greenPawn.setFitHeight(40);
        greenPawn.setFitWidth(40);
        grid.add(greenPawn, 42, 5);

        Scene scene = new Scene(grid, 633, 750, Color.LIGHTGREEN);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Ludo Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
