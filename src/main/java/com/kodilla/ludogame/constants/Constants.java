package com.kodilla.ludogame.constants;

import javafx.scene.control.Label;

import java.util.ArrayList;

public class Constants {

    public ArrayList<PawnPosition> constantPawnPositions() {
        ArrayList<PawnPosition> pawnPositions = new ArrayList<>();
        //Red start positions
        pawnPositions.add(new PawnPosition(15, 13)); //Left-up 0
        pawnPositions.add(new PawnPosition(31, 13)); //Right-up 1
        pawnPositions.add(new PawnPosition(15, 29)); //Left-down 2
        pawnPositions.add(new PawnPosition(31, 29)); //Right-down 3
        //Green start positions
        pawnPositions.add(new PawnPosition(93, 13)); //Left-up 4
        pawnPositions.add(new PawnPosition(109, 13)); //Right-up 5
        pawnPositions.add(new PawnPosition(93, 29)); //Left-down 6
        pawnPositions.add(new PawnPosition(109, 29)); //Right-down 7
        //Yellow start positions
        pawnPositions.add(new PawnPosition(15, 91)); //Left-up 8
        pawnPositions.add(new PawnPosition(31, 91)); //Right-up 9
        pawnPositions.add(new PawnPosition(15, 106)); //Left-down 10
        pawnPositions.add(new PawnPosition(31, 106)); //Right-down 11
        //Blue start positions
        pawnPositions.add(new PawnPosition(93, 91)); //Left-up 12
        pawnPositions.add(new PawnPosition(109, 91)); //Right-up 13
        pawnPositions.add(new PawnPosition(93, 106)); //Left-down 14
        pawnPositions.add(new PawnPosition(109, 106)); //Right-down 15
        //Game fields
        pawnPositions.add(new PawnPosition(7, 53)); //1 16
        pawnPositions.add(new PawnPosition(15, 53)); //2 17
        pawnPositions.add(new PawnPosition(23, 53)); //3 18
        pawnPositions.add(new PawnPosition(31, 53)); //4 19
        pawnPositions.add(new PawnPosition(39, 53)); //5 20
        pawnPositions.add(new PawnPosition(46, 53)); //6 21
        pawnPositions.add(new PawnPosition(54, 53)); //7 22
        pawnPositions.add(new PawnPosition(54, 45)); //8 23
        pawnPositions.add(new PawnPosition(54, 37)); //9 24
        pawnPositions.add(new PawnPosition(54, 30)); //10 25
        pawnPositions.add(new PawnPosition(54, 22)); //11 26
        pawnPositions.add(new PawnPosition(54, 14)); //12 27
        pawnPositions.add(new PawnPosition(54, 6)); //13 28
        pawnPositions.add(new PawnPosition(62, 6)); //14 29
        pawnPositions.add(new PawnPosition(70, 6)); //15 30
        pawnPositions.add(new PawnPosition(70, 14)); //16 31
        pawnPositions.add(new PawnPosition(70, 22)); //17 32
        pawnPositions.add(new PawnPosition(70, 30)); //18 33
        pawnPositions.add(new PawnPosition(70, 37)); //19 34
        pawnPositions.add(new PawnPosition(70, 45)); //20 35
        pawnPositions.add(new PawnPosition(70, 53)); //21 36
        pawnPositions.add(new PawnPosition(77, 53)); //22 37
        pawnPositions.add(new PawnPosition(85, 53)); //23 38
        pawnPositions.add(new PawnPosition(93, 53)); //24 39
        pawnPositions.add(new PawnPosition(101, 53)); //25 40
        pawnPositions.add(new PawnPosition(109, 53)); //26 41
        pawnPositions.add(new PawnPosition(116, 53)); //27 42
        pawnPositions.add(new PawnPosition(116, 61)); //28 43
        pawnPositions.add(new PawnPosition(116, 69)); //29 44
        pawnPositions.add(new PawnPosition(109, 69)); //30 45
        pawnPositions.add(new PawnPosition(101, 69)); //31 46
        pawnPositions.add(new PawnPosition(93, 69)); //32 47
        pawnPositions.add(new PawnPosition(85, 69)); //33 48
        pawnPositions.add(new PawnPosition(77, 69)); //34 49
        pawnPositions.add(new PawnPosition(70, 69)); //35 50
        pawnPositions.add(new PawnPosition(70, 76)); //36 51
        pawnPositions.add(new PawnPosition(70, 84)); //37 52
        pawnPositions.add(new PawnPosition(70, 92)); //38 53
        pawnPositions.add(new PawnPosition(70, 100)); //39 54
        pawnPositions.add(new PawnPosition(70, 107)); //40 55
        pawnPositions.add(new PawnPosition(70, 115)); //41 56
        pawnPositions.add(new PawnPosition(62, 115)); //42 57
        pawnPositions.add(new PawnPosition(54, 115)); //43 58
        pawnPositions.add(new PawnPosition(54, 107)); //44 59
        pawnPositions.add(new PawnPosition(54, 100)); //45 60
        pawnPositions.add(new PawnPosition(54, 92)); //46 61
        pawnPositions.add(new PawnPosition(54, 84)); //47 62
        pawnPositions.add(new PawnPosition(54, 76)); //48 63
        pawnPositions.add(new PawnPosition(54, 69)); //49 64
        pawnPositions.add(new PawnPosition(46, 69)); //50 65
        pawnPositions.add(new PawnPosition(39, 69)); //51 66
        pawnPositions.add(new PawnPosition(31, 69)); //52 67
        pawnPositions.add(new PawnPosition(23, 69)); //53 68
        pawnPositions.add(new PawnPosition(15, 69)); //54 69
        pawnPositions.add(new PawnPosition(7, 69)); //55 70
        pawnPositions.add(new PawnPosition(7, 61)); //56 71
        //Red win positions
        pawnPositions.add(new PawnPosition(15, 61)); //1 72
        pawnPositions.add(new PawnPosition(23, 61)); //2 73
        pawnPositions.add(new PawnPosition(31, 61)); //3 74
        pawnPositions.add(new PawnPosition(39, 61)); //4 75
        pawnPositions.add(new PawnPosition(46, 61)); //5 76
        //Green win positions
        pawnPositions.add(new PawnPosition(62, 14)); //1 77
        pawnPositions.add(new PawnPosition(62, 22)); //2 78
        pawnPositions.add(new PawnPosition(62, 30)); //3 79
        pawnPositions.add(new PawnPosition(62, 37)); //4 80
        pawnPositions.add(new PawnPosition(62, 45)); //5 81
        //Yellow win positions
        pawnPositions.add(new PawnPosition(62, 107)); //1 82
        pawnPositions.add(new PawnPosition(62, 100)); //2 83
        pawnPositions.add(new PawnPosition(62, 92)); //3 84
        pawnPositions.add(new PawnPosition(62, 84)); //4 85
        pawnPositions.add(new PawnPosition(62, 76)); //5 86
        //Blue win positions
        pawnPositions.add(new PawnPosition(109, 61)); //1 87
        pawnPositions.add(new PawnPosition(101, 61)); //2 88
        pawnPositions.add(new PawnPosition(93, 61)); //3 89
        pawnPositions.add(new PawnPosition(85, 61)); //4 90
        pawnPositions.add(new PawnPosition(77, 61)); //5 91

        return pawnPositions;
    }
}
