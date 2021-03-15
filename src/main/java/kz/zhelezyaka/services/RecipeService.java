package kz.zhelezyaka.services;

import kz.zhelezyaka.commands.RecipeCommand;
import kz.zhelezyaka.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);
}
