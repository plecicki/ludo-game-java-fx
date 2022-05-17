package com.kodilla.ludogame.constants;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GameLogo {

    private Image imageGameLogo = new Image("file:src/main/resources/ludo-game-logo.png");

    public ImageView setGameLogoParameters() {
        ImageView gameLogoImage = new ImageView(imageGameLogo);
        gameLogoImage.setFitHeight(300);
        gameLogoImage.setFitWidth(300);
        return gameLogoImage;
    }
}
