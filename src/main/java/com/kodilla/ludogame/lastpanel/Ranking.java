package com.kodilla.ludogame.lastpanel;

import com.kodilla.ludogame.pawns.Blue;
import com.kodilla.ludogame.pawns.Green;
import com.kodilla.ludogame.pawns.Red;
import com.kodilla.ludogame.pawns.Yellow;

import java.util.ArrayList;

public class Ranking {

    private ArrayList<String> playersRanking;
    private Boolean[] areInRanking = {false, false, false, false};

    public void checkIfRedWon(Red[] reds, int playerIndex) {
        if (reds[playerIndex].getActualPositionIndex() >= 72 && reds[playerIndex].getActualPositionIndex() < 77) {
            reds[playerIndex].setFinish(true);
        }

        if (reds[0].isFinish()==true && reds[1].isFinish()==true &&
                reds[2].isFinish()==true && reds[3].isFinish()==true &&
                areInRanking[0] == false) {
            this.playersRanking.add("RED");
            this.areInRanking[0] = true;
        }
    }

    public void checkIfGreenWon(Green[] greens, int playerIndex) {
        if (greens[playerIndex].getActualPositionIndex() >= 77 && greens[playerIndex].getActualPositionIndex() < 82) {
            greens[playerIndex].setFinish(true);
        }

        if (greens[0].isFinish()==true && greens[1].isFinish()==true &&
                greens[2].isFinish()==true && greens[3].isFinish()==true &&
                areInRanking[1] == false) {
            this.playersRanking.add("GREEN");
            this.areInRanking[1] = true;
        }
    }

    public void checkIfYellowWon(Yellow[] yellows, int playerIndex) {
        if (yellows[playerIndex].getActualPositionIndex() >= 82 && yellows[playerIndex].getActualPositionIndex() < 87) {
            yellows[playerIndex].setFinish(true);
        }

        if (yellows[0].isFinish()==true && yellows[1].isFinish()==true &&
                yellows[2].isFinish()==true && yellows[3].isFinish()==true &&
                areInRanking[2] == false) {
            this.playersRanking.add("YELLOW");
            this.areInRanking[2] = true;
        }
    }

    public void checkIfBlueWon(Blue[] blues, int playerIndex) {
        if (blues[playerIndex].getActualPositionIndex() >= 87 && blues[playerIndex].getActualPositionIndex() < 92) {
            blues[playerIndex].setFinish(true);
        }

        if (blues[0].isFinish()==true && blues[1].isFinish()==true &&
                blues[2].isFinish()==true && blues[3].isFinish()==true &&
                areInRanking[3] == false) {
            this.playersRanking.add("BLUE");
            this.areInRanking[3] = true;
        }
    }
}
