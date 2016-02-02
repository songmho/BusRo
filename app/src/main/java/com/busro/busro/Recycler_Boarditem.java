package com.busro.busro;

/**
 * Created by 최정환 on 2016-02-02.
 */
public class Recycler_Boarditem {
    int boardtext,boardtext1,boardtext2,boardtext3,boardtext5;
    int boardthumbsup,boardchat;
    String boardtext4;

    int getBoardtext() {return this.boardtext;}
    int getBoardtext1() {return this.boardtext1;}
    int getBoardtext2() {return this.boardtext2;}
    int getBoardtext3() {return this.boardtext3;}
    int getBoardtext5() {return this.boardtext5;}
    int getBoardthumbsup() {return this.boardthumbsup;}
    int getBoardchat() {return this.boardchat;}
    String getBoardtext4() {return this.boardtext4;}

    Recycler_Boarditem(int boardtext,int boardthumbsup,int boardtext1,int boardchat,int boardtext2, int boardtext3, String boardtext4,int boardtext5){
        this.boardtext=boardtext;
        this.boardthumbsup=boardthumbsup;
        this.boardtext1=boardtext1;
        this.boardchat=boardchat;
        this.boardtext2=boardtext2;
        this.boardtext3=boardtext3;
        this.boardtext4=boardtext4;
        this.boardtext5=boardtext5;
    }
}
