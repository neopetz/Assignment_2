package com.jose.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Recipe extends AppCompatActivity {

    private TextView title,recipe;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        title = findViewById(R.id.textView);
        recipe = findViewById(R.id.textView2);
        back = findViewById(R.id.button2);

        Bundle bundle = getIntent().getExtras();
        assert bundle != null;
        String getTitle = bundle.getString("title");

        title.setText(""+getTitle);

        switch (getTitle){
            case "tinola":
                recipe.setText(R.string.tinola);
                break;
            case "sinampalukang manok":
                recipe.setText(R.string.sinampalukang_manok);
                break;
            case "kare-kare":
                recipe.setText(R.string.kare_kare);
                break;
            case "afritada":
                recipe.setText(R.string.afritada);
                break;
            case "pakbet":
                recipe.setText(R.string.pakbet);
                break;
        }


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Recipe.this,MainActivity.class));
                finish();
            }
        });


    }
}