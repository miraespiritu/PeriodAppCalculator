package com.example.periodapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA, ansB, ansC, ansD;
    Button submitBtn;

    int score=0;
    int totalQuestion = QuestionAnswer.question.length;
    int currentQuestionIndex = 0;
    String selectedAnswer = "";
    int MP =0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        totalQuestionsTextView = findViewById(R.id.total_questions);
        questionTextView = findViewById(R.id.question);
        ansA = findViewById(R.id.Pads);
        ansB = findViewById(R.id.Tampons);
        ansC = findViewById(R.id.MenstrualCupsDiscs);
        ansD = findViewById(R.id.MenstrualUnderwear);
        submitBtn = findViewById(R.id.submit_btn);


        ansA.setOnClickListener(this);
        ansB.setOnClickListener(this);
        ansC.setOnClickListener(this);
        ansD.setOnClickListener(this);
        submitBtn.setOnClickListener(this);

        totalQuestionsTextView.setText("Total questions "+totalQuestion);
       // loadNewQuestion();

        submitBtn.setEnabled(true);
    }

    @Override
    public void onClick(View view){

        ansA.setBackgroundColor(Color.WHITE);
        ansB.setBackgroundColor(Color.WHITE);
        ansC.setBackgroundColor(Color.WHITE);
        ansD.setBackgroundColor(Color.WHITE);

        Button clickedButton = (Button) view;
        if(clickedButton.getId()==R.id.submit_btn)
        {
            System.out.println("MIRA" + selectedAnswer);
            switch(selectedAnswer)
            {
                case "pads":
                    MP = 6;
                    break;
                case "tampons":
                    MP = 7;
                    break;
                case "Menstrual cups / discs":
                    MP = 25;
                    break;
                case "Menstrual Underwear":
                    MP = 35;
                    break;
                default:
                    break;

            }
// getting text from our edittext fields.
            //String MP = Button.getText().toString();



            startActivity(new Intent(MainActivity.this, question2.class));}
        else{
            //choices button clicked
            selectedAnswer = clickedButton.getText().toString();
            clickedButton.setBackgroundColor(Color.parseColor("#B1D0D2"));
        }
    }

}
