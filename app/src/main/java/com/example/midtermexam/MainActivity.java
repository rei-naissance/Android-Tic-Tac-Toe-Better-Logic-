package com.example.midtermexam;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private boolean isX;
    private List<Button> btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        handleLogic();
    }

    private void handleLogic(){
        isX = false;
        btns = new ArrayList<>();
        TextView playerText = findViewById(R.id.playerTurn);
        playerText.setText("Player O's turn");
        LinearLayout parent = findViewById(R.id.parent);
        parent.setBackgroundColor(Color.BLUE);
        for(int i = 0; i  < parent.getChildCount(); i++){
            LinearLayout rows = (LinearLayout) parent.getChildAt(i);
            for(int j = 0; j < rows.getChildCount(); j++){
                Button btn = (Button) rows.getChildAt(j);

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //x - red
                        //o - blue
                        if(!btns.contains(btn)){
                            if(isX){
                                parent.setBackgroundColor(Color.BLUE);
                                btn.setText("X");
                                playerText.setText("Player O's turn");
                                isX = false;
                            }else{
                                parent.setBackgroundColor(Color.RED);
                                btn.setText("O");
                                playerText.setText("Player X's turn");
                                isX = true;
                            }
                            btns.add(btn);
                        }
                    }
                });
            }
        }

    }
}