package com.busro.busro;

/**
 * Created by 최정환 on 2016-02-02.
 */
public class Recycler_Boarditem {
    int boardthumbsuptext,boardchattext,boardhitstext,boardthumbsup,boardchat;
    String boardtext,boardnickname,boardhits;

    String getBoardtext() {return this.boardtext;}
    int getBoardthumbsup() {return this.boardthumbsup;}
    int getBoardthumbsuptext() {return this.boardthumbsuptext;}
    int getBoardchat() {return this.boardchat;}
    int getBoardchattext() {return this.boardchattext;}
    String getBoardnickname() {return this.boardnickname;}
    int getBoardhitstext() {return this.boardhitstext;}
    String getBoardhits() {return this.boardhits;}


    Recycler_Boarditem(String boardtext,int boardthumbsup,int boardthumbsuptext,int boardchat,int boardchattext, String boardnickname, String boardtext4,int boardhitstext){
        this.boardtext=boardtext;
        this.boardthumbsuptext=boardthumbsuptext;
        this.boardchattext=boardchattext;
        this.boardnickname=boardnickname;
        this.boardhits=boardhits;
        this.boardhitstext=boardhitstext;
        this.boardthumbsup=boardthumbsup;
        this.boardchat=boardchat;
    }
}
