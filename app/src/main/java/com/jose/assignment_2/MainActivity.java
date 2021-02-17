package com.jose.assignment_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    private Button recipe;
    private RadioButton radioButton,radioButton2,radioButton3,radioButton4,radioButton5;
    private RadioGroup radioGroup;
    String title = "tinola";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipe = findViewById(R.id.button);
        radioGroup = findViewById(R.id.radioGroup2);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        radioButton3 = findViewById(R.id.radioButton3);
        radioButton4 = findViewById(R.id.radioButton4);
        radioButton5 = findViewById(R.id.radioButton5);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.radioButton:
                        title = "tinola";
                        break;
                    case R.id.radioButton2:
                        title = "sinampalukang manok";
                        break;
                    case R.id.radioButton3:
                        title = "kare-kare";
                        break;
                    case R.id.radioButton4:
                        title = "afritada";
                        break;
                    case R.id.radioButton5:
                        title = "pakbet";
                        break;
                }
            }
        });

        recipe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Recipe.class);
                intent.putExtra("title",title);
                startActivity(intent);
                finish();
            }
        });

    }

}