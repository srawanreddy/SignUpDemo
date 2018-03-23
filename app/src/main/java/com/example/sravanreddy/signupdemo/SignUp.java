package com.example.sravanreddy.signupdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
    EditText firstName;
    EditText middleName;
    EditText lastName;
    EditText emailId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

    }

    public void signupClickHadler(View view) {
        switch(view.getId()){
            case R.id.back_Button:
                Intent backIntent=new Intent(SignUp.this, MainActivity.class);
                startActivity(backIntent);
                break;
            case R.id.sumbit_button:
                firstName=findViewById(R.id.firstNameEditText);
                middleName=findViewById(R.id.middlename_EditText);
                lastName=findViewById(R.id.lastname_EditText);
                emailId=findViewById(R.id.email_EditText);
                Intent signupIntent=new Intent(SignUp.this, LoginConformation.class);
                String firstname=firstName.getText().toString();
                signupIntent.putExtra(Constants.firstnameKey,firstname );
               signupIntent.putExtra(Constants.middlenameKey, middleName.getText().toString());
                signupIntent.putExtra(Constants.lastnameKey, lastName.getText().toString());
                signupIntent.putExtra(Constants.emailidKey, emailId.getText().toString());
                startActivity(signupIntent);
                break;
            case R.id.firstNameEditText:

                break;
            case R.id.middlename_EditText:

                break;
            case R.id.lastname_EditText:
                                break;
            case R.id.email_EditText:

                break;
        }
    }
}
