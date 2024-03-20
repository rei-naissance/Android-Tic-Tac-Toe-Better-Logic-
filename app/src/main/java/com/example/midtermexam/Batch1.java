package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Batch1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batch1);

        Button btn = (Button) findViewById(R.id.batch1);

        btn.setOnClickListener(v -> {
            Intent scene = new Intent(Batch1.this, MainActivity.class);
            startActivity(scene);

            Toast.makeText(this, "Philippe Dael, Tic Tac Toe Batch 1", Toast.LENGTH_SHORT).show();
        });
    }
}