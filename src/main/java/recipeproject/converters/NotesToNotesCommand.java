package recipeproject.converters;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import recipeproject.commands.NotesCommand;
import recipeproject.domain.Notes;

@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommand> {

    @Override
    public synchronized NotesCommand convert(Notes source) {
        if (source == null)
            return null;

        final NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(source.getId());
        notesCommand.setRecipeNotes(source.getRecipeNotes());
        return notesCommand;
    }

}
