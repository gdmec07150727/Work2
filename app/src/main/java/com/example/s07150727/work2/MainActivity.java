package com.example.s07150727.work2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate() called with:"+"我创建了");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart() called with:"+"我开始了");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume() called with:"+"我走到前台了");
    }

    @Override
    protected void onStop() {
        Log.d(TAG,"onStop() called with:"+"我被挡住了");
        super.onStop();

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause() called with:"+"我失去了控制权");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}
