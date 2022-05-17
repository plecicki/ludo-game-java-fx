package com.kodilla.ludogame.constants;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Labels {

    public Label setAuthorLabel() {
        Label author = new Label();
        author.setText("Author: Piotr \u0141\u0119cicki");
        Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20);
        author.setFont(font);
        return author;
    }

    public Label setGitHubLabel() {
        Label gitHub = new Label("  @PLecicki");

        Image gitHubImage = new Image("file:src/main/resources/github-logo.png");
        ImageView gitHubImageView = new ImageView(gitHubImage);
        gitHubImageView.setFitWidth(100);
        gitHubImageView.setFitHeight(29.5);
        gitHub.setGraphic(gitHubImageView);

        Font font = Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 15);
        gitHub.setFont(font);
        return gitHub;
    }

    public Label setGameTitle() {
        Label title = new Label();
        title.setText("LUDO GAME");
        Font font = Font.font("Anton", FontWeight.BOLD, FontPosture.REGULAR, 90);
        title.setFont(font);
        return title;
    }

    public Label setAboveCheckBoxesText() {
        Label checkBoxLabel = new Label();
        checkBoxLabel.setText("Select your pawns color/s\n(Can be more than one color)");
        Font font = Font.font("Anton", FontWeight.BOLD, FontPosture.REGULAR, 20);
        checkBoxLabel.setFont(font);
        return checkBoxLabel;
    }

    public Label setExceptionText() {
        Label exceptionLabel = new Label();
        exceptionLabel.setText("You haven't selected color or colors");
        Font font = Font.font("Anton", FontWeight.BOLD, FontPosture.REGULAR, 15);
        exceptionLabel.setFont(font);
        exceptionLabel.setTextFill(Color.DARKRED);
        return exceptionLabel;
    }
}
