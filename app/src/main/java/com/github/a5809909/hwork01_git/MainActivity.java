package com.github.a5809909.hwork01_git;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String LOG = "MainActivity"; ;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //main code
        //Create new feature_1
        //Create new feature 2
        //Super NEW Feature 2
        //After Stash text
        //After Stash text
        //After Stash text
        //Stash text
        // before STASH2



        // NEW STASH TEXT FROM REMOTE GIT
        // NEW STASH TEXT FROM REMOTE GIT
        Log.d(LOG, "onCreate is called");

        System.out.println("New feature_3 detected!");
    }
}
