package com.example.bred;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Scanner;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void startNotesActivity(View V) {
        Intent intent = new Intent(this, NotesActivity.class);
        startActivity(intent);
    }


    /*public static void  main(String[] listPlans){
        Scanner console = new Scanner(System.in);
        int size = 500;
        String listPlans[] = new String[size];
        for (int i = 0; i < size; i++) {
            listPlans[i] = console.nextLine();
            }
        for (int i = 0; i < size; i++){
            System.out.println(" " + listPlans[i]);
            }
        } */
    }

