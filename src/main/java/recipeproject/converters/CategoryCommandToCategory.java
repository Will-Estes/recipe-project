package recipeproject.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import recipeproject.commands.CategoryCommand;
import recipeproject.domain.Category;

@Component
public class CategoryCommandToCategory implements Converter<CategoryCommand, Category> {


    @Override
    public synchronized Category convert(CategoryCommand categoryCommand) {
        if(categoryCommand == null)
            return null;

        final Category category = new Category();
        category.setId(categoryCommand.getId());
        category.setDescription(categoryCommand.getDescription());
        return category;
    }
}
