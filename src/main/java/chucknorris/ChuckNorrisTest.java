package chucknorris;

import org.junit.Assert;
import org.junit.Test;

public class ChuckNorrisTest {

    @Test
    public void chuckNorrisShouldReturn0_0_00_0000_0_00IfReceiveC() {
        //Given
        ChuckNorris chuckNorris = new ChuckNorris("C", 1);
        String expected = "0 0";
        //When
        chuckNorris.convertBinaryStringToUnaryString();
        //Then
        Assert.assertEquals(expected, chuckNorris.getOutput());
    }
}