package com.example.twoactivities_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.twoactivities_lifecycle.MESSAGE";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void addItem (View view) {
        Intent replyIntent=new Intent();
        String message=((Button)view).getText().toString();
        replyIntent.putExtra(EXTRA_MESSAGE, message);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}