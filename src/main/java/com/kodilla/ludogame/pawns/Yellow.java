package com.kodilla.ludogame.pawns;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Yellow implements allPawnsColors {

    private Image imageYellowPawn = new Image("file:src/main/resources/pawns/yellow-pawn.png");

    public ImageView setImage() {
        ImageView yellowPawn = new ImageView(imageYellowPawn);
        yellowPawn.setFitHeight(40);
        yellowPawn.setFitWidth(40);
        return yellowPawn;
    }
}
