package pl.bartlomiej.project.magic_numbers.validators;

public abstract class StandardFileTypeValidator implements IFileTypeValidator {

    public abstract String [] ExpectedValues();

    @Override
    public boolean Validate(String[] hexArray) {
        String[] expectedValuesArray = this.ExpectedValues();

        if(hexArray.length < expectedValuesArray.length) {
            return false;
        }

        for (int i = 0; i < expectedValuesArray.length; i++) {
            if (expectedValuesArray[i].equalsIgnoreCase(hexArray[i]) == false) {
                return false;
            }
        }

        return true;
    }


}
