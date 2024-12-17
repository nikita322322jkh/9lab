package com.example.lab9;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionActivity extends AppCompatActivity {
    private int correctAnswerId = R.id.option3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

        Button option1 = findViewById(R.id.option1);
        Button option2 = findViewById(R.id.option2);
        Button option3 = findViewById(R.id.option3);
        Button option4 = findViewById(R.id.option4);

        View.OnClickListener listener = v -> {
            Button selectedOption = (Button) v;
            if (selectedOption.getId() == correctAnswerId) {
                Intent intent = new Intent(QuestionActivity.this, SuccessActivity.class);
                startActivity(intent);
            } else {
                selectedOption.setBackgroundColor(getResources().getColor(android.R.color.holo_red_light));
                Toast.makeText(this, "Неправильно!", Toast.LENGTH_SHORT).show();
            }
        };

        option1.setOnClickListener(listener);
        option2.setOnClickListener(listener);
        option3.setOnClickListener(listener);
        option4.setOnClickListener(listener);
    }
}