package com.example.locationtracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    private ImageButton btnCircle;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       textView = (TextView) findViewById(R.id.text);
       textView.setMovementMethod(LinkMovementMethod.getInstance());

        this.setTitle("Tracker");

        btnCircle = findViewById(R.id.btn_circle);
        textView = findViewById(R.id.text);

        btnCircle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Toast.makeText(HomeActivity.this,"Circle Button Clicked..",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
