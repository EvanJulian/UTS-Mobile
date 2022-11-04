package com.example.aplikasi_empat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnAnonymous;
    private Button btnInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAnonymous = findViewById(R.id.button2);
        btnInterface = findViewById(R.id.button3);

        btnAnonymous.setOnClickListener(view -> Toast.makeText(this, getResources().getString(R.string.output_anonymous), Toast.LENGTH_SHORT).show());
        btnInterface.setOnClickListener(this);
    }

    public void helloOnClick(View view) {
        Toast.makeText(this, getResources().getString(R.string.output_on_click), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, getResources().getString(R.string.output_implement), Toast.LENGTH_SHORT).show();
    }
}