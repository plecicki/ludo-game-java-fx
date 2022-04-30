package com.kodilla.ludogame;

import com.kodilla.ludogame.background.SettingBackground;
import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.pawns.Blue;
import com.kodilla.ludogame.pawns.Green;
import com.kodilla.ludogame.pawns.Red;
import com.kodilla.ludogame.pawns.Yellow;
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

        ImageView[] redPawns = {new Red().setImage(), new Red().setImage(), new Red().setImage(), new Red().setImage()};
        ImageView[] greenPawns = {new Green().setImage(), new Green().setImage(), new Green().setImage(), new Green().setImage()};
        ImageView[] yellowPawns = {new Yellow().setImage(), new Yellow().setImage(), new Yellow().setImage(), new Yellow().setImage()};
        ImageView[] bluePawns = {new Blue().setImage(), new Blue().setImage(), new Blue().setImage(), new Blue().setImage()};
//        grid.add(redPawns[0], 77, 61, 10, 10);
//        grid.getChildren().remove(redPawns[0]); //EXAMPLE TO CHANGE POSITION DURING GAME
//        grid.add(redPawns[0], 100, 100, 10, 10);

        for(int i=0; i<=3; i++) {
            grid.add(redPawns[i], new Constants().constantPawnPositions().get(i).getValueX(),
                    new Constants().constantPawnPositions().get(i).getValueY(), 10, 10);
            grid.add(greenPawns[i], new Constants().constantPawnPositions().get(i+4).getValueX(),
                    new Constants().constantPawnPositions().get(i+4).getValueY(), 10, 10);
            grid.add(yellowPawns[i], new Constants().constantPawnPositions().get(i+8).getValueX(),
                    new Constants().constantPawnPositions().get(i+8).getValueY(), 10, 10);
            grid.add(bluePawns[i], new Constants().constantPawnPositions().get(i+12).getValueX(),
                    new Constants().constantPawnPositions().get(i+12).getValueY(), 10, 10);
        }

        Scene scene = new Scene(grid, 633, 750, Color.LIGHTGREEN);

        primaryStage.setResizable(false);
        primaryStage.setTitle("Ludo Game");
        primaryStage.setScene(scene);
        primaryStage.show();

        System.out.println("AAAA");
    }
}
