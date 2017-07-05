package com.example.offline.zigbeehomeautomation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Sensor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor);
    }
    public void motion(android.view.View view)
    {
        Intent intent = new Intent(Sensor.this, Motion_Sensor.class);
        startActivity(intent);
    }
    public void Temerature(android.view.View view)
    {
        Intent intent = new Intent(Sensor.this, Temperature_Sensor.class);
        startActivity(intent);
    }

}
