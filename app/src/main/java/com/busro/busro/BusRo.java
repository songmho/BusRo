package com.busro.busro;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;

/**
 * Created by songmho on 2016-02-26.
 */
public class BusRo extends Application{
    String APPLICATION_ID = "FzKIMyQ9z9FiHhi5aqWrs6IkGjcNQoXly8lEIhSo";
    String CLIENT_KEY = "MfIxhmUjPwNxe4iDku6dC96QrAyhhwMzWfGRx2gR";
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(this, APPLICATION_ID, CLIENT_KEY);
        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
