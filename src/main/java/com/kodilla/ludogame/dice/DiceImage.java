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

    public ImageView setImage1() {
        ImageView imageViewDice1 = new ImageView(imageDice1);
        imageViewDice1.setFitHeight(100);
        imageViewDice1.setFitWidth(100);
        return imageViewDice1;
    }
    public ImageView setImage2() {
        ImageView imageViewDice2 = new ImageView(imageDice2);
        imageViewDice2.setFitHeight(100);
        imageViewDice2.setFitWidth(100);
        return imageViewDice2;
    }
    public ImageView setImage3() {
        ImageView imageViewDice3 = new ImageView(imageDice3);
        imageViewDice3.setFitHeight(100);
        imageViewDice3.setFitWidth(100);
        return imageViewDice3;
    }
    public ImageView setImage4() {
        ImageView imageViewDice4 = new ImageView(imageDice4);
        imageViewDice4.setFitHeight(100);
        imageViewDice4.setFitWidth(100);
        return imageViewDice4;
    }
    public ImageView setImage5() {
        ImageView imageViewDice5 = new ImageView(imageDice5);
        imageViewDice5.setFitHeight(100);
        imageViewDice5.setFitWidth(100);
        return imageViewDice5;
    }
    public ImageView setImage6() {
        ImageView imageViewDice6 = new ImageView(imageDice6);
        imageViewDice6.setFitHeight(100);
        imageViewDice6.setFitWidth(100);
        return imageViewDice6;
    }
}
