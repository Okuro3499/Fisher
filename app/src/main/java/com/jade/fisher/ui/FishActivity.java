package com.jade.fisher.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.jade.fisher.network.FishWatchApi;
import com.jade.fisher.R;
import com.jade.fisher.models.Specie;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.jade.fisher.Constants.FISHWATCH_BASE_URL;

public class FishActivity extends AppCompatActivity {
    private static final String TAG = FishActivity.class.getSimpleName();
    @BindView(R.id.searchButton) Button mSearchButton;
    @BindView(R.id.searchEditText) EditText mSearchEditText;
    @BindView(R.id.listView) ListView mListView;
    @BindView(R.id.searchTextView) TextView mSearchTextView;
    @BindView(R.id.errorTextView) TextView mErrorTextView;
    @BindView(R.id.progressBar) ProgressBar mProgressBar;

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener mAuthListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        ButterKnife.bind(this);

        mAuth = FirebaseAuth.getInstance();
        mAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    getSupportActionBar().setTitle("Welcome, " + user.getDisplayName() + "!");
                } else {

                }
            }
        };

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(FISHWATCH_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        FishWatchApi fishWatchApi = retrofit.create(FishWatchApi.class);

        Call<List<Specie>> call = fishWatchApi.getSpecies();
        call.enqueue(new Callback<List<Specie>>() {
            @Override
            public void onResponse(Call<List<Specie>> call, Response<List<Specie>> response) {

                hideProgressBar();

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
                Log.e(TAG, "onFailure: ", t);
                hideProgressBar();
                showFailureMessage();
            }
        });

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String search = mSearchEditText.getText().toString();
                Intent intent = getIntent();
                intent.putExtra("search", search);
                Toast.makeText(FishActivity.this, search, Toast.LENGTH_LONG).show();

                showSpecie();

            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String fish = ((TextView) view).getText().toString();
                Toast.makeText(FishActivity.this, fish, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {
            logout();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void logout() {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(FishActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void onStart() {
        super.onStart();
        mAuth.addAuthStateListener(mAuthListener);
    }

    @Override
    public void onStop() {
        super.onStop();
        if (mAuthListener != null) {
            mAuth.removeAuthStateListener(mAuthListener);
        }
    }

    private void showFailureMessage() {
        mErrorTextView.setText("Something went wrong. Please check your Internet connection and try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showUnsuccessfulMessage() {
        mErrorTextView.setText("Something went wrong. Please try again later");
        mErrorTextView.setVisibility(View.VISIBLE);
    }

    private void showSpecie() {
        mListView.setVisibility(View.VISIBLE);
        mSearchTextView.setVisibility(View.VISIBLE);
    }

    private void hideProgressBar() {
        mProgressBar.setVisibility(View.GONE);
    }

}

