package com.kodilla.ludogame.constants;

import java.util.ArrayList;

public class Constants {

    public ArrayList<PawnPosition> constantPawnPositions() {
        ArrayList<PawnPosition> pawnPositions = new ArrayList<>();
        //Red start positions
        pawnPositions.add(new PawnPosition(15, 13)); //Left-up
        pawnPositions.add(new PawnPosition(31, 13)); //Right-up
        pawnPositions.add(new PawnPosition(15, 29)); //Left-down
        pawnPositions.add(new PawnPosition(31, 29)); //Right-down
        //Green start positions
        pawnPositions.add(new PawnPosition(93, 13)); //Left-up
        pawnPositions.add(new PawnPosition(109, 13)); //Right-up
        pawnPositions.add(new PawnPosition(93, 29)); //Left-down
        pawnPositions.add(new PawnPosition(109, 29)); //Right-down
        //Yellow start positions
        pawnPositions.add(new PawnPosition(15, 91)); //Left-up
        pawnPositions.add(new PawnPosition(31, 91)); //Right-up
        pawnPositions.add(new PawnPosition(15, 106)); //Left-down
        pawnPositions.add(new PawnPosition(31, 106)); //Right-down
        //Blue start positions
        pawnPositions.add(new PawnPosition(93, 91)); //Left-up
        pawnPositions.add(new PawnPosition(109, 91)); //Right-up
        pawnPositions.add(new PawnPosition(93, 106)); //Left-down
        pawnPositions.add(new PawnPosition(109, 106)); //Right-down
        //Game fields
        pawnPositions.add(new PawnPosition(7, 53)); //1
        pawnPositions.add(new PawnPosition(15, 53)); //2
        pawnPositions.add(new PawnPosition(23, 53)); //3
        pawnPositions.add(new PawnPosition(31, 53)); //4
        pawnPositions.add(new PawnPosition(39, 53)); //5
        pawnPositions.add(new PawnPosition(46, 53)); //6
        pawnPositions.add(new PawnPosition(54, 53)); //7
        pawnPositions.add(new PawnPosition(54, 45)); //8
        pawnPositions.add(new PawnPosition(54, 37)); //9
        pawnPositions.add(new PawnPosition(54, 30)); //10
        pawnPositions.add(new PawnPosition(54, 22)); //11
        pawnPositions.add(new PawnPosition(54, 14)); //12
        pawnPositions.add(new PawnPosition(54, 6)); //13
        pawnPositions.add(new PawnPosition(62, 6)); //14
        pawnPositions.add(new PawnPosition(70, 6)); //15
        pawnPositions.add(new PawnPosition(70, 14)); //16
        pawnPositions.add(new PawnPosition(70, 22)); //17
        pawnPositions.add(new PawnPosition(70, 30)); //18
        pawnPositions.add(new PawnPosition(70, 37)); //19
        pawnPositions.add(new PawnPosition(70, 45)); //20
        pawnPositions.add(new PawnPosition(70, 53)); //21
        pawnPositions.add(new PawnPosition(77, 53)); //22
        pawnPositions.add(new PawnPosition(85, 53)); //23
        pawnPositions.add(new PawnPosition(93, 53)); //24
        pawnPositions.add(new PawnPosition(101, 53)); //25
        pawnPositions.add(new PawnPosition(109, 53)); //26
        pawnPositions.add(new PawnPosition(116, 53)); //27
        pawnPositions.add(new PawnPosition(116, 61)); //28
        pawnPositions.add(new PawnPosition(116, 69)); //29
        pawnPositions.add(new PawnPosition(109, 69)); //30
        pawnPositions.add(new PawnPosition(101, 69)); //31
        pawnPositions.add(new PawnPosition(93, 69)); //32
        pawnPositions.add(new PawnPosition(85, 69)); //33
        pawnPositions.add(new PawnPosition(77, 69)); //34
        pawnPositions.add(new PawnPosition(70, 69)); //35
        pawnPositions.add(new PawnPosition(70, 76)); //36
        pawnPositions.add(new PawnPosition(70, 84)); //37
        pawnPositions.add(new PawnPosition(70, 92)); //38
        pawnPositions.add(new PawnPosition(70, 100)); //39
        pawnPositions.add(new PawnPosition(70, 107)); //40
        pawnPositions.add(new PawnPosition(70, 115)); //41
        pawnPositions.add(new PawnPosition(62, 115)); //42
        pawnPositions.add(new PawnPosition(54, 115)); //43
        pawnPositions.add(new PawnPosition(54, 107)); //44
        pawnPositions.add(new PawnPosition(54, 100)); //45
        pawnPositions.add(new PawnPosition(54, 92)); //46
        pawnPositions.add(new PawnPosition(54, 84)); //47
        pawnPositions.add(new PawnPosition(54, 76)); //48
        pawnPositions.add(new PawnPosition(54, 69)); //49
        pawnPositions.add(new PawnPosition(46, 69)); //50
        pawnPositions.add(new PawnPosition(39, 69)); //51
        pawnPositions.add(new PawnPosition(31, 69)); //52
        pawnPositions.add(new PawnPosition(23, 69)); //53
        pawnPositions.add(new PawnPosition(15, 69)); //54
        pawnPositions.add(new PawnPosition(7, 69)); //55
        pawnPositions.add(new PawnPosition(7, 61)); //56
        //Red win positions
        pawnPositions.add(new PawnPosition(15, 61)); //1
        pawnPositions.add(new PawnPosition(23, 61)); //2
        pawnPositions.add(new PawnPosition(31, 61)); //3
        pawnPositions.add(new PawnPosition(39, 61)); //4
        pawnPositions.add(new PawnPosition(46, 61)); //5
        //Green win positions
        pawnPositions.add(new PawnPosition(62, 14)); //1
        pawnPositions.add(new PawnPosition(62, 22)); //2
        pawnPositions.add(new PawnPosition(62, 30)); //3
        pawnPositions.add(new PawnPosition(62, 37)); //4
        pawnPositions.add(new PawnPosition(62, 45)); //5
        //Yellow win positions
        pawnPositions.add(new PawnPosition(62, 107)); //1
        pawnPositions.add(new PawnPosition(62, 100)); //2
        pawnPositions.add(new PawnPosition(62, 92)); //3
        pawnPositions.add(new PawnPosition(62, 84)); //4
        pawnPositions.add(new PawnPosition(62, 76)); //5
        //Blue win positions
        pawnPositions.add(new PawnPosition(109, 61)); //1
        pawnPositions.add(new PawnPosition(101, 61)); //2
        pawnPositions.add(new PawnPosition(93, 61)); //3
        pawnPositions.add(new PawnPosition(85, 61)); //4
        pawnPositions.add(new PawnPosition(77, 61)); //5

        return pawnPositions;
    }
}
