package com.jade.fisher.ui;

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
import com.jade.fisher.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText editTextFirstName, editTextLastName, editTextNewEmail;

    @BindView(R.id.createAccountButton) Button mCreateAccountButton;

    private AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
        editTextLastName = (EditText) findViewById(R.id.editTextLastName);
        editTextNewEmail = (EditText) findViewById(R.id.editTextNewEmail);

        mCreateAccountButton = (Button) findViewById(R.id.createAccountButton);

        mCreateAccountButton.setOnClickListener(this);

        awesomeValidation.addValidation(this, R.id.editTextFirstName, "^[A-Za-z\\\\s]{1,}[\\\\.]{0,1}[A-Za-z\\\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.editTextLastName, "^[A-Za-z\\\\s]{1,}[\\\\.]{0,1}[A-Za-z\\\\s]{0,}$", R.string.nameerror);
        awesomeValidation.addValidation(this, R.id.editTextNewEmail, Patterns.EMAIL_ADDRESS, R.string.emailerror);

    }

    @Override
    public void onClick(View v) {
        if (v == mCreateAccountButton) {
            if (awesomeValidation.validate()){
                Intent intent = new Intent(SignUpActivity.this, ProductsActivity.class);
                startActivity(intent);
                Toast.makeText(SignUpActivity.this, "Account created successfully", Toast.LENGTH_LONG).show();
            }
        }
    }
}