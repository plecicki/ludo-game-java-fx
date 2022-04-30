package com.kodilla.ludogame.background;

import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class SettingBackground {

    private Image imageBackground = new Image("file:src/main/resources/background/ludo-game.png");

    public Background setBackground() {

        BackgroundSize backgroundSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageBackground, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, backgroundSize);
        Background background = new Background(backgroundImage);
        return background;
    }
}
