package com.example.recipeapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DeleteRecipe extends AppCompatActivity {
    EditText e;
    AppCompatButton b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_delete_recipe);
            e = (EditText) findViewById(R.id.rdtitle);
            b = (AppCompatButton) findViewById(R.id.b2btn);
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"No Recipe Entered to be deleted", Toast.LENGTH_SHORT).show();
        }
    }}