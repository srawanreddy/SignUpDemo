package com.example.sravanreddy.signupdemo;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner_main); //socket
        spinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, R.layout.spinner_layout,R.id.spinnerText, languages);
        spinner.setAdapter(arrayAdapter);
    }
    String[] languages = {"hindi","english","chinese","urdu"};
    public void clickHandler(View view) {
        switch(view.getId()){
            case R.id.signupButton:
                Intent signupIntent=new Intent(MainActivity.this, SignUp.class);
                startActivity(signupIntent);
                break;
            case R.id.loginButton:
                showDialog();
                break;
        }
    }

    private void showDialog() {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("No Action");
        alertDialog.setMessage("No action is defined for this button");
        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });
        alertDialog.show();
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
