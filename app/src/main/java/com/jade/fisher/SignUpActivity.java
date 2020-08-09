package com.jade.fisher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.createAccountButton) Button mCreateAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);

        mCreateAccountButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == mCreateAccountButton) {
            Intent intent = new Intent(SignUpActivity.this, ProductsActivity.class);
            startActivity(intent);
            Toast.makeText(SignUpActivity.this, "Account created successfully", Toast.LENGTH_LONG).show();
        }
    }
}