package com.example.clarkhinchcliff.timerdemo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                //code to be run every second
                Log.i("Runnable has run", "One second passed");
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(run);
    }
}
