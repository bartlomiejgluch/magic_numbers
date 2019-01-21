package pl.bartlomiej.project.magic_numbers.available_file_extensions;

import pl.bartlomiej.project.magic_numbers.exception.ExtensionNotSupportedException;
import pl.bartlomiej.project.magic_numbers.validators.IFileTypeValidator;

import java.util.ArrayList;

public class FileTypeValidatorManager {

    ArrayList<IFileTypeValidator> validators;

    public FileTypeValidatorManager(){
        validators = new ArrayList<>();
        validators.add(new JpegFileValidator());
        validators.add(new GifFileValidator());
        validators.add(new PdfFileValidator());

        validators.add(new TxtFileTypeValidator());

    }

    public boolean IsExtensionSupported(String extension) {
        for (IFileTypeValidator validator : validators) {
            if(validator.Extension().equalsIgnoreCase(extension)){
                return  true;
            }
        }

        return false;
    }

    public String GetFileType(String[] hexArray) throws ExtensionNotSupportedException {

        for (IFileTypeValidator validator : validators) {
            if(validator.Validate(hexArray)) {
                return validator.Extension();
            }
        }

        throw new ExtensionNotSupportedException();
    }

}
