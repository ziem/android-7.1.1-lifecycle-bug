package com.example.lifecycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class NavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intentOut = new Intent(this, MainActivity.class);
        intentOut.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intentOut.setFlags(intentOut.getFlags() | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        Log.i(App.TAG, "startActivity: NavigationActivity");
        startActivity(intentOut);
        Log.i(App.TAG, "finish: NavigationActivity");
        finish();
    }
}
