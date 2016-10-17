package com.elysium.activitiesandintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InputActivity extends AppCompatActivity {

    private EditText mNoun1;
    private EditText mNoun2;
    private EditText mAdjective1;
    private EditText mAdjective2;
    private EditText mAnimal;
    private EditText mGame;
    private Button mSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        mNoun1 = (EditText) findViewById(R.id.Noun1);
        mNoun2 = (EditText) findViewById(R.id.Noun2);
        mAdjective1 = (EditText) findViewById(R.id.Adjective1);
        mAdjective2 = (EditText) findViewById(R.id.Ajdective2);
        mAnimal = (EditText) findViewById(R.id.Animal);
        mGame = (EditText) findViewById(R.id.Game);

        mSubmit = (Button) findViewById(R.id.Submit);

        mSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputActivity.this, ResultActivity.class);
                startActivity(intent);
            }
        });
}}
