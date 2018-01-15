package com.example.mravi.collapsingtoolbar;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.example.mravi.collapsingtoolbar.branch.CseActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private CardView bankCard,ideasCard,addCard,linksCard,wifiCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }

    public void go(View view){
        Toast.makeText(this, "hello clicked", Toast.LENGTH_SHORT).show();

        Intent i=new Intent(MainActivity.this,CseActivity.class);
        startActivity(i);
    }


    @Override
    public void onClick(View view) {

    }
}
