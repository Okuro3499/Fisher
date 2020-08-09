package com.jade.fisher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextEmail;

    @BindView(R.id.viewProductsButton)Button mViewProductsButton;
    @BindView(R.id.loginButton) Button mLoginButton;
    @BindView(R.id.signUpButton) Button mSignUpButton;

    private AwesomeValidation awesomeValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        editTextEmail = (EditText) findViewById(R.id.editTextEmail);

        mLoginButton = (Button) findViewById(R.id.loginButton);

        mViewProductsButton.setOnClickListener(this);
        mLoginButton.setOnClickListener(this);
        mSignUpButton.setOnClickListener (this);

        awesomeValidation.addValidation(this, R.id.editTextEmail, Patterns.EMAIL_ADDRESS, R.string.emailerror);
    }

    @Override
    public void onClick(View v) {
        if (v == mViewProductsButton) {
            Intent intent = new Intent(MainActivity.this, ProductsActivity.class);
            startActivity(intent);
        }
        if (v == mLoginButton) {
            if (awesomeValidation.validate()){
                Intent intent = new Intent(MainActivity.this, ProductsActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
            }
        }
        if(v == mSignUpButton) {
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}