package kz.zhelezyaka.repositories;

import kz.zhelezyaka.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
