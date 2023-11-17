package com.example.gweiland_task.webservices;

import com.example.gweiland_task.models.ListingResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("v1/cryptocurrency/listings/latest")
    Call<ListingResponse> getCryptoListingLatest(
        @Query("start") int start,
        @Query("limit") int limit,
        @Query("sort") String sort,
        @Query("cryptocurrency_type") String cryptocurrencyType,
        @Query("tag") String tag
    );


}
