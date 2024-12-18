package com.example.registroapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent();
        /*
        TextView textView = findViewById(R.id.title);
        String htmlText = "<b>C</b>lass<b><i>T</i></b>rack";
        textView.setText(Html.fromHtml(htmlText, Html.FROM_HTML_MODE_LEGACY));

        */
    }
}