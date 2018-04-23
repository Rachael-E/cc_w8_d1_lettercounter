package com.example.rachael.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCountActivity extends AppCompatActivity {


    Counter counter;
    private EditText wordsToCount;
    private TextView resultField;
    private Button resultButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_count);

        wordsToCount = findViewById(R.id.editTextID);
        resultField = findViewById(R.id.textViewID);
        resultButton = findViewById(R.id.buttonID);
        counter = new Counter();

    }

    public void onResultsButtonClicked(View button) {

        String countedWords = wordsToCount.getText().toString();

        resultField.setText(counter.getWordCount(countedWords));

    }






















}
