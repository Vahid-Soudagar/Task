package com.example.gweiland_task;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.example.gweiland_task.databinding.ActivityMainBinding;
import com.example.gweiland_task.fragments.ExchangeFragment;
import com.example.gweiland_task.fragments.LaunchpadFragment;
import com.example.gweiland_task.fragments.ShopFragment;
import com.example.gweiland_task.fragments.WalletFragment;
import com.example.gweiland_task.utils.Functions;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.bottom_navigation_shop) {
                    item.setEnabled(true);
                    Functions.openFragmentWithoutBackStack(MainActivity.this, new ShopFragment());
                    return true;
                } else if (item.getItemId() == R.id.bottom_navigation_exchange) {
                    item.setEnabled(true);
                    Functions.openFragmentWithoutBackStack(MainActivity.this, new ExchangeFragment());
                    return true;
                } else if (item.getItemId() == R.id.bottom_navigation_launchpad) {
                    item.setEnabled(true);
                    Functions.openFragmentWithoutBackStack(MainActivity.this, new LaunchpadFragment());
                    return true;
                } else if (item.getItemId() == R.id.bottom_navigation_wallet) {
                    item.setEnabled(true);
                    Functions.openFragmentWithoutBackStack(MainActivity.this, new WalletFragment());
                    return true;
                }
                return false;
            }
        });

    }


}