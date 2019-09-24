package com.example.musicmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button goToSecond;
    String name;

    EditText username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        goToSecond = (Button) findViewById(R.id.button);
        username = (EditText) findViewById(R.id.username);


        goToSecond.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, BrowseActivity.class);
            name = username.getText().toString();
            intent.putExtra("Name", name);
            startActivity(intent);
         }
        }


        );
    }

}
