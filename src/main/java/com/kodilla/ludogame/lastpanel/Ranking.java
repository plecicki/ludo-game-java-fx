package com.kodilla.ludogame.lastpanel;

import com.kodilla.ludogame.pawns.Blue;
import com.kodilla.ludogame.pawns.Green;
import com.kodilla.ludogame.pawns.Red;
import com.kodilla.ludogame.pawns.Yellow;
import com.kodilla.ludogame.savingToFile.ReadAndWriteFile;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Ranking {

    private ArrayList<String> playersRanking;
    private Stage primaryStage;
    private Boolean[] areInRanking = {false, false, false, false};

    public Ranking(ArrayList<String> playersRanking, Stage primaryStage) {
        this.playersRanking = playersRanking;
        this.primaryStage = primaryStage;
    }

    public void checkIfRedWon(Red[] reds, int playerIndex, ReadAndWriteFile readAndWriteFile) {
        if (reds[playerIndex].getActualPositionIndex() >= 72 && reds[playerIndex].getActualPositionIndex() < 77) {
            reds[playerIndex].setFinish(true);
        }

        if (reds[0].isFinish()==true && reds[1].isFinish()==true &&
                reds[2].isFinish()==true && reds[3].isFinish()==true &&
                areInRanking[0] == false) {
            this.playersRanking.add("RED");
            this.areInRanking[0] = true;

            openEndFrame(readAndWriteFile);
        }
    }

    public void checkIfGreenWon(Green[] greens, int playerIndex, ReadAndWriteFile readAndWriteFile) {
        if (greens[playerIndex].getActualPositionIndex() >= 77 && greens[playerIndex].getActualPositionIndex() < 82) {
            greens[playerIndex].setFinish(true);
        }

        if (greens[0].isFinish()==true && greens[1].isFinish()==true &&
                greens[2].isFinish()==true && greens[3].isFinish()==true &&
                areInRanking[1] == false) {
            this.playersRanking.add("GREEN");
            this.areInRanking[1] = true;

            openEndFrame(readAndWriteFile);
        }
    }

    public void checkIfYellowWon(Yellow[] yellows, int playerIndex, ReadAndWriteFile readAndWriteFile) {
        if (yellows[playerIndex].getActualPositionIndex() >= 82 && yellows[playerIndex].getActualPositionIndex() < 87) {
            yellows[playerIndex].setFinish(true);
        }

        if (yellows[0].isFinish()==true && yellows[1].isFinish()==true &&
                yellows[2].isFinish()==true && yellows[3].isFinish()==true &&
                areInRanking[2] == false) {
            this.playersRanking.add("YELLOW");
            this.areInRanking[2] = true;

            openEndFrame(readAndWriteFile);
        }
    }

    public void checkIfBlueWon(Blue[] blues, int playerIndex, ReadAndWriteFile readAndWriteFile) {
        if (blues[playerIndex].getActualPositionIndex() >= 87 && blues[playerIndex].getActualPositionIndex() < 92) {
            blues[playerIndex].setFinish(true);
        }

        if (blues[0].isFinish()==true && blues[1].isFinish()==true &&
                blues[2].isFinish()==true && blues[3].isFinish()==true &&
                areInRanking[3] == false) {
            this.playersRanking.add("BLUE");
            this.areInRanking[3] = true;

            openEndFrame(readAndWriteFile);
        }
    }

    private void openEndFrame(ReadAndWriteFile readAndWriteFile) {
        if (areInRanking[0] == true &&
                areInRanking[1] == true &&
                areInRanking[2] == true &&
                areInRanking[3] == true) {
            EndFrame endFrame = new EndFrame(playersRanking);
            endFrame.displayEndFrame(primaryStage, readAndWriteFile, endFrame);
            readAndWriteFile.setWindowNavigation(2);
        }
    }

    public ArrayList<String> getPlayersRanking() {
        return playersRanking;
    }
}
