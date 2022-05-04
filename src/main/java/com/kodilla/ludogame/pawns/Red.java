package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.PawnPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Red implements allPawnsColors {

    private Image imageRedPawn = new Image("file:src/main/resources/pawns/red-pawn.png");
    private PawnPosition actualPosition;

    public ImageView setImage() {
        ImageView redPawn = new ImageView(imageRedPawn);
        redPawn.setFitHeight(40);
        redPawn.setFitWidth(40);
        return redPawn;
    }

    public PawnPosition getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int x, int y) {
        this.actualPosition = new PawnPosition(x, y);
    }
}
