package com.example.periodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class question4 extends AppCompatActivity implements View.OnClickListener {


    Button submitBtn4;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    TextView question;
    int ND;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        submitBtn4 = findViewById(R.id.submit_btn4);
        submitBtn4.setEnabled(true);

        submitBtn4.setOnClickListener(this);
        question = findViewById(R.id.editTextTextPersonName);
    }

    @Override
    public void onClick(View view){
        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn4)
        {
            selectedAnswer = question.getText().toString();
            ND = Integer.parseInt(selectedAnswer);

            startActivity(new Intent(question4.this, results.class));
        }
        else{
            //choices button clicked
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.parseColor("#B1D0D2"));
        }
    }

}