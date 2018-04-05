package recipeproject.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import recipeproject.commands.CategoryCommand;
import recipeproject.domain.Category;

@Component
public class CategoryToCategoryCommand implements Converter<Category, CategoryCommand> {

    @Override
    public synchronized CategoryCommand convert(Category category) {
        if(category == null)
            return null;

        final CategoryCommand categoryCommand = new CategoryCommand();
        categoryCommand.setId(category.getId());
        categoryCommand.setDescription(category.getDescription());

        return categoryCommand;
    }
}
