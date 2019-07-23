package com.example.monirujjamanmusa.calculatebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private EditText editText1, editText2;
    private Button addButton, subButton;
    private Button multiButton, dividebutton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText1 = (EditText) findViewById(R.id.editText1Id);
        editText2 = (EditText) findViewById(R.id.editText2Id);


        addButton = (Button) findViewById(R.id.addbuttonId);
        subButton = (Button) findViewById(R.id.subbuttonId);
        multiButton = (Button) findViewById(R.id.mulbuttonId);
        dividebutton = (Button) findViewById(R.id.divbuttonId);


        resultTextView = (TextView) findViewById(R.id.resultTextViewId);

        addButton.setOnClickListener(this);
        subButton.setOnClickListener(this);
        multiButton.setOnClickListener(this);
        dividebutton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        try {
            //to bring input from User
            String number1 = editText1.getText().toString();
            String number2 = editText2.getText().toString();

            //convert string to Double
            double num1 = Double.parseDouble(number1);
            double num2 = Double.parseDouble(number2);

            if (v.getId() == R.id.addbuttonId) {
                double sum = num1 + num2;
                resultTextView.setText("Add Result: " + sum);

            }
            if (v.getId() == R.id.subbuttonId) {
                double sub = num1 - num2;
                resultTextView.setText("Substraction Result: " + sub);
            }
            if (v.getId() == R.id.mulbuttonId) {
                double sub = num1 * num2;
                resultTextView.setText("Multiple Result: " + sub);
            }
            if (v.getId() == R.id.divbuttonId) {
                double sub = num1 / num2;
                resultTextView.setText("Divition Result: " + sub);
            }
        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "Please Enter The number", Toast.LENGTH_SHORT).show();
        }
    }
}