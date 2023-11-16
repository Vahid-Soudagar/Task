package com.example.gweiland_task.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import android.view.View;
import com.example.gweiland_task.R;
import com.example.gweiland_task.R.id;
import com.example.gweiland_task.fragments.CryptoCurrencyFragment;
import com.example.gweiland_task.fragments.NPTFragment;
import android.view.LayoutInflater;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;
    public ViewPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new CryptoCurrencyFragment();
        } else {
            return new NPTFragment();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
//        if (position == 0) {
//            return "Cryptocurrency";
//        } else {
//            return "NPT";
//        }
        return null;
    }


//    TODO - change the color and size of unselected tab
    public View getTabView(int position) {
        // Create a custom tab view with the desired font color and size
        View view = LayoutInflater.from(context).inflate(R.layout.custom_tab_heading, null);
        TextView tabTitle = view.findViewById(id.tab_title);

        if (position == 0) {
            tabTitle.setText(R.string.cryptocurrency);
        } else {
            tabTitle.setText(R.string.nft);
        }
        tabTitle.setTextSize(24);
        return view;
    }
}
