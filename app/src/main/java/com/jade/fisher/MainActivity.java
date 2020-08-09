package com.jade.fisher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.viewProductsButton)Button mViewProductsButton;
    @BindView(R.id.loginButton) Button mLoginButton;
    @BindView(R.id.signUpButton) Button mSignUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mViewProductsButton.setOnClickListener(this);
        mLoginButton.setOnClickListener(this);
        mSignUpButton.setOnClickListener (this);
    }

    @Override
    public void onClick(View v) {
        if (v == mViewProductsButton) {
            Intent intent = new Intent(MainActivity.this, ProductsActivity.class);
            startActivity(intent);
        }
        if (v == mLoginButton) {
            Intent intent = new Intent(MainActivity.this, ProductsActivity.class);
            startActivity(intent);
            Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
        }
        if(v == mSignUpButton) {
            Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}