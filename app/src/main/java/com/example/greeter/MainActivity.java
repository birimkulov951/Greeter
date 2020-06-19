package com.example.greeter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void greet(View view) {

        TextView editText = (TextView) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);

        if (editText.getText().equals("") || editText.getText() == null){

            toastShow("Please input your name and surname...");

        } else {

            textView.setText("Hello, " + editText.getText().toString() + "!");

        }
    }

    private void toastShow (String message) {

        Context context = getApplicationContext();

        Toast toast = Toast.makeText(context, message, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM|Gravity.CENTER, 0, 0);
        toast.show();

    }
}