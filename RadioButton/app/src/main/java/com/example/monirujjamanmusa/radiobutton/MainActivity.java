package com.example.monirujjamanmusa.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.monirujjamanmusa.radiobutton.R.id.radioGroupId;
import static com.example.monirujjamanmusa.radiobutton.R.id.resultTextViedId;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private Button showbutton;
    private RadioButton genderButton;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioGroup=(RadioGroup) findViewById(R.id.radioGroupId);
        showbutton=(Button)findViewById(R.id.showbuttonId);
        resultTextView =(TextView) findViewById(R.id.resultTextViedId);


        showbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             int selectedId = radioGroup.getCheckedRadioButtonId();
             genderButton=(RadioButton) findViewById(selectedId);
            String value= genderButton.getText().toString();
            resultTextView.setText("Selected Button is "+value);
            }
        });




    }
}
