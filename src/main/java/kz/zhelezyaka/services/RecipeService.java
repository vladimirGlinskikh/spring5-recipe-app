package kz.zhelezyaka.services;

import kz.zhelezyaka.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
