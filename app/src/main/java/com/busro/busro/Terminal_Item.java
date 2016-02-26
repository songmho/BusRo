package com.busro.busro;

/**
 * Created by 은별 on 2016-02-02.
 */
public class Terminal_Item {
    String terminal;
    String url;
    String phone;

    String getTerminal(){
        return this.terminal;
    }
    String getPhone(){return this.phone;}
    String getUrl(){return this.url;}

    Terminal_Item(String terminal, String map_url, String phone){
        this.terminal = terminal;
        this.url=map_url;
        this.phone=phone;
    }
}
