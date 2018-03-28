package recipeproject.repositories;

import org.springframework.data.repository.CrudRepository;
import recipeproject.domain.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
