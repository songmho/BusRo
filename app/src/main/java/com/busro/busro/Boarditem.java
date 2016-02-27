package com.busro.busro;

/**
 * Created by 최정환 on 2016-02-02.
 */
public class Boarditem {
    int boardthumbsuptext,boardchattext,boardhitstext;
    String boardtext,boardnickname;

    String getBoardtext() {return this.boardtext;}
    int getBoardthumbsuptext() {return this.boardthumbsuptext;}
    int getBoardchattext() {return this.boardchattext;}
    String getBoardnickname() {return this.boardnickname;}
    int getBoardhitstext() {return this.boardhitstext;}


    Boarditem(String boardtext, int boardthumbsuptext, int boardchattext, String boardnickname, int boardhitstext){
        this.boardtext=boardtext;
        this.boardthumbsuptext=boardthumbsuptext;
        this.boardchattext=boardchattext;
        this.boardnickname=boardnickname;
        this.boardhitstext=boardhitstext;
    }
}
