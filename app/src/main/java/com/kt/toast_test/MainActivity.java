package com.kt.toast_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.kt.toster.CustomToast;

public class MainActivity extends AppCompatActivity {
    EditText text;
    Button btn;
    private CustomToast customToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.getTextId);
        btn = findViewById(R.id.click);
        btn.setOnClickListener(view -> {
            CustomToast.generateToast(this,text.getText().toString());
        });

    }


}