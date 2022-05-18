package com.kodilla.ludogame.lastpanel;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.ArrayList;

public class EndFrame {

    private ArrayList<String> rankingPlayers;

    public EndFrame(ArrayList<String> rankingPlayers) {
        this.rankingPlayers = rankingPlayers;
    }

    public void displayEndFrame(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.TOP_LEFT);
        grid.setHgap(5);
        grid.setVgap(5);
        grid.setPadding(new Insets(0, 0, 0, 0));
        grid.setStyle("-fx-background-color: #e8f4ac");

        Label label = new Label("FINISH RANKING:\n1. " +
                rankingPlayers.get(0) + "\n2. " +
                rankingPlayers.get(1) + "\n3. " +
                rankingPlayers.get(2) + "\n4. " +
                rankingPlayers.get(3) );
        label.setFont(new Font("Arial", 30));
        label.setStyle("-fx-font-weight: bold; -fx-text-fill: #217300");
        grid.add(label,1,1);

        Scene scene = new Scene(grid, 300, 200);
        Stage rankingWindow = new Stage();
        rankingWindow.setTitle("Finish ranking");
        rankingWindow.setScene(scene);
        rankingWindow.show();

        rankingWindow.setOnCloseRequest(new EventHandler<WindowEvent>() {
            public void handle(WindowEvent we) {
                primaryStage.close();
            }
        });
    }
}
