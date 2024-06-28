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

public class AddRecipe extends AppCompatActivity {
    EditText e1,e2,e3;
    AppCompatButton b1,b2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.activity_add_recipe);
            e1 = (EditText) findViewById(R.id.rtitle);
            e2 = (EditText) findViewById(R.id.rdesc);
            e3 = (EditText) findViewById(R.id.rprep);
            b1 = (AppCompatButton) findViewById(R.id.submit);
            b2 = (AppCompatButton) findViewById(R.id.b2btn);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    try {
                        String getTitle=e1.getText().toString();
                        String getdesc=e2.getText().toString();
                        String getprep=e3.getText().toString();
                        Toast.makeText(getApplicationContext(),getTitle+" "+getdesc+" "+getprep+" ",Toast.LENGTH_SHORT).show();
                    }
                    catch(Exception e)
                    {
                        Toast.makeText(getApplicationContext(),"Enter the inputs",Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        catch(Exception e)
        {
            Toast.makeText(getApplicationContext(),"No Recipe Entered", Toast.LENGTH_SHORT).show();
        }
    }
}