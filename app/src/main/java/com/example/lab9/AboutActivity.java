package com.example.lab9;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    private Button exitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        exitButton = findViewById(R.id.exitButton);
        exitButton.setOnClickListener(v -> {
            new AlertDialog.Builder(this)
                    .setTitle("Выход")
                    .setMessage("Вы хотите выйти из приложения?")
                    .setPositiveButton("Да", (dialogInterface, i) -> {
                        finishAffinity();
                        System.exit(0);
                    })
                    .setNegativeButton("Нет", null)
                    .show();
        });
    }
}
