package com.example.firstapp;



import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {
//Change 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}