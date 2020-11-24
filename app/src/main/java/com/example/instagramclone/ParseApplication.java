package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // Register your own parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("CxQc93FNKPgklzdFrEIo1tKIRozoHVFqf9TzhVXm")
                .clientKey("Lsz85Sx9CxmEoHDRdJ8qDmYT1BYJyRXMtpCjsTEm")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}