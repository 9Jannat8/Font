package com.example.font;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView2, textView3;

    private Typeface typeface2, typeface3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView2 = findViewById(R.id.textId2);
        textView3 = findViewById(R.id.textId3);

        typeface2 = Typeface.createFromAsset(getAssets(), "fonts/Rubik_Bold.ttf");
        textView2.setTypeface(typeface2);

        typeface3 = Typeface.createFromAsset(getAssets(), "fonts/Rubik_Italic.ttf");
        textView3.setTypeface(typeface3);
    }
}