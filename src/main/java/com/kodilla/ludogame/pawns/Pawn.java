package com.kodilla.ludogame.pawns;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public interface Pawn {

    ImageView setImage(Image image);
    void setActualPosition(int x, int y);
    void setActualPositionIndex(int actualPositionIndex);
    int getActualPositionIndex();
}
