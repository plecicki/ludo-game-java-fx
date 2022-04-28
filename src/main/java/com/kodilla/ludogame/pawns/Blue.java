package com.kodilla.ludogame.pawns;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Blue implements allPawnsColors {

    private Image imageBluePawn = new Image("file:src/main/resources/blue-pawn.png");

    public ImageView setImage() {
        ImageView bluePawn = new ImageView(imageBluePawn);
        bluePawn.setFitHeight(40);
        bluePawn.setFitWidth(40);
        return bluePawn;
    }
}
