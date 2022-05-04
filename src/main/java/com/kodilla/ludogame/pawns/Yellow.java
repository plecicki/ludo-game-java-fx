package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.PawnPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Yellow implements allPawnsColors {

    private Image imageYellowPawn = new Image("file:src/main/resources/pawns/yellow-pawn.png");
    private PawnPosition actualPosition;
    private int actualPositionIndex;

    public ImageView setImage() {
        ImageView yellowPawn = new ImageView(imageYellowPawn);
        yellowPawn.setFitHeight(40);
        yellowPawn.setFitWidth(40);
        return yellowPawn;
    }

    public PawnPosition getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int x, int y) {
        this.actualPosition = new PawnPosition(x, y);
    }

    public int getActualPositionIndex() {
        return actualPositionIndex;
    }

    public void setActualPositionIndex(int actualPositionIndex) {
        this.actualPositionIndex = actualPositionIndex;
    }
}
