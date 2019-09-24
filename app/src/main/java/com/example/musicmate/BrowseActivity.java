package com.example.musicmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class BrowseActivity extends AppCompatActivity {
    TextView tv;

    String nameValue ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
        tv.findViewById(R.id.textView);

        nameValue = getIntent().getExtras().getString("Value");
        tv.setText(nameValue);

    }
}
