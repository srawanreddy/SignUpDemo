package com.example.sravanreddy.signupdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginConformation extends AppCompatActivity {

TextView fullname;
TextView emailId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_conformation);
        fullname=findViewById(R.id.firstname_print);
        emailId=findViewById(R.id.email_print);
        fullname.setText(getIntent().getExtras().getString(Constants.firstnameKey)+" "+getIntent().getExtras().getString(Constants.middlenameKey)+" "+getIntent().getExtras().getString(Constants.lastnameKey), TextView.BufferType.NORMAL);
        emailId.setText(getIntent().getExtras().getString(Constants.emailidKey));
    }

    public void clickHandlerConfirmation(View view) {
        switch (view.getId()){
            case R.id.backconfrim_Button:
                Intent backConfirmIntent=new Intent(LoginConformation.this, SignUp.class);
                startActivity(backConfirmIntent);
                break;
            case R.id.confirm_Button:
                Intent confirmIntent=new Intent(LoginConformation.this, MainActivity.class);
                startActivity(confirmIntent);
                break;
        }
    }
}
