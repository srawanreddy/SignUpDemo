package com.example.sravanreddy.signupdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignUp extends AppCompatActivity implements View.OnFocusChangeListener {
    EditText firstName;
    EditText middleName;
    EditText lastName;
    EditText emailId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        firstName = (EditText) findViewById(R.id.firstNameEditText);
        middleName=(EditText)findViewById(R.id.middlename_EditText);
        lastName=(EditText)findViewById(R.id.lastname_EditText);
        emailId = findViewById(R.id.email_EditText);
        firstName.setOnFocusChangeListener(this);

    }

    public void signupClickHadler(View view) {
        switch (view.getId()) {
            case R.id.back_Button:
                Intent backIntent = new Intent(SignUp.this, MainActivity.class);
                startActivity(backIntent);
                break;
            case R.id.sumbit_button:


                Intent signupIntent = new Intent(SignUp.this, LoginConformation.class);

                signupIntent.putExtra(Constants.firstnameKey, firstName.getText().toString());
                signupIntent.putExtra(Constants.middlenameKey, middleName.getText().toString());
                signupIntent.putExtra(Constants.lastnameKey, lastName.getText().toString());
                signupIntent.putExtra(Constants.emailidKey, emailId.getText().toString());
                startActivity(signupIntent);
                break;

        }
    }

    @Override
    public void onFocusChange(View view, boolean isFocused) {
                if (isFocused)
                    Toast.makeText(this, "Focused", Toast.LENGTH_SHORT).show();
                else if (!isFocused)
                    Toast.makeText(this, "Lost Focus", Toast.LENGTH_SHORT).show();

    }
}
