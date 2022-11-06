package com.example.periodapp;

import java.util.Locale;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
public class QuestionAnswer {
    // creating a variable for our
    // Firebase Database.
    FirebaseDatabase firebaseDatabase;

    // creating a variable for our Database
    // Reference for Firebase.
    DatabaseReference databaseReference;


    public static String question[] = {
            "What menstrual product do you use the most?",
            "What is your age?",
            "How many periods do you have in a year?",
            "How many days does your period usually last?"
    };

    public static String choices[][] = {
            {"Pads","Tampons","Menstrual cup / disc", "Menstrual underwear"},{"this is a test", "this is also a test", "and this is the third test", "and this is th fourth test"},{"1", "2", "3", "4"}
    };

    public static String correctAnswers[] = {
            "Pads", "Tampons", "Menstrual cup / disc", "Menstrual underwear"
    };
}
