package pl.bartlomiej.project.magic_numbers.available_file_extensions;

import pl.bartlomiej.project.magic_numbers.validators.StandardFileTypeValidator;

public class PdfFileValidator extends StandardFileTypeValidator

{

    @Override
    public String Extension() {
        return "pdf";
    }

    @Override
    public String[] ExpectedValues() {
        return new String[]{"25", "50", "44", "46"};


    }
}
