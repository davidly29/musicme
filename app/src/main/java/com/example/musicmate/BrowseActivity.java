package com.example.musicmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BrowseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        Intent intent = getIntent();
        String nameValue = intent.getStringExtra("Name");
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(nameValue);

    }
}
