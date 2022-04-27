package com.kodilla.ludogame.constants;

public class PawnPosition {

    private int valueX;
    private int valueY;

    public PawnPosition(int valueX, int valueY) {
        this.valueX = valueX;
        this.valueY = valueY;
    }

    public int getValueX() {
        return valueX;
    }

    public void setValueX(int valueX) {
        this.valueX = valueX;
    }

    public int getValueY() {
        return valueY;
    }

    public void setValueY(int valueY) {
        this.valueY = valueY;
    }
}
