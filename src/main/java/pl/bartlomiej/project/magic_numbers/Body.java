package pl.bartlomiej.project.magic_numbers;

import pl.bartlomiej.project.magic_numbers.available_file_extensions.FileTypeValidatorManager;
import pl.bartlomiej.project.magic_numbers.exception.ExtensionNotSupportedException;
import pl.bartlomiej.project.magic_numbers.validators.FileTypeValidatorHelper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Body {

    public static String checkFileType(String filePath) throws IOException, ExtensionNotSupportedException {
        String extension = GetExtension(filePath);

        byte[] bytes = Files.readAllBytes(new File(filePath).toPath());

        String[] hexList = FileTypeValidatorHelper.ToHexArray(bytes);

        FileTypeValidatorManager manager = new FileTypeValidatorManager();
        if (manager.IsExtensionSupported(extension) == false) {
            throw new ExtensionNotSupportedException();
        }

        String actualExtension = manager.GetFileType(hexList);

        boolean isOriginalExtensionCorrect = extension.equalsIgnoreCase(actualExtension);

        String solution;

        if (isOriginalExtensionCorrect) {

            System.out.println("Extension is correct");
            solution = "Extension is correct";
            return solution;
        } else {
            System.out.println(String.format("Extension of file is %s, while actually really it's %s", extension, actualExtension));
            return solution = "Extension is not correct";
        }
    }


    public static String GetExtension(String fileName) {
        String[] splitted = fileName.split("[.]");

        if (splitted.length == 0) {
            return "";
        }

        return splitted[splitted.length - 1];
    }


}
