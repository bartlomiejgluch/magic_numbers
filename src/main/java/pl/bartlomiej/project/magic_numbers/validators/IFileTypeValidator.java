package pl.bartlomiej.project.magic_numbers.validators;

public interface IFileTypeValidator {

    String Extension();
    boolean Validate(String[] hexArray);


}
