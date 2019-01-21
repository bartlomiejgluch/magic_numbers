package pl.bartlomiej.project.magic_numbers.available_file_extensions;

import pl.bartlomiej.project.magic_numbers.validators.StandardFileTypeValidator;

public class GifFileValidator extends StandardFileTypeValidator {

    @Override
    public String Extension() {
        return "gif";
    }

    @Override
    public String[] ExpectedValues() {
        return new String[] {"47", "49", "46", "38"};
    }


}
