package com.example.github_training_project.recipebook.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.auth.FirebaseAuth;
import androidx.appcompat.app.AppCompatActivity;
import com.example.github_training_project.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {

    ActivityWelcomeBinding binding;
    FirebaseAuth auth;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityWelcomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sharedPreferences = getSharedPreferences("loginPrefs", MODE_PRIVATE);

        if (getSupportActionBar() != null) getSupportActionBar().hide();

        auth = FirebaseAuth.getInstance();
        boolean remembered = sharedPreferences.contains("email") && sharedPreferences.contains("password");
        if ( remembered) {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
            return;
        }
        binding.getStartedButton.setOnClickListener(v -> {
            Intent intent = new Intent(WelcomeActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });
    }
}