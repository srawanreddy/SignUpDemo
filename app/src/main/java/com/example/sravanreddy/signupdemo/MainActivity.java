package com.example.sravanreddy.signupdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickHandler(View view) {
        switch(view.getId()){
            case R.id.signupButton:
                Intent signupIntent=new Intent(MainActivity.this, SignUp.class);
                startActivity(signupIntent);
                break;
            case R.id.userNameEditText:

                break;
        }
    }
}
