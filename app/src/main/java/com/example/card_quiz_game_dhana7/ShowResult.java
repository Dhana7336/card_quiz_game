package com.example.card_quiz_game_dhana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShowResult extends AppCompatActivity {

    int curr_score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_result);
        getSupportActionBar().hide();

        Button btnScore = (Button)findViewById(R.id.btnStat);
        Bundle bundle = getIntent().getExtras();

        // Get the current score from the bundle
        if(bundle != null){
            curr_score = bundle.getInt("current_score");
        }

        btnScore.setText(String.valueOf(curr_score));
    }

    public void ViewPrevious(View view){
        Intent i = new Intent(this, ScoreStats.class);
        startActivity(i);
    }
    public void GoBack(View view){
        Intent i = new Intent(this, GameRules.class);
        startActivity(i);
    }
}