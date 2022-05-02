package com.kodilla.ludogame.constants;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
}
