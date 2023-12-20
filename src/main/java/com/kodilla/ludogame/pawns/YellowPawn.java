package com.kodilla.ludogame.pawns;

import com.kodilla.ludogame.constants.Constants;
import com.kodilla.ludogame.constants.PawnPosition;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class YellowPawn implements Pawn {

    private PawnPosition actualPosition;
    private int actualPositionIndex;
    private boolean finish = false;

    public ImageView setImage(Image image) {
        ImageView yellowPawn = new ImageView(image);
        yellowPawn.setFitHeight(40);
        yellowPawn.setFitWidth(40);
        return yellowPawn;
    }

    public PawnPosition getActualPosition() {
        return actualPosition;
    }

    public void gotCaptured(int i) {
        setActualPositionIndex(i+8);
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
