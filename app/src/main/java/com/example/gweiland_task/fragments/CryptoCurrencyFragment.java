package com.example.gweiland_task.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gweiland_task.databinding.FragmentCryptoCurrencyBinding;
import com.example.gweiland_task.models.ListingResponse;
import com.example.gweiland_task.webservices.ApiInterface;
import com.example.gweiland_task.webservices.ServiceGenerator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CryptoCurrencyFragment extends Fragment {

    private final String TAG = "keepTag";
    private FragmentCryptoCurrencyBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCryptoCurrencyBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        int start = 1;
        int limit = 100;
        String sort = "market_cap";
        String cryptocurrencyType = "all";
        String tag = "all";
        getLatestListings(start, limit, sort, cryptocurrencyType, tag);
        return view;
    }

    private void getLatestListings(int start, int limit, String sort, String cryptoCurrencyType, String tag) {
        ApiInterface apiInterface = ServiceGenerator.createService(ApiInterface.class);
        Call<ListingResponse> call = apiInterface.getCryptoListingLatest(start, limit, sort, cryptoCurrencyType, tag);
        call.enqueue(new Callback<ListingResponse>() {
            @Override
            public void onResponse(Call<ListingResponse> call, Response<ListingResponse> response) {
                if (response.isSuccessful()) {
                    Log.d(TAG, response.body().toString());
                } else {
                    Log.e(TAG, response.body()+"" +
                            " "+response.message());
                }
            }

            @Override
            public void onFailure(Call<ListingResponse> call, Throwable t) {
                Log.e(TAG, t.getMessage());
            }
        });
    }
}