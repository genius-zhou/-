package com.example.myapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    private EditText etUsernameProfile;
    private EditText etEmailProfile;
    private Button btnSaveProfile;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        etUsernameProfile = view.findViewById(R.id.et_username_profile);
        etEmailProfile = view.findViewById(R.id.et_email_profile);
        btnSaveProfile = view.findViewById(R.id.btn_save_profile);

        btnSaveProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 处理保存逻辑
                String username = etUsernameProfile.getText().toString();
                String email = etEmailProfile.getText().toString();
                // 这里可以添加保存逻辑
            }
        });

        return view;
    }
}