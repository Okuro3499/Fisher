package com.jade.fisher;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FishWatchApi {
    @GET("species")
    Call<List<Specie>> getSpecies();
}
