package com.example.monirujjamanmusa.checkboxaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox milkCheckbox,sugarCheckbox, waterCheckbox;
    private Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milkCheckbox=(CheckBox)findViewById(R.id.milkCheckboxId);
        sugarCheckbox=(CheckBox)findViewById(R.id.sugerCheckboxId);
        waterCheckbox=(CheckBox)findViewById(R.id.waterCheckboxId);

        showButton=(Button)findViewById(R.id.showButtonId);
        resultTextView=(TextView)findViewById(R.id.resultViewId);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if (milkCheckbox.isChecked()) {
                    String value = milkCheckbox.getText().toString();
                    stringBuilder.append(value + "is Ordered\n");
                }


                if (sugarCheckbox.isChecked()) {
                    String value = sugarCheckbox.getText().toString();
                    stringBuilder.append(value + "is Ordered\n");
                }
                if (waterCheckbox.isChecked()) {
                    String value = waterCheckbox.getText().toString();
                    stringBuilder.append(value + "is Ordered\n");
                }


                resultTextView.setText(stringBuilder);


            }  });



    }
}
