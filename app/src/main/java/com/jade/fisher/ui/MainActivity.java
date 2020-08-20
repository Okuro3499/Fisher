package com.jade.fisher.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.jade.fisher.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.passwordLoginButton) Button mPasswordLoginButton;
    @BindView(R.id.editTextEmail) EditText mEditTextEmail;
    @BindView(R.id.editTextPassword) EditText mEditTextPassword;
    @BindView(R.id.registerTextView) TextView mRegisterTextView;
    @BindView(R.id.viewProductsButton)Button mViewProductsButton;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mAuth = FirebaseAuth.getInstance();
        mPasswordLoginButton.setOnClickListener(this);
        mRegisterTextView.setOnClickListener(this);
        mViewProductsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == mViewProductsButton) {
            Intent intent = new Intent(MainActivity.this, FishActivity.class);
            startActivity(intent);
        }
        if (view == mRegisterTextView) {
           Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
           startActivity(intent);
           finish();
        }
        if(view == mPasswordLoginButton) {
            loginWithPassword();
        }
    }
}

//Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();