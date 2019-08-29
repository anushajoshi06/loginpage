package com.example.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public void buttonClicked(View view){
    EditText myeditText = (EditText) findViewById(R.id.myeditText);
    EditText myeditText2 = (EditText) findViewById(R.id.myeditText2);
    Log.i("username", myeditText.getText().toString());
    Log.i("password", myeditText2.getText().toString());
}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
