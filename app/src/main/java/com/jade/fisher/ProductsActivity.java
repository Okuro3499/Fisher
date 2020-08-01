package com.jade.fisher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ProductsActivity extends AppCompatActivity {
    private Button mSearchButton;
    private EditText mSearchEditText;
    private ListView mListView;
    private TextView mSearchTextView;
    private String[] fishes = new String[] {"Guppy", "Neon Tetra", "Zebra fish", "Tiger barb", "Green swordtail", "Clown loach", "Red lionfish", "Bala shark",
                                            "Pao abei", "Gold Fish"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        mListView = (ListView) findViewById(R.id.listView);
        mSearchEditText = (EditText) findViewById(R.id.searchEditText);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, fishes);
        mListView.setAdapter(adapter);

        mSearchButton = (Button) findViewById(R.id.searchButton);
        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search = mSearchEditText.getText().toString();
                Intent intent = getIntent();
                intent.putExtra("search", search);
                Toast.makeText(ProductsActivity.this, search, Toast.LENGTH_LONG).show();

                mSearchTextView = (TextView) findViewById(R.id.searchTextView);
                mSearchTextView.setText("Products found: " + search);
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String fish = ((TextView)view).getText().toString();
            Toast.makeText(ProductsActivity.this, fish, Toast.LENGTH_LONG).show();
        }
    });
    }

}
