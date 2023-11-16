package com.example.gweiland_task.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gweiland_task.R;
import com.example.gweiland_task.databinding.FragmentExchangeBinding;

public class ExchangeFragment extends Fragment {

    private FragmentExchangeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentExchangeBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();



        return view;
    }
}