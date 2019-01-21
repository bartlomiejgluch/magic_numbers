package pl.bartlomiej.project.magic_numbers.available_file_extensions;

import pl.bartlomiej.project.magic_numbers.validators.IFileTypeValidator;

public class TxtFileTypeValidator implements IFileTypeValidator {

    @Override
    public String Extension() {
        return "txt";
    }

    @Override
    public boolean Validate(String[] hexArray) {
        return true;
    }


}
