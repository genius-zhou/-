package com.example.myapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SettingsFragment extends Fragment {

    private Switch swNotification;
    private Switch swDarkMode;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        swNotification = view.findViewById(R.id.sw_notification);
        swDarkMode = view.findViewById(R.id.sw_dark_mode);

        swNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 处理通知开关逻辑
            }
        });

        swDarkMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 处理深色模式开关逻辑
            }
        });

        return view;
    }
}