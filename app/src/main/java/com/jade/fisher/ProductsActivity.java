package com.jade.fisher;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ProductsActivity extends AppCompatActivity {
    @BindView(R.id.searchButton) Button mSearchButton;
    @BindView(R.id.searchEditText) EditText mSearchEditText;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.searchTextView) TextView mSearchTextView;
    private String[] fishes = new String[]{"Guppy", "Neon Tetra", "Zebra fish", "Tiger barb", "Green swordtail", "Clown loach", "Red lionfish", "Bala shark",
            "Pao abei", "Gold Fish"};
    private String[] age = new String[]{"larva", "juvenile", "adult", "yolk sac larva", "juvenile", "larva", "adult", "yolk sac larva", "adult", "adult"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        ButterKnife.bind(this);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.fishwatch.gov/api/species/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        FishWatchApi fishWatchApi = retrofit.create(FishWatchApi.class);

        Call<List<Specie>> call = fishWatchApi.getSpecies();
        call.enqueue(new Callback<List<Specie>>() {
            @Override
            public void onResponse(Call<List<Specie>> call, Response<List<Specie>> response) {
                if (!response.isSuccessful()) {
                    mSearchTextView.setText("Code: " + response.code());
                    return;
                }
                List<Specie> species = response.body();

                for (Specie specie : species) {
                    String content = "";
                    content += "Species Name: " + specie.getSpeciesName() + "\n";
                    content += "Scientific Name: " + specie.getScientificName() + "\n";
                    content += "Health Benefits: " + specie.getHealthBenefits() + "\n";
                    content += "Physical Description: " + specie.getPhysicalDescription() + "\n\n";

                    mSearchTextView.append(content);
                }
            }

            @Override
            public void onFailure(Call<List<Specie>> call, Throwable t) {
                mSearchTextView.setText(t.getMessage());
            }
        });

        ProductsArrayAdapter adapter = new ProductsArrayAdapter(this, android.R.layout.simple_list_item_1, fishes, age);
        mListView.setAdapter(adapter);

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search = mSearchEditText.getText().toString();
                Intent intent = getIntent();
                intent.putExtra("search", search);
                Toast.makeText(ProductsActivity.this, search, Toast.LENGTH_LONG).show();

                mSearchTextView.setText("Products found: " + search);
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String fish = ((TextView) view).getText().toString();
                Toast.makeText(ProductsActivity.this, fish, Toast.LENGTH_LONG).show();
            }
        });
    }
}

