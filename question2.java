package com.example.periodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question2 extends AppCompatActivity implements View.OnClickListener {

    Button submitBtn2;
    TextView question;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    int age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        submitBtn2 = findViewById(R.id.submit_btn2);
        submitBtn2.setEnabled(true);
        submitBtn2.setOnClickListener(this);

        //this one too!
        // alao change it to R.id.XXXXX
        // where XXXXX is the editview ID in the XML file
        question = findViewById(R.id.editTextTextPersonName);
    }

    @Override
    public void onClick(View view){
        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn2)
        {
            //this one mira
            selectedAnswer = question.getText().toString();
            age = Integer.parseInt(selectedAnswer);



            System.out.println("MIRA" + selectedAnswer);

            startActivity(new Intent(question2.this, question3.class));}
        else{
            //choices button clicked
            //selectedAnswer = clickedButton.getText().toString();
            selectedAnswer = question.getText().toString();
            clickedButton.setBackgroundColor(Color.parseColor("#B1D0D2"));
        }
    }

}