package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Initialize Crash Reporting.
    ParseCrashReporting.enable(this);

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

   // ParseObject.registerSubclass(Meal.class);

    // Add your initialization code here
    //Parse.initialize(this);
    Parse.initialize(this, "Ah3KfyXs6HmCWrV5QVBNU2JAkkJTxkXUDz3aJoo1", "mKRGzKflnx7WuVKICQIdSLiHdDiKLuqSOZ1KPnx8");


    ParseUser.enableAutomaticUser();
    ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    // defaultACL.setPublicReadAccess(true);
    ParseACL.setDefaultACL(defaultACL, true);
  }
}
