package com.jade.fisher.network;

import com.jade.fisher.models.Specie;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FishWatchApi {
    @GET("species")
    Call<List<Specie>> getSpecies();
}
