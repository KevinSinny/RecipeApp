package com.example.recipeapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SearchRecipe extends AppCompatActivity {
    EditText e;
    AppCompatButton b;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_search_recipe);
        e = (EditText) findViewById(R.id.rstitle);
        b = (AppCompatButton) findViewById(R.id.b2btn);
        b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        String getTitle=e.getText().toString();
                        Toast.makeText(getApplicationContext(),getTitle,Toast.LENGTH_SHORT).show();
                    }
                    catch(Exception e)
                    {
                        Toast.makeText(getApplicationContext(),"Enter the inputs",Toast.LENGTH_SHORT).show();
                    }
                }
    });}
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"No Recipe Entered to be Searched", Toast.LENGTH_SHORT).show();
        }
}}