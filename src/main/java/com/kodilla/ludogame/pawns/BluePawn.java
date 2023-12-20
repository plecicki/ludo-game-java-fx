package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.constants.PawnPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class BluePawn implements Pawn {

    private PawnPosition actualPosition;
    private int actualPositionIndex;
    private boolean finish = false;

    public ImageView setImage(Image image) {
        ImageView bluePawn = new ImageView(image);
        bluePawn.setFitHeight(40);
        bluePawn.setFitWidth(40);
        return bluePawn;
    }

    public PawnPosition getActualPosition() {
        return actualPosition;
    }

    public void gotCaptured(int i) {
        setActualPositionIndex(i+12);
    }
    public int getValueX() {
        return new Constants().constantPawnPositions().get(getActualPositionIndex()).getValueX();
    }
    public  int getValueY() {
        return new Constants().constantPawnPositions().get(getActualPositionIndex()).getValueY();
    }
    public int getColspan() {return 10;}
    public int getRowspan() {return 10;}

    public void setActualPosition(int x, int y) {
        this.actualPosition = new PawnPosition(x, y);
    }

    public int getActualPositionIndex() {
        return actualPositionIndex;
    }

    public void setActualPositionIndex(int actualPositionIndex) {
        this.actualPositionIndex = actualPositionIndex;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }
}
