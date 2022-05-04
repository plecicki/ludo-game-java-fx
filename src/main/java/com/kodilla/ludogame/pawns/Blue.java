package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.PawnPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Blue implements allPawnsColors {

    private Image imageBluePawn = new Image("file:src/main/resources/pawns/blue-pawn.png");
    private PawnPosition actualPosition;

    public ImageView setImage() {
        ImageView bluePawn = new ImageView(imageBluePawn);
        bluePawn.setFitHeight(40);
        bluePawn.setFitWidth(40);
        return bluePawn;
    }

    public PawnPosition getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int x, int y) {
        this.actualPosition = new PawnPosition(x, y);
    }
}
