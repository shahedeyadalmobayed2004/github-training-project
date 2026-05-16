package com.example.github_training_project.recipebook.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.github_training_project.databinding.ActivityRegisterBinding;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}