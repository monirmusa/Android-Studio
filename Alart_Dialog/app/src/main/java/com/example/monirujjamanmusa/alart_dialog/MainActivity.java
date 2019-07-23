package com.example.monirujjamanmusa.alart_dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private Button exitbutton;
   private AlertDialog.Builder alertDialogBuilder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exitbutton=(Button)findViewById(R.id.buttonId);
        exitbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        alertDialogBuilder=new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setTitle(R.string.alart_text);

        alertDialogBuilder.setMessage(R.string.message_text);

        alertDialogBuilder.setIcon(R.drawable.questionbar);


        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
             finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You Have Clicked No Button",Toast.LENGTH_SHORT).show();
            }
        });
        alertDialogBuilder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"You Have Clicked Cancel Button",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog  alartDialog= alertDialogBuilder.create();
        alertDialogBuilder.show();




    }
}
