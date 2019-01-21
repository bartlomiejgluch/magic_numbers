package pl.bartlomiej.project.magic_numbers;

import pl.bartlomiej.project.magic_numbers.available_file_extensions.FileTypeValidatorManager;
import pl.bartlomiej.project.magic_numbers.exception.ExtensionNotSupportedException;
import pl.bartlomiej.project.magic_numbers.validators.FileTypeValidatorHelper;

import java.io.*;
import java.nio.file.Files;

public class App {

    public static void main(String[] args) throws IOException, ExtensionNotSupportedException {


        String filePath = "resources/testNotJpgIsTxt.jpg";

        Body.checkFileType(filePath);

    }
}




