package recipeproject.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import recipeproject.commands.UnitOfMeasureCommand;
import recipeproject.domain.UnitOfMeasure;

@Component
public class UnitOfMeasureToUnitOfMeasureCommand implements Converter<UnitOfMeasure, UnitOfMeasureCommand> {

    @Override
    public synchronized UnitOfMeasureCommand convert(UnitOfMeasure uom) {
        if(uom == null)
            return null;

        final UnitOfMeasureCommand command = new UnitOfMeasureCommand();
        command.setId(uom.getId());
        command.setDescription(uom.getUom());
        return command;
    }

}
