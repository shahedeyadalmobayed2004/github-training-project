package com.example.github_training_project.recipebook.utils;

import android.app.Application;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CloudinaryHelper.init(getApplicationContext());
    }
}