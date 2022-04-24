package com.example.android.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class MainActivity<LIST> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readMacroData();
    }

    private List<MacroSample> MacroSamples = new ArrayList<>();
    private void readMacroData() {
        InputStream is = getResources().openRawResource(R.raw.macro1);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(is, Charset.forName("UTF-8"))
        );

        String line = " ";
        try {
            while ( (line = reader.readLine()) != null) {
                // Split by ','
                String[] tokens = line.split(",");

                // Read the data
                MacroSample sample = new MacroSample();
                sample.setYear(Integer.parseInt(tokens[0]));
                sample.setChina(tokens[1]);
                sample.setIndia(tokens[2]);
                sample.setUSA(tokens[3]);
                MacroSamples.add(sample);

                Log.d("MyActivity", "Just created: " + sample);
            }
        } catch (IOException e) {
            Log.wtf("MyActivity", "Error reading data file on line" + line, e);
            e.printStackTrace();
        }
    }
}

