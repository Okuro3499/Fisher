package com.jade.fisher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProductsActivity extends AppCompatActivity {
    public static final String TAG = ProductsActivity.class.getSimpleName();
    private Button mSearchButton;
    private EditText mSearchEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        mSearchEditText = (EditText) findViewById(R.id.searchEditText);
        mSearchButton = (Button) findViewById(R.id.searchButton);
        mSearchButton.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String search = mSearchEditText.getText().toString();
                Log.d(TAG, search);
                Toast.makeText(ProductsActivity.this, search, Toast.LENGTH_LONG).show();
            }
        });
    }
}