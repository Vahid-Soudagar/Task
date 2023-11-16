package com.example.gweiland_task.utils;

import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.gweiland_task.R;

public class Functions {

    public static void openFragmentWithoutBackStack(Activity activity, Fragment fragment) {
        if (activity == null || fragment == null) {
            return;
        }

        FragmentManager fragmentManager = ((AppCompatActivity) activity).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the current fragment with the new one
        fragmentTransaction.replace(R.id.frame_layout, fragment);

        // Commit the transaction
        fragmentTransaction.commit();
    }
}
