package com.kodilla.ludogame.dice;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DiceImage {

    private Image imageDice1 = new Image("file:src/main/resources/dice/dice-1.png");
    private Image imageDice2 = new Image("file:src/main/resources/dice/dice-2.png");
    private Image imageDice3 = new Image("file:src/main/resources/dice/dice-3.png");
    private Image imageDice4 = new Image("file:src/main/resources/dice/dice-4.png");
    private Image imageDice5 = new Image("file:src/main/resources/dice/dice-5.png");
    private Image imageDice6 = new Image("file:src/main/resources/dice/dice-6.png");

    private ImageView actualImage;
    private int actualDiceStatus;

    private ImageView setImage1() {
        ImageView imageViewDice1 = new ImageView(imageDice1);
        imageViewDice1.setFitHeight(120);
        imageViewDice1.setFitWidth(120);
        actualImage = imageViewDice1;
        actualDiceStatus = 1;
        return imageViewDice1;
    }
    private ImageView setImage2() {
        ImageView imageViewDice2 = new ImageView(imageDice2);
        imageViewDice2.setFitHeight(120);
        imageViewDice2.setFitWidth(120);
        actualImage = imageViewDice2;
        actualDiceStatus = 2;
        return imageViewDice2;
    }
    private ImageView setImage3() {
        ImageView imageViewDice3 = new ImageView(imageDice3);
        imageViewDice3.setFitHeight(120);
        imageViewDice3.setFitWidth(120);
        actualImage = imageViewDice3;
        actualDiceStatus = 3;
        return imageViewDice3;
    }
    private ImageView setImage4() {
        ImageView imageViewDice4 = new ImageView(imageDice4);
        imageViewDice4.setFitHeight(120);
        imageViewDice4.setFitWidth(120);
        actualImage = imageViewDice4;
        actualDiceStatus = 4;
        return imageViewDice4;
    }
    private ImageView setImage5() {
        ImageView imageViewDice5 = new ImageView(imageDice5);
        imageViewDice5.setFitHeight(120);
        imageViewDice5.setFitWidth(120);
        actualImage = imageViewDice5;
        actualDiceStatus = 5;
        return imageViewDice5;
    }
    private ImageView setImage6() {
        ImageView imageViewDice6 = new ImageView(imageDice6);
        imageViewDice6.setFitHeight(120);
        imageViewDice6.setFitWidth(120);
        actualImage = imageViewDice6;
        actualDiceStatus = 6;
        return imageViewDice6;
    }

    public ImageView startDiceImageMethod(int diceValue) {

        if (diceValue == 1) {
            return setImage1();
        } else if (diceValue == 2) {
            return setImage2();
        } else if (diceValue == 3) {
            return setImage3();
        } else if (diceValue == 4) {
            return setImage4();
        } else if (diceValue == 5) {
            return setImage5();
        } else if (diceValue == 6) {
            return setImage6();
        }
            return null;
    }

    public ImageView getActualImage() {
        return actualImage;
    }
}
