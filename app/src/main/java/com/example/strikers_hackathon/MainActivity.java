package com.example.strikers_hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button getStartedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spCountry = findViewById(R.id.country);
        ArrayAdapter<CharSequence>arrAdapter=ArrayAdapter.createFromResource(this, R.array.country, android.R.layout.simple_spinner_item);
        arrAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spCountry.setAdapter(arrAdapter);

        getStartedBtn = (Button) findViewById(R.id.GetStartedBtn);
        getStartedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                startActivity(intent);
            }
        });

    }
}