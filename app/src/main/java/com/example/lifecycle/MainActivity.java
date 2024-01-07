package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate method called", Toast.LENGTH_SHORT).show();
        System.out.println("on create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "OnStart method called", Toast.LENGTH_SHORT).show();
        System.out.println("on start");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "OnResume method called", Toast.LENGTH_SHORT).show();
        System.out.println("on resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "OnPause method called", Toast.LENGTH_SHORT).show();
        System.out.println("on pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "OnStop method called", Toast.LENGTH_SHORT).show();
        System.out.println("on stop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "OnRestart method called", Toast.LENGTH_SHORT).show();
        System.out.println("on restart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "OnDestroy method called", Toast.LENGTH_SHORT).show();
        System.out.println("on destroy");

    }
}
