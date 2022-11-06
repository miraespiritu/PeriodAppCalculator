package com.example.periodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class question3 extends AppCompatActivity implements View.OnClickListener {






    Button submitBtn3;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    TextView question;
    int NY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question3);
        submitBtn3 = findViewById(R.id.submit_btn3);
        submitBtn3.setEnabled(true);

        submitBtn3.setOnClickListener(this);
        question = findViewById(R.id.editTextTextPersonName);
    }

    @Override
    public void onClick(View view){
        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn3)
        {
            selectedAnswer = question.getText().toString();
            NY = Integer.parseInt(selectedAnswer);
            startActivity(new Intent(question3.this, question4.class));}
        else{
            //choices button clicked
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.parseColor("#B1D0D2"));
        }
    }

}