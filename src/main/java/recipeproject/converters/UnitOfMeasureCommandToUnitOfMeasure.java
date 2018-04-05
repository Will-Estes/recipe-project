package recipeproject.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import recipeproject.commands.UnitOfMeasureCommand;
import recipeproject.domain.UnitOfMeasure;

@Component
public class UnitOfMeasureCommandToUnitOfMeasure implements Converter<UnitOfMeasureCommand, UnitOfMeasure> {

    @Override
    public synchronized UnitOfMeasure convert(UnitOfMeasureCommand unitOfMeasureCommand) {
        if(unitOfMeasureCommand == null)
            return null;

        final UnitOfMeasure uom = new UnitOfMeasure();
        uom.setId(unitOfMeasureCommand.getId());
        uom.setUom(unitOfMeasureCommand.getDescription());
        return uom;
    }

}
