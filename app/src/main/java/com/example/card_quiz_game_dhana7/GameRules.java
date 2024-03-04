package com.example.card_quiz_game_dhana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class GameRules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_rules);
        getSupportActionBar().hide();
    }

    public void startQuiz(View view) {
        //If the user clicks on Start
        Intent i = new Intent(this, Quiz.class);
        startActivity(i);
    }

    public void ViewStats(View view){
        //If the user clicks on View Previous Scores
        Intent i = new Intent(this, ScoreStats.class);
        startActivity(i);
    }
}

