package com.example.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // 获取控件
        EditText etUsername = findViewById(R.id.et_username_register);
        EditText etEmail = findViewById(R.id.et_email_register);
        EditText etPassword = findViewById(R.id.et_password_register);
        Button btnRegisterSubmit = findViewById(R.id.btn_register_submit);

        // 设置注册按钮点击事件
        btnRegisterSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 处理注册逻辑
                String username = etUsername.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                // 这里可以添加注册逻辑
            }
        });
    }
}