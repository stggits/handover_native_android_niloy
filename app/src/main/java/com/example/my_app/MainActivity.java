package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editTextText);
        editText2 = findViewById(R.id.editTextText2);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            // TODO: Do button click operations
        });
    }

}