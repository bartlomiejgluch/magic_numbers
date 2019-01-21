package pl.bartlomiej.project.magic_numbers.available_file_extensions;

import pl.bartlomiej.project.magic_numbers.validators.StandardFileTypeValidator;

public class JpegFileValidator extends StandardFileTypeValidator {

    @Override
    public String Extension() {
        return "jpg";
    }

    @Override
    public String[] ExpectedValues() {
        return new String[]{"FF", "D8"};


    }
}
