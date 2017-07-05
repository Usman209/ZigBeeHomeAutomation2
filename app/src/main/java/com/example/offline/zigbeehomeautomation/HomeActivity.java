package com.example.offline.zigbeehomeautomation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import static com.example.offline.zigbeehomeautomation.R.styleable.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
     @Override
        public boolean  onCreateOptionsMenu  (Menu menu){
            getMenuInflater().inflate(R.menu.main,menu);
         return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        int id=item.getItemId();
        if (id==R.id.about){

            Intent aboutintent=new Intent(HomeActivity.this,About.class);
            startActivity(aboutintent);

            return true;
        }
        return  true;
    }






    public void sendMessage(android.view.View view)
    {
        Intent intent = new Intent(HomeActivity.this, Fan.class);
        startActivity(intent);
    }
    public void light(android.view.View view)
    {
        Intent intent = new Intent(HomeActivity.this, Light.class);
        startActivity(intent);
    }
    public void sensor(android.view.View view)
    {
        Intent intent = new Intent(HomeActivity.this, Sensor.class);
        startActivity(intent);
    }


}
