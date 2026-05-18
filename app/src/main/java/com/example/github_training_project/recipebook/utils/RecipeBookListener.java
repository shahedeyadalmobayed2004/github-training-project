package com.example.github_training_project.recipebook.utils;


import com.example.github_training_project.recipebook.models.RecipeModel;

public interface RecipeBookListener {
    void onSearchRequested(String query, String category);
    void onRecipeClick(RecipeModel recipe);

}
