package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PolicyActivity extends AppCompatActivity {

    private TextView currentPol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policy);
        currentPol = findViewById(R.id.current);
        Intent intent = getIntent();
        String calculations = intent.getStringExtra("textKey");
        currentPol.setText(calculations);

    }

    public void finishAffinityClick(View view) {
        finishAffinity();
    }
}