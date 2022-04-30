package com.kodilla.ludogame.pawns;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Red implements allPawnsColors {

    private Image imageRedPawn = new Image("file:src/main/resources/pawns/red-pawn.png");

    public ImageView setImage() {
        ImageView redPawn = new ImageView(imageRedPawn);
        redPawn.setFitHeight(40);
        redPawn.setFitWidth(40);
        return redPawn;
    }
}
