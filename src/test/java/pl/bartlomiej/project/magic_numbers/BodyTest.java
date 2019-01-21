package pl.bartlomiej.project.magic_numbers;


import org.junit.Assert;
import org.junit.Test;
import pl.bartlomiej.project.magic_numbers.exception.ExtensionNotSupportedException;

import java.io.IOException;

public class BodyTest {

    @Test
    public void checkFileType() throws IOException, ExtensionNotSupportedException {


        Assert.assertEquals("Extension is correct", Body.checkFileType("resources/testIsGif.gif"));
        Assert.assertEquals("Extension is correct", Body.checkFileType("resources/testIsJpg.jpg"));
        Assert.assertEquals("Extension is correct", Body.checkFileType("resources/testIsTxt.txt"));
        Assert.assertEquals("Extension is not correct", Body.checkFileType("resources/testNotJpgIsGif.jpg"));
        Assert.assertEquals("Extension is not correct", Body.checkFileType("resources/testNotJpgIsTxt.jpg"));
        Assert.assertEquals("Extension is not correct", Body.checkFileType("resources/testNotTxtIsJpg.txt"));

        Assert.assertEquals("Extension is correct", Body.checkFileType("resources/testIsPdf.pdf"));

        }

    }
