package com.kodilla.ludogame.lastpanel;

import com.kodilla.ludogame.pawns.BluePawn;
import com.kodilla.ludogame.pawns.GreenPawn;
import com.kodilla.ludogame.pawns.RedPawn;
import com.kodilla.ludogame.pawns.YellowPawn;
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

    public void checkIfRedWon(RedPawn[] redPawns, int playerIndex, ReadAndWriteFile readAndWriteFile) {
        if (redPawns[playerIndex].getActualPositionIndex() >= 72 && redPawns[playerIndex].getActualPositionIndex() < 77) {
            redPawns[playerIndex].setFinish(true);
        }

        if (redPawns[0].isFinish()==true && redPawns[1].isFinish()==true &&
                redPawns[2].isFinish()==true && redPawns[3].isFinish()==true &&
                areInRanking[0] == false) {
            this.playersRanking.add("RED");
            this.areInRanking[0] = true;

            openEndFrame(readAndWriteFile);
        }
    }

    public void checkIfGreenWon(GreenPawn[] greenPawns, int playerIndex, ReadAndWriteFile readAndWriteFile) {
        if (greenPawns[playerIndex].getActualPositionIndex() >= 77 && greenPawns[playerIndex].getActualPositionIndex() < 82) {
            greenPawns[playerIndex].setFinish(true);
        }

        if (greenPawns[0].isFinish()==true && greenPawns[1].isFinish()==true &&
                greenPawns[2].isFinish()==true && greenPawns[3].isFinish()==true &&
                areInRanking[1] == false) {
            this.playersRanking.add("GREEN");
            this.areInRanking[1] = true;

            openEndFrame(readAndWriteFile);
        }
    }

    public void checkIfYellowWon(YellowPawn[] yellowPawns, int playerIndex, ReadAndWriteFile readAndWriteFile) {
        if (yellowPawns[playerIndex].getActualPositionIndex() >= 82 && yellowPawns[playerIndex].getActualPositionIndex() < 87) {
            yellowPawns[playerIndex].setFinish(true);
        }

        if (yellowPawns[0].isFinish()==true && yellowPawns[1].isFinish()==true &&
                yellowPawns[2].isFinish()==true && yellowPawns[3].isFinish()==true &&
                areInRanking[2] == false) {
            this.playersRanking.add("YELLOW");
            this.areInRanking[2] = true;

            openEndFrame(readAndWriteFile);
        }
    }

    public void checkIfBlueWon(BluePawn[] bluePawns, int playerIndex, ReadAndWriteFile readAndWriteFile) {
        if (bluePawns[playerIndex].getActualPositionIndex() >= 87 && bluePawns[playerIndex].getActualPositionIndex() < 92) {
            bluePawns[playerIndex].setFinish(true);
        }

        if (bluePawns[0].isFinish()==true && bluePawns[1].isFinish()==true &&
                bluePawns[2].isFinish()==true && bluePawns[3].isFinish()==true &&
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
