package pl.bartlomiej.project.magic_numbers.validators;

import java.util.ArrayList;

public class FileTypeValidatorHelper {

    public static String[] ToHexArray(byte[] bytes) {
        ArrayList<String> hexList = new ArrayList<>();

        int counter = 0;
        for(byte b : bytes) {
            hexList.add(String.format("%02X", b));
            counter++;
            if(counter > 100) {
                break;
            }
        }

        return  hexList.toArray(new String[hexList.size()]);
    }

}
