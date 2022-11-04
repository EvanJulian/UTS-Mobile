package com.example.aplikasi_pertama;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtOutput = findViewById(R.id.textView2);
    }

    public void randomize(View view) {
        Random random = new Random();
        txtOutput.setText(String.valueOf(random.nextInt(2_000) +1));
    }
}